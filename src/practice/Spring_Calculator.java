package practice;//package HomeworksForSecondCourse;
//
//public class Spring_Calculator {
//
//
//    import org.springframework.web.bind.annotation.RestController;
//
//    @RestController
//    @RequestMapping
//    @RequestMapping(path = "/calculator")
//    public class CalculatorController {
//        private final CalculatorService calculatorService;
//
//        public CalculatorController(CalculatorService calculatorService) {
//            this.calculatorService = calculatorService;
//        }
//
//        @GetMapping(path = "/calculator")
//        @GetMapping()
//        public String welcome() {
//            return calculatorService.welcome();
//        }
//        @@ -35,7 +35,13 @@ public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int
//    }
//
//    @GetMapping(path = "/divide")
//    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
//        public String divide(@RequestParam(name="num1", required=false) Integer num1, @RequestParam("num2") Integer num2) {
//            if (num1 == null || num2 == null) {
//                @OlgaLugacheva OlgaLugacheva on Feb 21
//                в таком случае тот же трюк можно проделать и с другими параметрами в других контроллерах, чтобы также иметь репрезентативное сообщение
//
//                @mativaclub	Reply...
//                return "Can't proceed without a number";
//            }
//            if (num2 == 0) {
//                return "Division by 0 is not possible";
//            }
//            return calculatorService.divide(num1, num2);
//        }
//
//        2
//        src/main/java/pro/sky/skyprospringcalculator/CalculatorService.java
//        Viewed
//        @@ -6,4 +6,6 @@ public interface CalculatorService {
//            String minus(int num1, int num2);
//            String multiply(int num1, int num2);
//            String divide(int num1, int num2);
//
//
//        }
//        3
//        src/main/java/pro/sky/skyprospringcalculator/CalculatorServiceImpl.java
//        Viewed
//        @@ -22,9 +22,6 @@ public String multiply(int num1,int num2) {
//        }
//
//        public String divide(int num1,int num2) {
//            if (num2 == 0) {
//                return "Division by 0 is not possible";
//            }
//            return (num1 + " / " + num2 + " = " + num1 / num2);
//        }
//
//    }
//<?xml version="1.0" encoding="UTF-8"?>
//<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
//	<modelVersion>4.0.0</modelVersion>
//	<parent>
//		<groupId>org.springframework.boot</groupId>
//		<artifactId>spring-boot-starter-parent</artifactId>
//		<version>2.6.7</version>
//		<relativePath/> <!-- lookup parent from repository -->
//	</parent>
//	<groupId>com.calculator-testing</groupId>
//	<artifactId>calculatortesting</artifactId>
//	<version>0.0.1-SNAPSHOT</version>
//	<name>calculatortesting</name>
//	<description>Demo project for Spring Boot</description>
//	<properties>
//		<java.version>11</java.version>
//	</properties>
//	<dependencies>
//		<dependency>
//			<groupId>org.springframework.boot</groupId>
//			<artifactId>spring-boot-starter-web</artifactId>
//		</dependency>
//		<dependency>
//			<groupId>org.springframework.boot</groupId>
//			<artifactId>spring-boot-starter-test</artifactId>
//			<scope>test</scope>
//		</dependency>
//		<dependency>
//			<groupId>org.springframework.boot</groupId>
//			<artifactId>spring-boot-starter-test</artifactId>
//		</dependency>
//
//
//	</dependencies>
//
//	<build>
//		<plugins>
//			<plugin>
//				<groupId>org.springframework.boot</groupId>
//				<artifactId>spring-boot-maven-plugin</artifactId>
//			</plugin>
//		</plugins>
//	</build>
//</project>
//  15
//src/main/java/com/calculatortesting/calculatortesting/controller/CalculatorController.java
//Viewed
//@@ -22,31 +22,24 @@ public String welcome() {
//    }
//
//    @GetMapping(path = "/plus")
//    public String plus(@RequestParam int num1, @RequestParam int num2) {
//    public Integer plus(@RequestParam int num1, @RequestParam int num2) {
//        return calculatorService.plus(num1, num2);
//    }
//
//    @GetMapping(path = "/minus")
//    public String minus(@RequestParam int num1, @RequestParam int num2) {
//    public int minus(@RequestParam int num1, @RequestParam int num2) {
//        return calculatorService.minus(num1, num2);
//    }
//
//    @GetMapping(path = "/multiply")
//    public String multiply(@RequestParam int num1, @RequestParam int num2) {
//    public int multiply(@RequestParam int num1, @RequestParam int num2) {
//        return calculatorService.multiply(num1, num2);
//    }
//
//    @GetMapping(path = "/divide")
//    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
//        if (num1 == null || num2 == null) {
//            return "Can't proceed without a number";
//        }
//        if (num2 == 0) {
//            return "Division by 0 is not possible";
//        }
//    public int divide(@RequestParam Integer num1, @RequestParam Integer num2) {
//        return calculatorService.divide(num1, num2);
//    }
//
//}
//
////    public String divide(@RequestParam(name="num1", required=false) Integer num1, @RequestParam("num2") Integer num2) {
// 11
//src/main/java/com/calculatortesting/calculatortesting/exceptions/DivideByZeroException.java
//Viewed
//@@ -0,0 +1,11 @@
//package com.calculatortesting.calculatortesting.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.BAD_REQUEST)
//public class DivideByZeroException extends IllegalArgumentException{
//    public DivideByZeroException() {
//        super("Error when dividing by zero");
//    }
//}
//  8
//src/main/java/com/calculatortesting/calculatortesting/service/CalculatorService.java
//Viewed
//@@ -4,12 +4,12 @@ public interface CalculatorService {
//
//    String welcome();
//
//    String plus(int num1, int num2);
//    int plus(int num1, int num2);
//
//    String minus(int num1, int num2);
//    int minus(int num1, int num2);
//
//    String multiply(int num1, int num2);
//    int multiply(int num1, int num2);
//
//    String divide(int num1, int num2);
//    int divide(int num1, int num2);
//
//}
//  24
//...main/java/com/calculatortesting/calculatortesting/service/impl/CalculatorServiceImpl.java
//Viewed
//@@ -1,5 +1,6 @@
//package com.calculatortesting.calculatortesting.service.impl;
//
//import com.calculatortesting.calculatortesting.exceptions.DivideByZeroException;
//import com.calculatortesting.calculatortesting.service.CalculatorService;
//import org.springframework.stereotype.Service;
//
//@@ -10,22 +11,27 @@ public String welcome() {
//        return "Welcome to Calculator";
//    }
//
//    public String plus(int num1, int num2) {
//        return (num1 + " + " + num2 + " = " + (num1 + num2));
//    @Override
//    public int plus(int num1, int num2) {
//        return (num1 + num2);
//    }
//
//    public String minus(int num1, int num2) {
//        return (num1 + " - " + num2 + " = " + (num1 - num2));
//    public int minus(int num1, int num2) {
//        return (num1 - num2);
//    }
//
//    public String multiply(int num1, int num2) {
//        return (num1 + " * " + num2 + " = " + (num1 * num2));
//    public int multiply(int num1, int num2) {
//        return (num1 * num2);
//    }
//
//    public String divide(int num1, int num2) {
//        return (num1 + " / " + num2 + " = " + (num1 / num2));
//    public int divide(int num1, int num2) {
//
//        if (num2 == 0) {
//            throw new DivideByZeroException();
//        }
//        return (num1 / num2);
//        }
//    }
//
//
//
//}
// 56
//...test/java/com/calculatortesting/calculatortesting/CalculatorServiceImplParameterTest.java
//Viewed
//@@ -0,0 +1,56 @@
//package com.calculatortesting.calculatortesting;
//
//import com.calculatortesting.calculatortesting.service.impl.CalculatorServiceImpl;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import java.util.stream.Stream;
//
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
//
//    @MethodSource("provideArgumentsForCalculatorTests")
//    @ParameterizedTest
//    public void shouldReturnCorrectResultOfSubtraction(int num1, int num2) {
//        assertEquals(num1 - num2, out.minus(num1, num2));
//    }
//
//    @MethodSource("provideArgumentsForCalculatorTests")
//    @ParameterizedTest
//    public void shouldReturnCorrectResultOfMultiplication(int num1, int num2) {
//        assertEquals(num1 * num2, out.multiply(num1, num2));
//    }
//
//    @MethodSource("provideArgumentsForCalculatorTests")
//    @ParameterizedTest
//    public void shouldReturnCorrectResultOfDivision(int num1, int num2) {
//        assertEquals(num1 / num2, out.divide(num1, num2));
//    }
//
//    public static Stream<Arguments> provideArgumentsForCalculatorTests() {
//        return Stream.of(
//                Arguments.of(THREE, ONE),
//                Arguments.of(ZERO, TWO),
//                Arguments.of(ONE, ONE),
//                Arguments.of(ONE, TWO),
//                Arguments.of(TWO, TWO),
//                Arguments.of(FOUR, TWO)
//        );
//    }
//
//}
// 70
//src/test/java/com/calculatortesting/calculatortesting/CalculatorServiceImplTest.java
//Viewed
//@@ -0,0 +1,70 @@
//package com.calculatortesting.calculatortesting;
//
//import com.calculatortesting.calculatortesting.exceptions.DivideByZeroException;
//import com.calculatortesting.calculatortesting.service.impl.CalculatorServiceImpl;
//import org.junit.jupiter.api.Test;
//
//import static com.calculatortesting.calculatortesting.CalculatorServiceImplTestConstants.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//class CalculatorServiceImplTest {
//
//    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
//
//    @Test
//    public void shouldReturn3WhenPlus1and2() {
//        assertEquals(THREE, out.plus(ONE, TWO));
//    }
//
//
//    @Test
//    public void shouldReturn2WhenPlus0and2() {
//        assertEquals(TWO, out.plus(ZERO, TWO));
//    }
//
//
//    @Test
//    public void shouldReturn0WhenMinus2and2() {
//        assertEquals(ZERO, out.minus(TWO, TWO));
//    }
//
//
//    @Test
//    public void shouldReturn1WhenMinus2and1() {
//        assertEquals(ONE, out.minus(TWO, ONE));
//    }
//
//
//    @Test
//    public void shouldReturn1WhenMultiply1and1() {
//        assertEquals(ONE, out.multiply(ONE, ONE));
//    }
//
//
//    @Test
//    public void shouldReturn2WhenMultiply2and1() {
//        assertEquals(TWO, out.multiply(TWO, ONE));
//    }
//
//
//    @Test
//    public void shouldReturn1WhenDivide2and2() {
//        assertEquals(ONE, out.divide(TWO, TWO));
//    }
//
//
//    @Test
//    public void shouldReturn2WhenDivide2and1() {
//        assertEquals(TWO, out.divide(TWO, ONE));
//    }
//
//    @Test
//    public void shouldThrowDivideByZeroExceptionWhenDivideBy0() {
//        assertThrows(DivideByZeroException.class, () -> out.divide(TWO, ZERO));
//    }
//
//
//
//
//}
// 13
//...test/java/com/calculatortesting/calculatortesting/CalculatorServiceImplTestConstants.java
//Viewed
//@@ -0,0 +1,13 @@
//package com.calculatortesting.calculatortesting;
//
//public class CalculatorServiceImplTestConstants {
//
//    public static final int ZERO = 0;
//    public static final int ONE = 1;
//    public static final int TWO = 2;
//    public static final int THREE = 3;
//
//    public static final int FOUR = 4;
//
//package pro.sky.skyprospringcalculator;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping
//@RequestMapping(path = "/calculator")
//public class CalculatorController {
//    private final CalculatorService calculatorService;
//
//    public CalculatorController(CalculatorService calculatorService) {
//        this.calculatorService = calculatorService;
//    }
//
//    @GetMapping(path = "/calculator")
//    @GetMapping()
//    public String welcome() {
//        return calculatorService.welcome();
//    }
//    @GetMapping(path = "/plus")
//    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
//        return calculatorService.plus(num1, num2);
//    }
//    @GetMapping(path = "/minus")
//    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
//        return calculatorService.minus(num1, num2);
//    }
//    @GetMapping(path = "/multiply")
//    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
//        return calculatorService.multiply(num1, num2);
//    }
//
//    @GetMapping(path = "/divide")
//    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
//    public String divide(@RequestParam(name="num1", required=false) Integer num1, @RequestParam("num2") Integer num2) {
//        if (num1 == null || num2 == null) {
//@OlgaLugacheva OlgaLugacheva on Feb 21, 2022
//в таком случае тот же трюк можно проделать и с другими параметрами в других контроллерах, чтобы также иметь репрезентативное сообщение
//
//@mativaclub	Reply...
//For you:
//            return "Can't proceed without a number";
//        }
//        if (num2 == 0) {
//            return "Division by 0 is not possible";
//        }
//        return calculatorService.divide(num1, num2);
//    }
//
//}
// 2
//src/main/java/pro/sky/skyprospringcalculator/CalculatorService.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -1,9 +1,11 @@
//package pro.sky.skyprospringcalculator;
//public interface CalculatorService {
//    String welcome();
//    String plus(int num1, int num2);
//    String minus(int num1, int num2);
//    String multiply(int num1, int num2);
//    String divide(int num1, int num2);
//
//
//}
// 3
//src/main/java/pro/sky/skyprospringcalculator/CalculatorServiceImpl.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -1,30 +1,27 @@
//package pro.sky.skyprospringcalculator;
//import org.springframework.stereotype.Service;
//@Service
//public class CalculatorServiceImpl implements CalculatorService {
//    public String welcome() {
//        return "<b>Welcome to Calculator</b>";
//    }
//    public String plus(int num1, int num2) {
//        return (num1 + " + " + num2 + " = " + (num1 + num2));
//    }
//    public String minus(int num1,int num2) {
//        return (num1 + " - " + num2 + " = " + (num1 - num2));
//    }
//    public String multiply(int num1,int num2) {
//        return (num1 + " * " + num2 + " = " + (num1 * num2));
//    }
//
//    public String divide(int num1,int num2) {
//        if (num2 == 0) {
//           return "Division by 0 is not possible";
//        }
//        return (num1 + " / " + num2 + " = " + num1 / num2);
//    }<?xml version="1.0" encoding="UTF-8"?>
//<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
//	<modelVersion>4.0.0</modelVersion>
//	<parent>
//		<groupId>org.springframework.boot</groupId>
//		<artifactId>spring-boot-starter-parent</artifactId>
//		<version>2.6.7</version>
//		<relativePath/> <!-- lookup parent from repository -->
//	</parent>
//	<groupId>com.calculator-testing</groupId>
//	<artifactId>calculatortesting</artifactId>
//	<version>0.0.1-SNAPSHOT</version>
//	<name>calculatortesting</name>
//	<description>Demo project for Spring Boot</description>
//	<properties>
//		<java.version>11</java.version>
//	</properties>
//	<dependencies>
//		<dependency>
//			<groupId>org.springframework.boot</groupId>
//			<artifactId>spring-boot-starter-web</artifactId>
//		</dependency>
//		<dependency>
//			<groupId>org.springframework.boot</groupId>
//			<artifactId>spring-boot-starter-test</artifactId>
//			<scope>test</scope>
//		</dependency>
//		<dependency>
//			<groupId>org.springframework.boot</groupId>
//			<artifactId>spring-boot-starter-test</artifactId>
//		</dependency>
//
//
//	</dependencies>
//
//	<build>
//		<plugins>
//			<plugin>
//				<groupId>org.springframework.boot</groupId>
//				<artifactId>spring-boot-maven-plugin</artifactId>
//			</plugin>
//		</plugins>
//	</build>
//</project>
// 15
//src/main/java/com/calculatortesting/calculatortesting/controller/CalculatorController.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -1,52 +1,45 @@
//package com.calculatortesting.calculatortesting.controller;
//import com.calculatortesting.calculatortesting.service.CalculatorService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
//@RequestMapping("/calculator")
//public class CalculatorController {
//    private final CalculatorService calculatorService;
//    public CalculatorController(CalculatorService calculatorService) {
//        this.calculatorService = calculatorService;
//    }
//    @GetMapping()
//    public String welcome() {
//        return calculatorService.welcome();
//    }
//
//    @GetMapping(path = "/plus")
//    public String plus(@RequestParam int num1, @RequestParam int num2) {
//    public Integer plus(@RequestParam int num1, @RequestParam int num2) {
//        return calculatorService.plus(num1, num2);
//    }
//
//    @GetMapping(path = "/minus")
//    public String minus(@RequestParam int num1, @RequestParam int num2) {
//    public int minus(@RequestParam int num1, @RequestParam int num2) {
//        return calculatorService.minus(num1, num2);
//    }
//
//    @GetMapping(path = "/multiply")
//    public String multiply(@RequestParam int num1, @RequestParam int num2) {
//    public int multiply(@RequestParam int num1, @RequestParam int num2) {
//        return calculatorService.multiply(num1, num2);
//    }
//
//    @GetMapping(path = "/divide")
//    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
//        if (num1 == null || num2 == null) {
//            return "Can't proceed without a number";
//        }
//        if (num2 == 0) {
//            return "Division by 0 is not possible";
//        }
//    public int divide(@RequestParam Integer num1, @RequestParam Integer num2) {
//        return calculatorService.divide(num1, num2);
//    }
//
//}
//
////    public String divide(@RequestParam(name="num1", required=false) Integer num1, @RequestParam("num2") Integer num2) {
// 11
//src/main/java/com/calculatortesting/calculatortesting/exceptions/DivideByZeroException.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,11 @@
//package com.calculatortesting.calculatortesting.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.BAD_REQUEST)
//public class DivideByZeroException extends IllegalArgumentException{
//    public DivideByZeroException() {
//        super("Error when dividing by zero");
//    }
//}
// 8
//src/main/java/com/calculatortesting/calculatortesting/service/CalculatorService.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -1,15 +1,15 @@
//package com.calculatortesting.calculatortesting.service;
//public interface CalculatorService {
//
//    String welcome();
//
//    String plus(int num1, int num2);
//    int plus(int num1, int num2);
//
//    String minus(int num1, int num2);
//    int minus(int num1, int num2);
//
//    String multiply(int num1, int num2);
//    int multiply(int num1, int num2);
//
//    String divide(int num1, int num2);
//    int divide(int num1, int num2);
//
//}
// 24
//...main/java/com/calculatortesting/calculatortesting/service/impl/CalculatorServiceImpl.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -1,5 +1,6 @@
//package com.calculatortesting.calculatortesting.service.impl;
//
//import com.calculatortesting.calculatortesting.exceptions.DivideByZeroException;
//import com.calculatortesting.calculatortesting.service.CalculatorService;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CalculatorServiceImpl implements CalculatorService {
//    public String welcome() {
//        return "Welcome to Calculator";
//    }
//
//    public String plus(int num1, int num2) {
//        return (num1 + " + " + num2 + " = " + (num1 + num2));
//    @Override
//    public int plus(int num1, int num2) {
//        return (num1 + num2);
//    }
//
//    public String minus(int num1, int num2) {
//        return (num1 + " - " + num2 + " = " + (num1 - num2));
//    public int minus(int num1, int num2) {
//        return (num1 - num2);
//    }
//
//    public String multiply(int num1, int num2) {
//        return (num1 + " * " + num2 + " = " + (num1 * num2));
//    public int multiply(int num1, int num2) {
//        return (num1 * num2);
//    }
//
//    public String divide(int num1, int num2) {
//        return (num1 + " / " + num2 + " = " + (num1 / num2));
//    public int divide(int num1, int num2) {
//
//        if (num2 == 0) {
//            throw new DivideByZeroException();
//        }
//        return (num1 / num2);
//        }
//    }
//
//
//
//}
// 56
//...test/java/com/calculatortesting/calculatortesting/CalculatorServiceImplParameterTest.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,56 @@
//package com.calculatortesting.calculatortesting;
//
//import com.calculatortesting.calculatortesting.service.impl.CalculatorServiceImpl;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import java.util.stream.Stream;
//
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
//
//    @MethodSource("provideArgumentsForCalculatorTests")
//    @ParameterizedTest
//    public void shouldReturnCorrectResultOfSubtraction(int num1, int num2) {
//        assertEquals(num1 - num2, out.minus(num1, num2));
//    }
//
//    @MethodSource("provideArgumentsForCalculatorTests")
//    @ParameterizedTest
//    public void shouldReturnCorrectResultOfMultiplication(int num1, int num2) {
//        assertEquals(num1 * num2, out.multiply(num1, num2));
//    }
//
//    @MethodSource("provideArgumentsForCalculatorTests")
//    @ParameterizedTest
//    public void shouldReturnCorrectResultOfDivision(int num1, int num2) {
//        assertEquals(num1 / num2, out.divide(num1, num2));
//    }
//
//    public static Stream<Arguments> provideArgumentsForCalculatorTests() {
//        return Stream.of(
//                Arguments.of(THREE, ONE),
//                Arguments.of(ZERO, TWO),
//                Arguments.of(ONE, ONE),
//                Arguments.of(ONE, TWO),
//                Arguments.of(TWO, TWO),
//                Arguments.of(FOUR, TWO)
//        );
//    }
//
//}
// 70
//src/test/java/com/calculatortesting/calculatortesting/CalculatorServiceImplTest.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,70 @@
//package com.calculatortesting.calculatortesting;
//
//import com.calculatortesting.calculatortesting.exceptions.DivideByZeroException;
//import com.calculatortesting.calculatortesting.service.impl.CalculatorServiceImpl;
//import org.junit.jupiter.api.Test;
//
//import static com.calculatortesting.calculatortesting.CalculatorServiceImplTestConstants.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//class CalculatorServiceImplTest {
//
//    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
//
//    @Test
//    public void shouldReturn3WhenPlus1and2() {
//        assertEquals(THREE, out.plus(ONE, TWO));
//    }
//
//
//    @Test
//    public void shouldReturn2WhenPlus0and2() {
//        assertEquals(TWO, out.plus(ZERO, TWO));
//    }
//
//
//    @Test
//    public void shouldReturn0WhenMinus2and2() {
//        assertEquals(ZERO, out.minus(TWO, TWO));
//    }
//
//
//    @Test
//    public void shouldReturn1WhenMinus2and1() {
//        assertEquals(ONE, out.minus(TWO, ONE));
//    }
//
//
//    @Test
//    public void shouldReturn1WhenMultiply1and1() {
//        assertEquals(ONE, out.multiply(ONE, ONE));
//    }
//
//
//    @Test
//    public void shouldReturn2WhenMultiply2and1() {
//        assertEquals(TWO, out.multiply(TWO, ONE));
//    }
//
//
//    @Test
//    public void shouldReturn1WhenDivide2and2() {
//        assertEquals(ONE, out.divide(TWO, TWO));
//    }
//
//
//    @Test
//    public void shouldReturn2WhenDivide2and1() {
//        assertEquals(TWO, out.divide(TWO, ONE));
//    }
//
//    @Test
//    public void shouldThrowDivideByZeroExceptionWhenDivideBy0() {
//        assertThrows(DivideByZeroException.class, () -> out.divide(TWO, ZERO));
//    }
//
//
//
//
//}
// 13
//...test/java/com/calculatortesting/calculatortesting/CalculatorServiceImplTestConstants.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,13 @@
//package com.calculatortesting.calculatortesting;
//
//public class CalculatorServiceImplTestConstants {
//
//    public static final int ZERO = 0;
//    public static final int ONE = 1;
//    public static final int TWO = 2;
//    public static final int THREE = 3;
//
//    public static final int FOUR = 4;
//}
