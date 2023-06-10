package pro.sky.spring_CalculatorTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.spring_CalculatorTesting.impl.CalculatorServiceImpl;

import static pro.sky.spring_CalculatorTesting.CalculatorConstants.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    @Test
    void welcome() {
    }

    @Test
    void plusIfParameterIsEmpty() {
        String result = calculatorService.plus(null, null);
        Assertions.assertEquals(INCORRECT_DATA, result);
    }

    @Test
    void plusIfParameterIsSent() {
        String result = calculatorService.plus(ONE, THREE);
        Assertions.assertEquals(CalculatorConstants.ANSWER_SUM, result);
    }

    @Test
    void minusIfParameterIsSent() {
        String result = calculatorService.minus(THREE, ONE);
        Assertions.assertEquals(ANSWER_MINUS, result);
    }

    @Test
    void minusIfParameterIsEmpty() {
        String result = calculatorService.minus(null, ONE);
        Assertions.assertEquals(INCORRECT_DATA, result);
    }

    @Test
    void multiplyIfParameterIsSent() {
        String result = calculatorService.multiply(TWO, TWO);
        Assertions.assertEquals(ANSWER_MULTIPLY, result);
    }

    @Test
    void multiplyIfParameterIsEmpty() {
        String result = calculatorService.multiply(TWO, null);
        Assertions.assertEquals(INCORRECT_DATA, result);
    }

    @Test
    void divideIfArgumentIsZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(TWO, ZERO));
    }

    @Test
    void divideIfArgumentIsSent() {
       String result = calculatorService.divide(FOUR, TWO);
       Assertions.assertEquals(ANSWER_DIVIDE, result);
    }

    @Test
    void divideIfArgumentIsEmpty() {
        String result = calculatorService.divide(null, TWO);
        Assertions.assertEquals(INCORRECT_DATA, result);
    }

}