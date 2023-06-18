package org.example;

@Rest
public class ParametersController {

    private final ParametersService parametersService;

    public ParametersController(ParametersService parametersService) {
        this.parametersService = parametersService;
    }

    String login = "123456789a_";

    String password = "987654321b_";

    String confirmPassword = "987654321b_";

    @GetMapping(path = "/service")


    public String validateParametersInfo(@RequestParam("login") String login,


                                         @RequestParam("password") String password,


                                         @RequestParam("confirmPassword") String confirmPassword) throws WrongPasswordException, WrongLoginException {


        try {

            parametersService.validateParameters(login, password, confirmPassword);


        } catch (WrongLoginException e) {


            return "Неверно введен логин";


        } catch (WrongPasswordException e) {


            return "Неверно введен пароль либо пароль  не подтвержден";


        } finally {


            System.out.println("Игра окончена");


        }


        return " ";


    }

}