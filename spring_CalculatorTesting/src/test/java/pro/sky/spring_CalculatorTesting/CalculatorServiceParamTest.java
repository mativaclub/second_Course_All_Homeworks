package pro.sky.spring_CalculatorTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.spring_CalculatorTesting.impl.CalculatorServiceImpl;

import java.util.stream.Stream;

import static pro.sky.spring_CalculatorTesting.CalculatorConstants.*;

@SpringBootTest
public class CalculatorServiceParamTest {

//Учтите, что может потребоваться написать 4 параметризованных теста и один или несколько методов
// с набором аргументов

    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();
    public static Stream<Arguments> testMinusWithParams() {
        return Stream.of(
                Arguments.of(THREE, ONE, ANSWER_MINUS),
                Arguments.of(null, ONE, INCORRECT_DATA),
                Arguments.of(THREE, null, INCORRECT_DATA),
                Arguments.of(null, null, INCORRECT_DATA)
        );
    }
    @ParameterizedTest
    @MethodSource("testMinusWithParams")
    public void parametrizedTest(Integer num1, Integer num2, String expected) {
        String actual = calculatorServiceImpl.minus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }


    public static Stream<Arguments> testSumWithParams() {
        return Stream.of(
                Arguments.of(null, null, INCORRECT_DATA),
                Arguments.of(THREE, null, INCORRECT_DATA),
                Arguments.of(null, THREE, INCORRECT_DATA),
                Arguments.of(ONE, THREE, ANSWER_SUM)
        );
    }
    @ParameterizedTest
    @MethodSource("testSumWithParams")
    public void parametrizedTestSum(Integer num1, Integer num2, String expected) {
        String actual = calculatorServiceImpl.plus(num1, num2);
        Assertions.assertEquals(expected, actual);
    }


    public static Stream<Arguments> testMultiplyWithParams() {
        return Stream.of(
                Arguments.of(null, null, INCORRECT_DATA),
                Arguments.of(TWO, null, INCORRECT_DATA),
                Arguments.of(null, TWO, INCORRECT_DATA),
                Arguments.of(TWO, TWO, ANSWER_MULTIPLY)
        );
    }
    @ParameterizedTest
    @MethodSource("testMultiplyWithParams")
    public void parametrizedTestMultiply(Integer num1, Integer num2, String expected) {
        String actual = calculatorServiceImpl.multiply(num1, num2);
        Assertions.assertEquals(expected, actual);
    }


    public static Stream<Arguments> testDivideWithParams() {
        return Stream.of(
                Arguments.of(null, null, INCORRECT_DATA),
                Arguments.of(FOUR, null, INCORRECT_DATA),
                Arguments.of(null, TWO, INCORRECT_DATA),
                Arguments.of(FOUR, TWO, ANSWER_DIVIDE)
        );
    }
    @ParameterizedTest
    @MethodSource("testDivideWithParams")
    public void parametrizedTestDivide(Integer num1, Integer num2, String expected) {
        String actual = calculatorServiceImpl.divide(num1, num2);
        Assertions.assertEquals(expected, actual);
    }



    public static Stream<Arguments> testDivideByZeroWithParams() {
        return Stream.of(
                Arguments.of(TWO, ZERO, IllegalArgumentException.class)
        );
    }
    @ParameterizedTest
    @MethodSource("testDivideByZeroWithParams")
    public void parametrizedTestDivideByZero(Integer num1, Integer num2, Class<Throwable> typeException) {
        Assertions.assertThrows(typeException, () -> calculatorServiceImpl.divide(num1, num2));
    }

}
