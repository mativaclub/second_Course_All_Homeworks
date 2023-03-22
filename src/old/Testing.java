package old;

public class Testing {

//    @@ -1,10 +1,10 @@
//package com.calculatortesting.calculatortesting.service;
//public interface CalculatorService {
//
//    String welcome();
//
//    Integer plus(int num1, int num2);
//    int plus(int num1, int num2);
//
//    int minus(int num1, int num2);
//
//    int multiply(int num1, int num2);
//    int divide(int num1, int num2);
//}
//  2
//...main/java/com/calculatortesting/calculatortesting/service/impl/CalculatorServiceImpl.java
//@@ -1,18 +1,18 @@
//package com.calculatortesting.calculatortesting.service.impl;
//import com.calculatortesting.calculatortesting.exceptions.DivideByZeroException;
//import com.calculatortesting.calculatortesting.service.CalculatorService;
//import org.springframework.stereotype.Service;
//@Service
//public class CalculatorServiceImpl implements CalculatorService {
//    public String welcome() {
//        return "Welcome to Calculator";
//    }
//
//    @Override
//    public Integer plus(int num1, int num2) {
//    public int plus(int num1, int num2) {
//        return (num1 + num2);
//    }
//
// 14
//...g/CalculatorServiceImplParameterTest.java → ...g/CalculatorServiceImplParameterTest.java
//@@ -1,21 +1,23 @@
//package com.calculatortesting.calculatortesting;
//import com.calculatortesting.calculatortesting.service.impl.CalculatorServiceImpl;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import java.util.stream.Stream;
//
//import static com.calculatortesting.calculatortesting.CalculatorServiceImplTestConstants.ONE;
//import static com.calculatortesting.calculatortesting.CalculatorServiceImplTestConstants.TWO;
//import static com.calculatortesting.calculatortesting.CalculatorServiceImplTestConstants.*;
//import static com.calculatortesting.calculatortesting.CalculatorServiceImplTestConstants.FOUR;
//import static javax.swing.plaf.synth.Region.TREE;
//import static org.assertj.core.internal.bytebuddy.implementation.bytecode.StackSize.ZERO;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class CalculatorServiceImplParameterTest {
//
//    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
//
//
//    @MethodSource("provideArgumentsForCalculatorTests")
//    @ParameterizedTest
//    public void shouldReturnCorrectResultOfSummation(int num1, int num2) {
//        assertEquals(num1 + num2, out.plus(num1, num2));
//    }
//    @MethodSource("provideArgumentsForCalculatorTests")
//    @ParameterizedTest
//    public void shouldReturnCorrectResultOfSubtraction(int num1, int num2) {
//        assertEquals(num1 - num2, out.minus(num1, num2));
//    }
//    @MethodSource("provideArgumentsForCalculatorTests")
//    @ParameterizedTest
//    public void shouldReturnCorrectResultOfMultiplication(int num1, int num2) {
//        assertEquals(num1 * num2, out.multiply(num1, num2));
//    }
//    @MethodSource("provideArgumentsForCalculatorTests")
//    @ParameterizedTest
//    public void shouldReturnCorrectResultOfDivision(int num1, int num2) {
//        assertEquals(num1 / num2, out.divide(num1, num2));
//    }
//
//    public static Stream<Arguments> provideArgumentsForCalculatorTests() {
//        return Stream.of(
//                Arguments.of(0, ONE),
//                Arguments.of(0, TWO),
//                Arguments.of(THREE, ONE),
//                Arguments.of(ZERO, TWO),
//                Arguments.of(ONE, ONE),
//                Arguments.of(ONE, TWO),
//                Arguments.of(TWO, TWO)
//                Arguments.of(TWO, TWO),
//                Arguments.of(FOUR, TWO)
//        );
//    }
//
//}
// 0
//...tortesting/CalculatorServiceImplTest.java → ...tortesting/CalculatorServiceImplTest.java
//File renamed without changes.
// 2
//...g/CalculatorServiceImplTestConstants.java → ...g/CalculatorServiceImplTestConstants.java
//@@ -1,11 +1,13 @@
//package com.calculatortesting.calculatortesting;
//public class CalculatorServiceImplTestConstants {
//    public static final int ZERO = 0;
//    public static final int ONE = 1;
//    public static final int TWO = 2;
//    public static final int THREE = 3;
//
//    public static final int FOUR = 4;
//
//
//}
}
