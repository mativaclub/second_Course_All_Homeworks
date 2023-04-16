package practice;

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
////src/main/java/com/calculatortesting/calculatortesting/exceptions/DivideByZeroException.java
////Viewed
////@@ -0,0 +1,11 @@
////package com.calculatortesting.calculatortesting.exceptions;
////
////import org.springframework.http.HttpStatus;
////import org.springframework.web.bind.annotation.ResponseStatus;
////
////@ResponseStatus(HttpStatus.BAD_REQUEST)
////public class DivideByZeroException extends IllegalArgumentException{
////    public DivideByZeroException() {
////        super("Error when dividing by zero");
////    }
////}
////  8
////src/main/java/com/calculatortesting/calculatortesting/service/CalculatorService.java
////Viewed
////@@ -4,12 +4,12 @@ public interface CalculatorService {
////

    ////...main/java/com/calculatortesting/calculatortesting/service/impl/CalculatorServiceImpl.java
    ////Viewed
    ////@@ -1,5 +1,6 @@
    ////package com.calculatortesting.calculatortesting.service.impl;
    ////
    ////import com.calculatortesting.calculatortesting.exceptions.DivideByZeroException;
    ////import com.calculatortesting.calculatortesting.service.CalculatorService;
    ////import org.springframework.stereotype.Service;
    ////



    ////...test/java/com/calculatortesting/calculatortesting/CalculatorServiceImplParameterTest.java
    ////Viewed
    ////@@ -0,0 +1,56 @@
    ////package com.calculatortesting.calculatortesting;
    ////
    ////import com.calculatortesting.calculatortesting.service.impl.CalculatorServiceImpl;
    ////import org.junit.jupiter.params.ParameterizedTest;
    ////import org.junit.jupiter.params.provider.Arguments;
    ////import org.junit.jupiter.params.provider.MethodSource;
    ////
    ////import java.util.stream.Stream;
    ////
    ////import static com.calculatortesting.calculatortesting.CalculatorServiceImplTestConstants.*;
    ////import static com.calculatortesting.calculatortesting.CalculatorServiceImplTestConstants.FOUR;
    ////import static javax.swing.plaf.synth.Region.TREE;
    ////import static org.assertj.core.internal.bytebuddy.implementation.bytecode.StackSize.ZERO;
    ////import static org.junit.jupiter.api.Assertions.assertEquals;
    ////
    ////public class CalculatorServiceImplParameterTest {
    ////
    ////    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    ////
    ////
    ////    @MethodSource("provideArgumentsForCalculatorTests")
    ////    @ParameterizedTest
    ////    public void shouldReturnCorrectResultOfSummation(int num1, int num2) {
    ////        assertEquals(num1 + num2, out.plus(num1, num2));
    ////    }
    ////
    ////    @MethodSource("provideArgumentsForCalculatorTests")
    ////    @ParameterizedTest
    ////    public void shouldReturnCorrectResultOfSubtraction(int num1, int num2) {
    ////        assertEquals(num1 - num2, out.minus(num1, num2));
    ////    }
    ////
    ////    @MethodSource("provideArgumentsForCalculatorTests")
    ////    @ParameterizedTest
    ////    public void shouldReturnCorrectResultOfMultiplication(int num1, int num2) {
    ////        assertEquals(num1 * num2, out.multiply(num1, num2));
    ////    }
    ////
    ////    @MethodSource("provideArgumentsForCalculatorTests")
    ////    @ParameterizedTest
    ////    public void shouldReturnCorrectResultOfDivision(int num1, int num2) {
    ////        assertEquals(num1 / num2, out.divide(num1, num2));
    ////    }
    ////
    ////    public static Stream<Arguments> provideArgumentsForCalculatorTests() {
    ////        return Stream.of(
    ////                Arguments.of(THREE, ONE),
    ////                Arguments.of(ZERO, TWO),
    ////                Arguments.of(ONE, ONE),
    ////                Arguments.of(ONE, TWO),
    ////                Arguments.of(TWO, TWO),
    ////                Arguments.of(FOUR, TWO)
    ////        );
    ////    }
    ////
    ////}
    //// 70
    ////src/test/java/com/calculatortesting/calculatortesting/CalculatorServiceImplTest.java
    ////Viewed
    ////@@ -0,0 +1,70 @@
    ////package com.calculatortesting.calculatortesting;
    ////
    ////import com.calculatortesting.calculatortesting.exceptions.DivideByZeroException;
    ////import com.calculatortesting.calculatortesting.service.impl.CalculatorServiceImpl;
    ////import org.junit.jupiter.api.Test;
    ////
    ////import static com.calculatortesting.calculatortesting.CalculatorServiceImplTestConstants.*;
    ////import static org.junit.jupiter.api.Assertions.assertEquals;
    ////import static org.junit.jupiter.api.Assertions.assertThrows;
    ////
    ////class CalculatorServiceImplTest {
    ////
    ////    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    ////
    ////    @Test
    ////    public void shouldReturn3WhenPlus1and2() {
    ////        assertEquals(THREE, out.plus(ONE, TWO));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn2WhenPlus0and2() {
    ////        assertEquals(TWO, out.plus(ZERO, TWO));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn0WhenMinus2and2() {
    ////        assertEquals(ZERO, out.minus(TWO, TWO));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn1WhenMinus2and1() {
    ////        assertEquals(ONE, out.minus(TWO, ONE));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn1WhenMultiply1and1() {
    ////        assertEquals(ONE, out.multiply(ONE, ONE));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn2WhenMultiply2and1() {
    ////        assertEquals(TWO, out.multiply(TWO, ONE));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn1WhenDivide2and2() {
    ////        assertEquals(ONE, out.divide(TWO, TWO));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn2WhenDivide2and1() {
    ////        assertEquals(TWO, out.divide(TWO, ONE));
    ////    }
    ////
    ////    @Test
    ////    public void shouldThrowDivideByZeroExceptionWhenDivideBy0() {
    ////        assertThrows(DivideByZeroException.class, () -> out.divide(TWO, ZERO));
    ////    }
    ////
    ////
    ////
    ////
    ////}
    //// 13
    ////...test/java/com/calculatortesting/calculatortesting/CalculatorServiceImplTestConstants.java
    ////Viewed
    ////@@ -0,0 +1,13 @@
    ////package com.calculatortesting.calculatortesting;
    ////
    ////public class CalculatorServiceImplTestConstants {
    ////
    ////    public static final int ZERO = 0;
    ////    public static final int ONE = 1;
    ////    public static final int TWO = 2;
    ////    public static final int THREE = 3;
    ////
    ////    public static final int FOUR = 4;
    ////
    ////package pro.sky.skyprospringcalculator;
    ////import org.springframework.web.bind.annotation.GetMapping;
    ////import org.springframework.web.bind.annotation.RequestMapping;
    ////import org.springframework.web.bind.annotation.RequestParam;
    ////import org.springframework.web.bind.annotation.RestController;

    ////    }<?xml version="1.0" encoding="UTF-8"?>
    ////<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    ////	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    ////	<modelVersion>4.0.0</modelVersion>
    ////	<parent>
    ////		<groupId>org.springframework.boot</groupId>
    ////		<artifactId>spring-boot-starter-parent</artifactId>
    ////		<version>2.6.7</version>
    ////		<relativePath/> <!-- lookup parent from repository -->
    ////	</parent>
    ////	<groupId>com.calculator-testing</groupId>
    ////	<artifactId>calculatortesting</artifactId>
    ////	<version>0.0.1-SNAPSHOT</version>
    ////	<name>calculatortesting</name>
    ////	<description>Demo project for Spring Boot</description>
    ////	<properties>
    ////		<java.version>11</java.version>
    ////	</properties>
    ////	<dependencies>
    ////		<dependency>
    ////			<groupId>org.springframework.boot</groupId>
    ////			<artifactId>spring-boot-starter-web</artifactId>
    ////		</dependency>
    ////		<dependency>
    ////			<groupId>org.springframework.boot</groupId>
    ////			<artifactId>spring-boot-starter-test</artifactId>
    ////			<scope>test</scope>
    ////		</dependency>
    ////		<dependency>
    ////			<groupId>org.springframework.boot</groupId>
    ////			<artifactId>spring-boot-starter-test</artifactId>
    ////		</dependency>
    ////
    ////
    ////	</dependencies>
    ////
    ////	<build>
    ////		<plugins>
    ////			<plugin>
    ////				<groupId>org.springframework.boot</groupId>
    ////				<artifactId>spring-boot-maven-plugin</artifactId>
    ////			</plugin>
    ////		</plugins>
    ////	</build>
    ////</project>
    //// 15
    ////src/main/java/com/calculatortesting/calculatortesting/controller/CalculatorController.java
    ////Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
    ////Comment on this file
    ////@@ -1,52 +1,45 @@
    ////package com.calculatortesting.calculatortesting.controller;
    ////import com.calculatortesting.calculatortesting.service.CalculatorService;
    ////import org.springframework.web.bind.annotation.GetMapping;
    ////import org.springframework.web.bind.annotation.RequestMapping;
    ////import org.springframework.web.bind.annotation.RequestParam;
    ////import org.springframework.web.bind.annotation.RestController;

    ////src/main/java/com/calculatortesting/calculatortesting/exceptions/DivideByZeroException.java
    ////Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
    ////Comment on this file
    ////@@ -0,0 +1,11 @@
    ////package com.calculatortesting.calculatortesting.exceptions;
    ////
    ////import org.springframework.http.HttpStatus;
    ////import org.springframework.web.bind.annotation.ResponseStatus;
    ////
    ////@ResponseStatus(HttpStatus.BAD_REQUEST)
    ////public class DivideByZeroException extends IllegalArgumentException{
    ////    public DivideByZeroException() {
    ////        super("Error when dividing by zero");
    ////    }
    ////}
    //// 8
    ////src/main/java/com/calculatortesting/calculatortesting/service/CalculatorService.java
    ////Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
    ////Comment on this file
    ////@@ -1,15 +1,15 @@
    ////package com.calculatortesting.calculatortesting.service;

    ////...main/java/com/calculatortesting/calculatortesting/service/impl/CalculatorServiceImpl.java
    ////Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
    ////Comment on this file
    ////@@ -1,5 +1,6 @@
    ////package com.calculatortesting.calculatortesting.service.impl;
    ////
    ////import com.calculatortesting.calculatortesting.exceptions.DivideByZeroException;
    ////import com.calculatortesting.calculatortesting.service.CalculatorService;
    ////import org.springframework.stereotype.Service;

    ////...test/java/com/calculatortesting/calculatortesting/CalculatorServiceImplParameterTest.java
    ////Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
    ////Comment on this file
    ////@@ -0,0 +1,56 @@
    ////package com.calculatortesting.calculatortesting;
    ////
    ////import com.calculatortesting.calculatortesting.service.impl.CalculatorServiceImpl;
    ////import org.junit.jupiter.params.ParameterizedTest;
    ////import org.junit.jupiter.params.provider.Arguments;
    ////import org.junit.jupiter.params.provider.MethodSource;
    ////
    ////import java.util.stream.Stream;
    ////
    ////import static com.calculatortesting.calculatortesting.CalculatorServiceImplTestConstants.*;
    ////import static com.calculatortesting.calculatortesting.CalculatorServiceImplTestConstants.FOUR;
    ////import static javax.swing.plaf.synth.Region.TREE;
    ////import static org.assertj.core.internal.bytebuddy.implementation.bytecode.StackSize.ZERO;
    ////import static org.junit.jupiter.api.Assertions.assertEquals;
    ////
    ////public class CalculatorServiceImplParameterTest {
    ////
    ////    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    ////
    ////
    ////    @MethodSource("provideArgumentsForCalculatorTests")
    ////    @ParameterizedTest
    ////    public void shouldReturnCorrectResultOfSummation(int num1, int num2) {
    ////        assertEquals(num1 + num2, out.plus(num1, num2));
    ////    }
    ////
    ////    @MethodSource("provideArgumentsForCalculatorTests")
    ////    @ParameterizedTest
    ////    public void shouldReturnCorrectResultOfSubtraction(int num1, int num2) {
    ////        assertEquals(num1 - num2, out.minus(num1, num2));
    ////    }
    ////
    ////    @MethodSource("provideArgumentsForCalculatorTests")
    ////    @ParameterizedTest
    ////    public void shouldReturnCorrectResultOfMultiplication(int num1, int num2) {
    ////        assertEquals(num1 * num2, out.multiply(num1, num2));
    ////    }
    ////
    ////    @MethodSource("provideArgumentsForCalculatorTests")
    ////    @ParameterizedTest
    ////    public void shouldReturnCorrectResultOfDivision(int num1, int num2) {
    ////        assertEquals(num1 / num2, out.divide(num1, num2));
    ////    }
    ////
    ////    public static Stream<Arguments> provideArgumentsForCalculatorTests() {
    ////        return Stream.of(
    ////                Arguments.of(THREE, ONE),
    ////                Arguments.of(ZERO, TWO),
    ////                Arguments.of(ONE, ONE),
    ////                Arguments.of(ONE, TWO),
    ////                Arguments.of(TWO, TWO),
    ////                Arguments.of(FOUR, TWO)
    ////        );
    ////    }
    ////
    ////}
    //// 70
    ////src/test/java/com/calculatortesting/calculatortesting/CalculatorServiceImplTest.java
    ////Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
    ////Comment on this file
    ////@@ -0,0 +1,70 @@
    ////package com.calculatortesting.calculatortesting;
    ////
    ////import com.calculatortesting.calculatortesting.exceptions.DivideByZeroException;
    ////import com.calculatortesting.calculatortesting.service.impl.CalculatorServiceImpl;
    ////import org.junit.jupiter.api.Test;
    ////
    ////import static com.calculatortesting.calculatortesting.CalculatorServiceImplTestConstants.*;
    ////import static org.junit.jupiter.api.Assertions.assertEquals;
    ////import static org.junit.jupiter.api.Assertions.assertThrows;
    ////
    ////class CalculatorServiceImplTest {
    ////
    ////    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    ////
    ////    @Test
    ////    public void shouldReturn3WhenPlus1and2() {
    ////        assertEquals(THREE, out.plus(ONE, TWO));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn2WhenPlus0and2() {
    ////        assertEquals(TWO, out.plus(ZERO, TWO));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn0WhenMinus2and2() {
    ////        assertEquals(ZERO, out.minus(TWO, TWO));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn1WhenMinus2and1() {
    ////        assertEquals(ONE, out.minus(TWO, ONE));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn1WhenMultiply1and1() {
    ////        assertEquals(ONE, out.multiply(ONE, ONE));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn2WhenMultiply2and1() {
    ////        assertEquals(TWO, out.multiply(TWO, ONE));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn1WhenDivide2and2() {
    ////        assertEquals(ONE, out.divide(TWO, TWO));
    ////    }
    ////
    ////
    ////    @Test
    ////    public void shouldReturn2WhenDivide2and1() {
    ////        assertEquals(TWO, out.divide(TWO, ONE));
    ////    }
    ////
    ////    @Test
    ////    public void shouldThrowDivideByZeroExceptionWhenDivideBy0() {
    ////        assertThrows(DivideByZeroException.class, () -> out.divide(TWO, ZERO));
    ////    }
    //
    //
    ////...test/java/com/calculatortesting/calculatortesting/CalculatorServiceImplTestConstants.java
    ////Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
    ////Comment on this file
    ////@@ -0,0 +1,13 @@
    ////package com.calculatortesting.calculatortesting;
    ////
    ////public class CalculatorServiceImplTestConstants {
    ////
    ////    public static final int ZERO = 0;
    ////    public static final int ONE = 1;
    ////    public static final int TWO = 2;
    ////    public static final int THREE = 3;
    ////
    ////    public static final int FOUR = 4;
    ////}


//}//<?xml version="1.0" encoding="UTF-8"?>
////<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
////	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
////	<modelVersion>4.0.0</modelVersion>
////	<parent>
////		<groupId>org.springframework.boot</groupId>
////		<artifactId>spring-boot-starter-parent</artifactId>
////		<version>2.6.7</version>
////		<relativePath/> <!-- lookup parent from repository -->
////	</parent>
////	<groupId>com.calculator-testing</groupId>
////	<artifactId>calculatortesting</artifactId>
////	<version>0.0.1-SNAPSHOT</version>
////	<name>calculatortesting</name>
////	<description>Demo project for Spring Boot</description>
////	<properties>
////		<java.version>11</java.version>
////	</properties>
////	<dependencies>
////		<dependency>
////			<groupId>org.springframework.boot</groupId>
////			<artifactId>spring-boot-starter-web</artifactId>
////		</dependency>
////		<dependency>
////			<groupId>org.springframework.boot</groupId>
////			<artifactId>spring-boot-starter-test</artifactId>
////			<scope>test</scope>
////		</dependency>
////		<dependency>
////			<groupId>org.springframework.boot</groupId>
////			<artifactId>spring-boot-starter-test</artifactId>
////		</dependency>
}
