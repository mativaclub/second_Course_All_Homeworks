//package pro.sky.springboot_calculator;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class CalculatorServiceImpl implements CalculatorService {
//
//
//    //1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".
//    public String welcome() {
//        return "<b>Hello Calculator</b>";
//    }
//
//
//    //2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат “5 + 5 = 10”.
//    public int plus(Integer num1, Integer num2) {
//        return (num1 + num2);
//    }
//
//
//    //3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть “5 − 5 = 0”.
//    public int minus(Integer num1, Integer num2) {
//        return (num1 - num2);
//    }
//
//
//    //4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть “5 * 5 = 25”.
//    public int multiply(Integer num1, Integer num2) {
//        return (num1 * num2);
//    }
//
//
//    //5. Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть “5 / 5 = 1”.
//    public int divide(Integer num1, Integer num2) {
//        return (num1 / num2);
//    }
//
//
//}
