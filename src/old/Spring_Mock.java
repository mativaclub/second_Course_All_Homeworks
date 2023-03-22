package old;

public class Spring_Mock {

//    package com.springmockito.demospringmockkito.controllers;
//
//public class DepartmentController {
//}
// 55
//src/main/java/com/springmockito/demospringmockkito/controllers/EmployeeController.java
//@@ -0,0 +1,55 @@
//package com.springmockito.demospringmockkito.controllers;
//
//import com.springmockito.demospringmockkito.data.Employee;
//import com.springmockito.demospringmockkito.service.EmployeeService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collection;
//
//@RestController
//@RequestMapping("/employee")
//public class EmployeeController {
//
//    private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/add")
//    public String add(@RequestParam String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.add(firstName, lastName);
//        return generateMessage(result, "Added");
//
//    }
//
//    @GetMapping("/remove")
//    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.remove(firstName, lastName);
//        return generateMessage(result, "Removed");
//
//    }
//
//    @GetMapping("/find")
//    public String find(@RequestParam String firstName, @RequestParam String lastName) {
//        String result = String.valueOf(employeeService.find(firstName, lastName));//???
//        return result;
//    }
//
//    @GetMapping("/all")
//    public Collection<Employee> all() {
//        return employeeService.getAll();
//    }
//
//    public String generateMessage(Employee employee, String status) {
//        return String.format("Employee %s %s %s.",
//                employee.getFirstName(),
//                employee.getLastName(),
//                status);
//
//    }
//
//}
// 43
//src/main/java/com/springmockito/demospringmockkito/data/Employee.java
//@@ -0,0 +1,43 @@
//package com.springmockito.demospringmockkito.data;
//
//import java.util.Objects;
//
//public class Employee {
//
//    private final String firstName;
//    private final String lastName;
//
//    public Employee(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName);
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }
//}
// 19
//src/main/java/com/springmockito/demospringmockkito/exceptions/EmployeeExistsException.java
//@@ -0,0 +1,19 @@
//package com.springmockito.demospringmockkito.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.BAD_REQUEST)
//public class EmployeeExistsException extends RuntimeException {
//
//    public static final String DEFAULT_MESSAGE = "Employee Exists";
//
//    public EmployeeExistsException() {
//        this(DEFAULT_MESSAGE);
//    }
//
//    public EmployeeExistsException(String message) {
//        super(message);
//    }
//
//}
// 18
//src/main/java/com/springmockito/demospringmockkito/exceptions/EmployeeNotFoundException.java
//@@ -0,0 +1,18 @@
//package com.springmockito.demospringmockkito.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.NOT_FOUND)
//public class EmployeeNotFoundException extends RuntimeException {
//
//    public static final String DEFAULT_MESSAGE = "Employee Not Found";
//
//    public EmployeeNotFoundException() {
//        this(DEFAULT_MESSAGE);
//    }
//
//    public EmployeeNotFoundException(String message) {
//        super(message);
//    }
//}
// 4
//src/main/java/com/springmockito/demospringmockkito/service/DepartmentService.java
//@@ -0,0 +1,4 @@
//package com.springmockito.demospringmockkito.service;
//
//public interface DepartmentService {
//}
// 19
//src/main/java/com/springmockito/demospringmockkito/service/EmployeeService.java
//@@ -0,0 +1,19 @@
//package com.springmockito.demospringmockkito.service;
//
//import com.springmockito.demospringmockkito.controllers.EmployeeController;
//import com.springmockito.demospringmockkito.data.Employee;
//
//import java.util.Collection;
//
//public interface EmployeeService {
//
//    Employee add(String firstName, String lastName);
//
//    Employee add(Employee employee);
//    Employee remove(String firstName, String lastName);
//
//    Employee remove(Employee employee);
//    Employee find(String firstName, String lastName);
//
//    Collection<Employee> getAll();
//}
// 4
//src/main/java/com/springmockito/demospringmockkito/service/impl/DepartmentServiceImpl.java
//@@ -0,0 +1,4 @@
//package com.springmockito.demospringmockkito.service.impl;
//
//public class DepartmentServiceImpl {
//}
// 67
//src/main/java/com/springmockito/demospringmockkito/service/impl/EmployeeServiceImpl.java
//@@ -0,0 +1,67 @@
//package com.springmockito.demospringmockkito.service.impl;
//
//import com.springmockito.demospringmockkito.data.Employee;
//import com.springmockito.demospringmockkito.exceptions.EmployeeExistsException;
//import com.springmockito.demospringmockkito.exceptions.EmployeeNotFoundException;
//import com.springmockito.demospringmockkito.service.EmployeeService;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//    private final List<Employee> employeeList;
//
//    public EmployeeServiceImpl() {
//        employeeList = new ArrayList<>();
//    }
//
//    @Override
//    public Employee add(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        return add(newEmployee);
//
//    }
//    @Override
//    public Employee add(Employee employee) {
//        if (employeeList.contains(employee)) {
//            throw new EmployeeExistsException();
//        }
//        employeeList.add(employee);
//        return employee;
//
//    }
//    @Override
//    public Employee remove(String firstName,String lastName) {
//        Employee removeEmployee = new Employee(firstName, lastName);
//        return remove(removeEmployee);
//
//    }
//    @Override
//    public Employee remove(Employee employee) {
//        if (!employeeList.remove(employee)) {
//            throw new EmployeeNotFoundException();
//        }
//        return employee;
//
//    }
//    @Override
//    public Employee find(String firstName,String lastName) {
//        return find(firstName,lastName);
//
//    }
//
//    @Override
//    public Collection<Employee> getAll() {
//        return employeeList;
//    }
//
//
//package com.springmockito.demospringmockkito;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication
//public class DemospringmockkitoApplication {
//	public static void main(String[] args) {
//		SpringApplication.run(DemospringmockkitoApplication.class, args);
//	}
//
//}
//
//
//
////В текущем домашнем задании мы вновь вернёмся к работе над
//// книгой сотрудников, которую разрабатываем в ходе курса.
//// Задача данного домашнего задания - покрыть проект (его сервисы) максимальным количеством тестов.
//
////Реализуемые вами проекты имеют два сервиса. Подход в каждом из них будет немного отличаться.
//
////- EmployeeService не имеет зависимостей, потому должен быть покрыт с помощью JUnit.
////- DepartmentService имеет зависимость на EmployeeService, потому потребуется еще и Mockito.
//
////**Шаг 1.** Необходимо покрыть тестами все операции по работе с сотрудниками из
//// EmployeeService (добавление, удаление, поиск).
////
////*Нужно покрыть максимальное количество ситуаций, например добавление сотрудника,
//// который уже есть в коллекции, или удаление сотрудника, которого нет.*
////
////**Шаг 2.** Необходимо покрыть тестами все операции по работе с отделами из DepartmentService.
////
////*Нужно «замокать» EmployeeService, который возвращает список сотрудников,
//// а уже затем покрыть все методы сервиса тестами с максимальным количеством
//// придуманных ситуаций. Например, когда переданный отдел отсутствует или вообще не передан пользователем.*
// 4
//src/main/java/com/springmockito/demospringmockkito/controllers/DepartmentController.java
//Viewed
//@@ -0,0 +1,4 @@
//package com.springmockito.demospringmockkito.controllers;
//
//public class DepartmentController {
//}
// 55
//src/main/java/com/springmockito/demospringmockkito/controllers/EmployeeController.java
//Viewed
//@@ -0,0 +1,55 @@
//package com.springmockito.demospringmockkito.controllers;
//
//import com.springmockito.demospringmockkito.data.Employee;
//import com.springmockito.demospringmockkito.service.EmployeeService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collection;
//
//@RestController
//@RequestMapping("/employee")
//public class EmployeeController {
//
//    private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/add")
//    public String add(@RequestParam String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.add(firstName, lastName);
//        return generateMessage(result, "Added");
//
//    }
//
//    @GetMapping("/remove")
//    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.remove(firstName, lastName);
//        return generateMessage(result, "Removed");
//
//    }
//
//    @GetMapping("/find")
//    public String find(@RequestParam String firstName, @RequestParam String lastName) {
//        String result = String.valueOf(employeeService.find(firstName, lastName));//???
//        return result;
//    }
//
//    @GetMapping("/all")
//    public Collection<Employee> all() {
//        return employeeService.getAll();
//    }
//
//    public String generateMessage(Employee employee, String status) {
//        return String.format("Employee %s %s %s.",
//                employee.getFirstName(),
//                employee.getLastName(),
//                status);
//
//    }
//
//}
// 43
//src/main/java/com/springmockito/demospringmockkito/data/Employee.java
//Viewed
//@@ -0,0 +1,43 @@
//package com.springmockito.demospringmockkito.data;
//
//import java.util.Objects;
//
//public class Employee {
//
//    private final String firstName;
//    private final String lastName;
//
//    public Employee(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName);
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }
//}
// 19
//src/main/java/com/springmockito/demospringmockkito/exceptions/EmployeeExistsException.java
//Viewed
//@@ -0,0 +1,19 @@
//package com.springmockito.demospringmockkito.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.BAD_REQUEST)
//public class EmployeeExistsException extends RuntimeException {
//
//    public static final String DEFAULT_MESSAGE = "Employee Exists";
//
//    public EmployeeExistsException() {
//        this(DEFAULT_MESSAGE);
//    }
//
//    public EmployeeExistsException(String message) {
//        super(message);
//    }
//
//}
// 18
//src/main/java/com/springmockito/demospringmockkito/exceptions/EmployeeNotFoundException.java
//Viewed
//@@ -0,0 +1,18 @@
//package com.springmockito.demospringmockkito.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.NOT_FOUND)
//public class EmployeeNotFoundException extends RuntimeException {
//
//    public static final String DEFAULT_MESSAGE = "Employee Not Found";
//
//    public EmployeeNotFoundException() {
//        this(DEFAULT_MESSAGE);
//    }
//
//    public EmployeeNotFoundException(String message) {
//        super(message);
//    }
//}
// 4
//src/main/java/com/springmockito/demospringmockkito/service/DepartmentService.java
//Viewed
//@@ -0,0 +1,4 @@
//package com.springmockito.demospringmockkito.service;
//
//public interface DepartmentService {
//}
// 19
//src/main/java/com/springmockito/demospringmockkito/service/EmployeeService.java
//Viewed
//@@ -0,0 +1,19 @@
//package com.springmockito.demospringmockkito.service;
//
//import com.springmockito.demospringmockkito.controllers.EmployeeController;
//import com.springmockito.demospringmockkito.data.Employee;
//
//import java.util.Collection;
//
//public interface EmployeeService {
//
//    Employee add(String firstName, String lastName);
//
//    Employee add(Employee employee);
//    Employee remove(String firstName, String lastName);
//
//    Employee remove(Employee employee);
//    Employee find(String firstName, String lastName);
//
//    Collection<Employee> getAll();
//}
// 4
//src/main/java/com/springmockito/demospringmockkito/service/impl/DepartmentServiceImpl.java
//Viewed
//@@ -0,0 +1,4 @@
//package com.springmockito.demospringmockkito.service.impl;
//
//public class DepartmentServiceImpl {
//}
// 67
//src/main/java/com/springmockito/demospringmockkito/service/impl/EmployeeServiceImpl.java
//Viewed
//@@ -0,0 +1,67 @@
//package com.springmockito.demospringmockkito.service.impl;
//
//import com.springmockito.demospringmockkito.data.Employee;
//import com.springmockito.demospringmockkito.exceptions.EmployeeExistsException;
//import com.springmockito.demospringmockkito.exceptions.EmployeeNotFoundException;
//import com.springmockito.demospringmockkito.service.EmployeeService;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//    private final List<Employee> employeeList;
//
//    public EmployeeServiceImpl() {
//        employeeList = new ArrayList<>();
//    }
//
//    @Override
//    public Employee add(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        return add(newEmployee);
//
//    }
//    @Override
//    public Employee add(Employee employee) {
//        if (employeeList.contains(employee)) {
//            throw new EmployeeExistsException();
//        }
//        employeeList.add(employee);
//        return employee;
//
//    }
//    @Override
//    public Employee remove(String firstName,String lastName) {
//        Employee removeEmployee = new Employee(firstName, lastName);
//        return remove(removeEmployee);
//
//    }
//    @Override
//    public Employee remove(Employee employee) {
//        if (!employeeList.remove(employee)) {
//            throw new EmployeeNotFoundException();
//        }
//        return employee;
//
//    }
//    @Override
//    public Employee find(String firstName,String lastName) {
//        return find(firstName,lastName);
//
//    }
//
//    @Override
//    public Collection<Employee> getAll() {
//        return employeeList;
//    }
//
//
//
//
//
//}
//
//
//}package com.springmockito.demospringmockkito;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication
//public class DemospringmockkitoApplication {
//	public static void main(String[] args) {
//		SpringApplication.run(DemospringmockkitoApplication.class, args);
//	}
//
//}
//
//
//
////В текущем домашнем задании мы вновь вернёмся к работе над
//// книгой сотрудников, которую разрабатываем в ходе курса.
//// Задача данного домашнего задания - покрыть проект (его сервисы) максимальным количеством тестов.
//
////Реализуемые вами проекты имеют два сервиса. Подход в каждом из них будет немного отличаться.
//
////- EmployeeService не имеет зависимостей, потому должен быть покрыт с помощью JUnit.
////- DepartmentService имеет зависимость на EmployeeService, потому потребуется еще и Mockito.
//
////**Шаг 1.** Необходимо покрыть тестами все операции по работе с сотрудниками из
//// EmployeeService (добавление, удаление, поиск).
////
////*Нужно покрыть максимальное количество ситуаций, например добавление сотрудника,
//// который уже есть в коллекции, или удаление сотрудника, которого нет.*
////
////**Шаг 2.** Необходимо покрыть тестами все операции по работе с отделами из DepartmentService.
////
////*Нужно «замокать» EmployeeService, который возвращает список сотрудников,
//// а уже затем покрыть все методы сервиса тестами с максимальным количеством
//// придуманных ситуаций. Например, когда переданный отдел отсутствует или вообще не передан пользователем.*
// 4
//src/main/java/com/springmockito/demospringmockkito/controllers/DepartmentController.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,4 @@
//package com.springmockito.demospringmockkito.controllers;
//
//public class DepartmentController {
//}
// 55
//src/main/java/com/springmockito/demospringmockkito/controllers/EmployeeController.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,55 @@
//package com.springmockito.demospringmockkito.controllers;
//
//import com.springmockito.demospringmockkito.data.Employee;
//import com.springmockito.demospringmockkito.service.EmployeeService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collection;
//
//@RestController
//@RequestMapping("/employee")
//public class EmployeeController {
//
//    private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/add")
//    public String add(@RequestParam String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.add(firstName, lastName);
//        return generateMessage(result, "Added");
//
//    }
//
//    @GetMapping("/remove")
//    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.remove(firstName, lastName);
//        return generateMessage(result, "Removed");
//
//    }
//
//    @GetMapping("/find")
//    public String find(@RequestParam String firstName, @RequestParam String lastName) {
//        String result = String.valueOf(employeeService.find(firstName, lastName));//???
//        return result;
//    }
//
//    @GetMapping("/all")
//    public Collection<Employee> all() {
//        return employeeService.getAll();
//    }
//
//    public String generateMessage(Employee employee, String status) {
//        return String.format("Employee %s %s %s.",
//                employee.getFirstName(),
//                employee.getLastName(),
//                status);
//
//    }
//
//}
// 43
//src/main/java/com/springmockito/demospringmockkito/data/Employee.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,43 @@
//package com.springmockito.demospringmockkito.data;
//
//import java.util.Objects;
//
//public class Employee {
//
//    private final String firstName;
//    private final String lastName;
//
//    public Employee(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName);
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }
//}
// 19
//src/main/java/com/springmockito/demospringmockkito/exceptions/EmployeeExistsException.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,19 @@
//package com.springmockito.demospringmockkito.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.BAD_REQUEST)
//public class EmployeeExistsException extends RuntimeException {
//
//    public static final String DEFAULT_MESSAGE = "Employee Exists";
//
//    public EmployeeExistsException() {
//        this(DEFAULT_MESSAGE);
//    }
//
//    public EmployeeExistsException(String message) {
//        super(message);
//    }
//
//}
// 18
//src/main/java/com/springmockito/demospringmockkito/exceptions/EmployeeNotFoundException.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,18 @@
//package com.springmockito.demospringmockkito.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.NOT_FOUND)
//public class EmployeeNotFoundException extends RuntimeException {
//
//    public static final String DEFAULT_MESSAGE = "Employee Not Found";
//
//    public EmployeeNotFoundException() {
//        this(DEFAULT_MESSAGE);
//    }
//
//    public EmployeeNotFoundException(String message) {
//        super(message);
//    }
//}
// 4
//src/main/java/com/springmockito/demospringmockkito/service/DepartmentService.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,4 @@
//package com.springmockito.demospringmockkito.service;
//
//public interface DepartmentService {
//}
// 19
//src/main/java/com/springmockito/demospringmockkito/service/EmployeeService.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,19 @@
//package com.springmockito.demospringmockkito.service;
//
//import com.springmockito.demospringmockkito.controllers.EmployeeController;
//import com.springmockito.demospringmockkito.data.Employee;
//
//import java.util.Collection;
//
//public interface EmployeeService {
//
//    Employee add(String firstName, String lastName);
//
//    Employee add(Employee employee);
//    Employee remove(String firstName, String lastName);
//
//    Employee remove(Employee employee);
//    Employee find(String firstName, String lastName);
//
//    Collection<Employee> getAll();
//}
// 4
//src/main/java/com/springmockito/demospringmockkito/service/impl/DepartmentServiceImpl.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,4 @@
//package com.springmockito.demospringmockkito.service.impl;
//
//public class DepartmentServiceImpl {
//}
// 67
//src/main/java/com/springmockito/demospringmockkito/service/impl/EmployeeServiceImpl.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,67 @@
//package com.springmockito.demospringmockkito.service.impl;
//
//import com.springmockito.demospringmockkito.data.Employee;
//import com.springmockito.demospringmockkito.exceptions.EmployeeExistsException;
//import com.springmockito.demospringmockkito.exceptions.EmployeeNotFoundException;
//import com.springmockito.demospringmockkito.service.EmployeeService;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//    private final List<Employee> employeeList;
//
//    public EmployeeServiceImpl() {
//        employeeList = new ArrayList<>();
//    }
//
//    @Override
//    public Employee add(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        return add(newEmployee);
//
//    }
//    @Override
//    public Employee add(Employee employee) {
//        if (employeeList.contains(employee)) {
//            throw new EmployeeExistsException();
//        }
//        employeeList.add(employee);
//        return employee;
//
//    }
//    @Override
//    public Employee remove(String firstName,String lastName) {
//        Employee removeEmployee = new Employee(firstName, lastName);
//        return remove(removeEmployee);
//
//    }
//    @Override
//    public Employee remove(Employee employee) {
//        if (!employeeList.remove(employee)) {
//            throw new EmployeeNotFoundException();
//        }
//        return employee;
//
//    }
//    @Override
//    public Employee find(String firstName,String lastName) {
//        return find(firstName,lastName);
//
//    }
//
//    @Override
//    public Collection<Employee> getAll() {
//        return employeeList;
//    }
}
