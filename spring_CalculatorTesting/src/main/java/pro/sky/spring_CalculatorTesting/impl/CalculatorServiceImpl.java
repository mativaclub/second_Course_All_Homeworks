package pro.sky.spring_CalculatorTesting.impl;

import org.springframework.stereotype.Service;
import pro.sky.spring_CalculatorTesting.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    public String welcome() {

        return "Hello Calculator";
    }

    public String plus(Integer num1, Integer num2) {
        String result = check(num1, num2);
        if (result != null) {
            return result;
        }
        return  num1 + " + " + num2 + " = " + (num1 + num2);

    }

    public String minus(Integer num1, Integer num2) {
        String result = check(num1, num2);
        if (result != null) {
            return result;
        }
        return  num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(Integer num1, Integer num2) {
        String result = check(num1, num2);
        if (result != null) {
            return result;
        }
        return  num1 + " * " + num2 + " = " + num1 * num2;
    }

    public String divide(Integer num1, Integer num2) {
        String result = check(num1, num2);
        if (result != null) {
            return result;
        }
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return num1 + " / " + num2 + " = " + num1/num2;
    }

    public static String check(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Please enter a number";
        }
        return null;
    }
}
