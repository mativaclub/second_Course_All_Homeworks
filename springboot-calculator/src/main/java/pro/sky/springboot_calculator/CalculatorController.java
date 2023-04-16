package pro.sky.springboot_calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
// /calculator повторяется. Рекомендуется использовать @RequestMapping на уровне контроллера.
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    //1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".
    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    //2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат “5 + 5 = 10”.
    public String plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        var result = check(num1, num2);
        if (result != null) {
            return result;
        } else {
            return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
        }
    }

    @GetMapping(path = "/minus")
    //3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть “5 − 5 = 0”.
    public String minus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        var result = check(num1, num2);
        if (result != null) {
            return result;
        } else {
            return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);}
    }

    //4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть “5 * 5 = 25”.
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        var result = check(num1, num2);
        if (result != null) {
            return result;
        }
            return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
        }



    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        var result = check(num1, num2);
        if (result != null) {
            return result;
        }
        if (num2 == 0) {
            return "Division by 0 is not possible";
        }
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }

    public static String check(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Please enter a number";
        }
        return null;
    }
//После получения от него результата контроллер должен сформировать строку и вернуть пользователю в браузер.

}


