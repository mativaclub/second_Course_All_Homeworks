package pro.sky.springboot_calculator.practicing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.springboot_calculator.practicing.exception.WrongLoginException;
import pro.sky.springboot_calculator.practicing.exception.WrongPasswordException;
import pro.sky.springboot_calculator.practicing.exception.service.ParametersService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ParametersController {

    List<Integer> num = new ArrayList<>(List.of(9, 2, 3));
    private final ParametersService parametersService;
    public ParametersController(ParametersService parametersService) {
        this.parametersService = parametersService;
    }
    String login = "123456789a_";
    String password = "987654321b_";
    String confirmPassword = "987654321b_";
    @GetMapping(path = "/service")

    public void validateParametersInfo(@RequestParam("login") String login,
                                         @RequestParam("password") String password,
                                         @RequestParam("confirmPassword") String confirmPassword)
            throws WrongPasswordException, WrongLoginException {
        try{
          parametersService.validateParameters(login,  password, confirmPassword);
        } catch (WrongLoginException e){
            throw new WrongLoginException("Неверно введен логин");
        } catch (WrongPasswordException e) {
            throw new WrongPasswordException("Неверно введен пароль либо пароль  не подтвержден");
        } finally {
            System.out.println("Игра окончена");
        }
    }

}
