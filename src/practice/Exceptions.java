package practice;//package HomeworksForSecondCourse;
//
//public class Exceptions {
//
//    @SpringBootApplication
//    public class DemoexceptionsApplication {
//
//
//        public static void main(String[] args) {
//            SpringApplication.run(DemoexceptionsApplication.class, args);
//        }
//
//
//    }
//
////Написать непроверяемое исключение, которое выбрасывается, если сотрудник не найден.
////Возвращает статус 404 Not Found.
//
////Написать непроверяемое исключение, которое выбрасывается, если массив сотрудников переполнен.
////Возвращает статус 500 Internal Server Error.
//
////Написать непроверяемое исключение, которое выбрасывается,
//// если в массиве есть сотрудник, когда сотрудника пытаются добавить в массив.
////Возвращает статус 400 Bad Request.
//
////Добавить в методы из шага 5 новые исключения.
//
////1. В метод с добавлением сотрудника нужно добавить выброс
//// исключения из шага 7 в ситуации, когда массив переполнен.
////2. В метод с добавлением сотрудника нужно добавить выброс
//// исключения из шага 8 в ситуации, когда добавляемый сотрудник уже имеется в массиве.
////3. В метод с удалением сотрудника нужно добавить выброс
//// исключения из шага 6 в ситуации, когда удаляемый сотрудник не найден.
////4. В метод с поиском сотрудника нужно добавить выброс
//// исключения из шага 8 в ситуации, когда сотрудник не найден.
////
//
////### Шаг 11
////
////Объявить в контроллере 3 метода:
////
////1. По адресу /employee/add?firstName=Ivan&lastName=Ivanov должен
//// вернуться объект Employee в формате JSON, т. е.
//// { "firstName": "Ivan", "lastName": "Ivanov" }, или исключение
//// со статусом 500 Internal Server Error в случае переполнения
//// массива или 400 Bad Request в случае, когда сотрудник уже существует.
////2. По адресу /employee/remove?firstName=Ivan&lastName=Ivanov
//// должен вернуться объект Employee в формате JSON, т. е.
//// { "firstName": "Ivan", "lastName": "Ivanov" }, или исключение
//// со статусом 404 Not Found, если сотрудник отсутствует.
////3. По адресу /employee/find?firstName=Ivan&lastName=Ivanov должен
//// вернуться объект Employee в формате JSON, т. е.
//// { "firstName": "Ivan", "lastName": "Ivanov" },
//// или исключение со статусом 404 Not Found, если такой сотрудник отсутствует.
////
////### Подсказки
//
//
////3. Возврат статуса осуществляется с помощью аннотации @ResponseStatus.
//
////5. В случае отсутствия одного из параметров Spring должен самостоятельно
//// выводить страницу с ошибкой (аннотация @RequestParam).
//
////7. Spring сам конвертирует ваш объект Employee в JSON. Достаточно просто
//// вернуть его через return в методе контроллера.
//}
//  1
//          src/main/java/com/example/exceptions/demoexceptions/Employee.java
//          Viewed
//@@ -11,6 +11,7 @@ public Employee(String firstName, String lastName) {
//        this.lastName = lastName;
//        }
//
//
//@Override
//public String toString() {
//        return String.format("Employee: %s %s", firstName, lastName) ;
//        1
//        src/main/java/com/example/exceptions/demoexceptions/EmployeeController.java
//        Viewed
//@@ -14,6 +14,7 @@ public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//        }
//
//
//@GetMapping(path = "/add")
//public String add(@RequestParam() String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.add(firstName, lastName);
//        2
//        src/main/java/com/example/exceptions/demoexceptions/EmployeeExistsException.java
//        Viewed
//@@ -9,6 +9,8 @@ public EmployeeExistsException() {
//        super("Employee Book Already contains this employee");
//        }
//
//
//
////    public EmployeeExistsException(String message) {
////        super(message);
////    }
//        1
//        src/main/java/com/example/exceptions/demoexceptions/EmployeeNotFoundException.java
//        Viewed
//@@ -12,6 +12,7 @@ public EmployeeNotFoundException() {
//        super(DEFAULT_MESSAGE);
//        }
//
//
////    public EmployeeNotFoundException(String message) {
////        super(message);
////    }
//        2
//        src/main/java/com/example/exceptions/demoexceptions/EmployeeServiceImpl.java
//        Viewed
//@@ -31,6 +31,7 @@ public Employee add(Employee employee) {
//        return employee;
//        }
//
//
//@Override
//public Employee remove(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//@@ -48,7 +49,6 @@ public Employee remove(Employee employee) {
//        throw new EmployeeNotFoundException();
//        }
//
//
//@Override
//public Employee find(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        int index = indexOf(newEmployee);
//        if (index != -1) {
//        return employees[index];
//        }
//        throw new EmployeeNotFoundException();
//        }
//public int indexOf(Employee employee) {
//        for (int i = 0; i < size; i++) {
//        if (employees[i].equals(employee)) {
//        return i;
//        }
//        }
//        return -1;
//        }
//        }
//        package com.exceptions.exceptions;
//
//        import java.util.Objects;
//
//public class Employee {
//
//    String firstName;
//    String lastName;
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
//    public String toString() {
//        return String.format("Employee: %s %w", lastName, firstName);
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
//}
// 18
//         src/main/java/com/exceptions/exceptions/EmployeeBookOverflowException.java
//         Viewed
//@@ -0,0 +1,18 @@
//        package com.exceptions.exceptions;
//
//        import org.springframework.http.HttpStatus;
//        import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.INSUFFICIENT_STORAGE)
//public class EmployeeBookOverflowException extends RuntimeException {
//
//    public static final String DEFAULT_MESSAGE = "Employee book is full";
//
//    public EmployeeBookOverflowException() {
//        this(DEFAULT_MESSAGE);
//    }
//
//    public EmployeeBookOverflowException(String message) {
//        super(message);
//    }
//}
// 41
//         src/main/java/com/exceptions/exceptions/EmployeeController.java
//         Viewed
//@@ -0,0 +1,41 @@
//        package com.exceptions.exceptions;
//
//        import org.springframework.web.bind.annotation.GetMapping;
//        import org.springframework.web.bind.annotation.RequestMapping;
//        import org.springframework.web.bind.annotation.RequestParam;
//        import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping
//public class EmployeeController {
//    private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/add")
//    public String add(@RequestParam String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.add(firstName, lastName);
//        return generateMessage(result, "Successfully added");
//    }
//
//    @GetMapping("/remove")
//    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.remove(firstName, lastName);
//        return generateMessage(result, "Successfully removed");
//    }
//
//    @GetMapping("/find")
//    public Employee find(@RequestParam String firstName, @RequestParam String lastName) {
//        return employeeService.find(firstName, lastName);
//    }
//
//    public String generateMessage(Employee employee, String status) {
//        return String.format("Employee %s %s %s.",
//                employee.getFirstName(),
//                employee.getLastName(),
//                status
//        );
//    }
//}
// 18
//         src/main/java/com/exceptions/exceptions/EmployeeExistsException.java
//         Viewed
//@@ -0,0 +1,18 @@
//        package com.exceptions.exceptions;
//
//        import org.springframework.http.HttpStatus;
//        import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.BAD_REQUEST)
//public class EmployeeExistsException extends RuntimeException {
//
//    public static final String DEFAULT_MESSAGE = "Employee exists";
//
//    public EmployeeExistsException() {
//        this(DEFAULT_MESSAGE);
//    }
//
//    public EmployeeExistsException(String message) {
//        super(message);
//    }
//}
// 18
//         src/main/java/com/exceptions/exceptions/EmployeeNotFoundException.java
//         Viewed
//@@ -0,0 +1,18 @@
//        package com.exceptions.exceptions;
//
//        import org.springframework.http.HttpStatus;
//        import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.NOT_FOUND)
//public class EmployeeNotFoundException extends RuntimeException {
//
//    public static final String DEFAULT_MESSAGE = "Employee not Found";
//
//    public EmployeeNotFoundException() {
//        this(DEFAULT_MESSAGE);
//    }
//
//    public EmployeeNotFoundException(String message) {
//        super(message);
//    }
//}
// 16
//         src/main/java/com/exceptions/exceptions/EmployeeService.java
//         Viewed
//@@ -0,0 +1,16 @@
//        package com.exceptions.exceptions;
//
//public interface EmployeeService {
//
//    Employee add(String firstName, String lastName);
//
//    Employee add(Employee employee);
//
//    Employee remove(String firstName, String lastName);
//
//    Employee remove(Employee employee);
//
//    Employee find(String firstName, String lastName);
//
//
//}
// 74
//         src/main/java/com/exceptions/exceptions/EmployeeServiceImpl.java
//         Viewed
//@@ -0,0 +1,74 @@
//        package com.exceptions.exceptions;
//
//        import org.springframework.stereotype.Service;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//    public static final int DEFAULT_CAPACITY = 10;
//    private final Employee[] employees;
//    private int size;
//
//    public EmployeeServiceImpl() {
//        employees = new Employee[DEFAULT_CAPACITY];
//    }
//
//    @Override
//    public Employee add(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        return add(newEmployee);
//    }
//
//    @Override
//    public Employee add(Employee employee) {
//        if (size == employees.length) {
//            throw new EmployeeBookOverflowException();
//        }
//        int index = indexOf(employee);
//        if (index != -1) {
//            throw new EmployeeExistsException();
//        }
//        employees[size++] = employee;
//        return employee;
//    }
//
//    @Override
//    public Employee remove(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        return add(newEmployee);
//        @Avenirre Avenirre on Mar 1
//        remove
//
//        @mativaclub	Reply...
//    }
//
//    @Override
//    public Employee remove(Employee employee) {
//        int index = indexOf(employee);
//
//        if (index != -1) {
//            Employee result = employees[index];
//            System.arraycopy(employees, index + 1, employees, index, size - index);
//            employees[--size] = null;
//            return result;
//        }
//        throw new EmployeeNotFoundException();
//    }
//
//
//    @Override
//    public Employee find(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        int index = indexOf(newEmployee);
//
//        if (index != -1) {
//            return employees[index];
//        }
//        throw new EmployeeNotFoundException();
//    }
//
//    public int indexOf(Employee employee) {
//        for (int i = 0; i < size; i++) {
//            if (employees[i].equals(employee)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//}
//  1
//          src/main/java/com/exceptions/exceptions/ExceptionsApplication.java
//          Viewed
//@@ -10,5 +10,4 @@ public static void main(String[] args) {
//        SpringApplication.run(ExceptionsApplication.class, args);
//        }
//
//
//        }
//        }

//package com.example.exceptions.demoexceptions;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication
//public class DemoexceptionsApplication {
//
//
//	public static void main(String[] args) {
//		SpringApplication.run(DemoexceptionsApplication.class, args);
//	}
//
//
//}
//
////Написать непроверяемое исключение, которое выбрасывается, если сотрудник не найден.
////Возвращает статус 404 Not Found.
//
////Написать непроверяемое исключение, которое выбрасывается, если массив сотрудников переполнен.
////Возвращает статус 500 Internal Server Error.
//
////Написать непроверяемое исключение, которое выбрасывается,
//// если в массиве есть сотрудник, когда сотрудника пытаются добавить в массив.
////Возвращает статус 400 Bad Request.
//
////Добавить в методы из шага 5 новые исключения.
//
////1. В метод с добавлением сотрудника нужно добавить выброс
//// исключения из шага 7 в ситуации, когда массив переполнен.
////2. В метод с добавлением сотрудника нужно добавить выброс
//// исключения из шага 8 в ситуации, когда добавляемый сотрудник уже имеется в массиве.
////3. В метод с удалением сотрудника нужно добавить выброс
//// исключения из шага 6 в ситуации, когда удаляемый сотрудник не найден.
////4. В метод с поиском сотрудника нужно добавить выброс
//// исключения из шага 8 в ситуации, когда сотрудник не найден.
////
//
////### Шаг 11
////
////Объявить в контроллере 3 метода:
////
////1. По адресу /employee/add?firstName=Ivan&lastName=Ivanov должен
//// вернуться объект Employee в формате JSON, т. е.
//// { "firstName": "Ivan", "lastName": "Ivanov" }, или исключение
//// со статусом 500 Internal Server Error в случае переполнения
//// массива или 400 Bad Request в случае, когда сотрудник уже существует.
////2. По адресу /employee/remove?firstName=Ivan&lastName=Ivanov
//// должен вернуться объект Employee в формате JSON, т. е.
//// { "firstName": "Ivan", "lastName": "Ivanov" }, или исключение
//// со статусом 404 Not Found, если сотрудник отсутствует.
////3. По адресу /employee/find?firstName=Ivan&lastName=Ivanov должен
//// вернуться объект Employee в формате JSON, т. е.
//// { "firstName": "Ivan", "lastName": "Ivanov" },
//// или исключение со статусом 404 Not Found, если такой сотрудник отсутствует.
////
////### Подсказки
//
//
////3. Возврат статуса осуществляется с помощью аннотации @ResponseStatus.
//
////5. В случае отсутствия одного из параметров Spring должен самостоятельно
//// выводить страницу с ошибкой (аннотация @RequestParam).
//
////7. Spring сам конвертирует ваш объект Employee в JSON. Достаточно просто
//// вернуть его через return в методе контроллера.
//}
// 1
//src/main/java/com/example/exceptions/demoexceptions/Employee.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -1,16 +1,17 @@
//package com.example.exceptions.demoexceptions;
//import java.util.Objects;
//public class Employee {
//    private final String firstName;
//    private final String lastName;
//    public Employee(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//
//    @Override
//    public String toString() {
//        return String.format("Employee: %s %s", firstName, lastName) ;
//    }
//    public String getFirstName() {
//        return firstName;
//    }
//    public String getLastName() {
//        return lastName;
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName);
//    }
//}
// 1
//src/main/java/com/example/exceptions/demoexceptions/EmployeeController.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -1,19 +1,20 @@
//package com.example.exceptions.demoexceptions;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
//@RequestMapping(path = "/employee")
//public class EmployeeController {
//    private final EmployeeService employeeService;
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//
//    @GetMapping(path = "/add")
//    public String add(@RequestParam() String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.add(firstName, lastName);
//        return generateMessage(result, "Successfully added");
//    }
//    @GetMapping(path = "/remove")
//    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.remove(firstName, lastName);
//        return generateMessage(result, "Successfully deleted");
//    }
//    @GetMapping(path = "/find")
//    public Employee find(@RequestParam String firstName, @RequestParam String lastName) {
//        return employeeService.find(firstName, lastName);
//    }
//    private String generateMessage(Employee employee, String status) {
//        return String.format("Employee %s %s %s.",
//                employee.getFirstName(),
//                employee.getLastName(),
//                status
//        );
//    }
//}
// 2
//src/main/java/com/example/exceptions/demoexceptions/EmployeeExistsException.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -1,14 +1,16 @@
//package com.example.exceptions.demoexceptions;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//@ResponseStatus(HttpStatus.BAD_REQUEST)
//public class EmployeeExistsException extends RuntimeException {
//    public EmployeeExistsException() {
//        super("Employee Book Already contains this employee");
//    }
//
//
//
////    public EmployeeExistsException(String message) {
////        super(message);
////    }
////
////    public EmployeeExistsException(String message, Throwable cause) {
////        super(message, cause);
////    }
////
////    public EmployeeExistsException(Throwable cause) {
////        super(cause);
////    }
//}
// 1
//src/main/java/com/example/exceptions/demoexceptions/EmployeeNotFoundException.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -1,17 +1,18 @@
//package com.example.exceptions.demoexceptions;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//@ResponseStatus(HttpStatus.NOT_FOUND)
//public class EmployeeNotFoundException extends RuntimeException {
//    private static final String DEFAULT_MESSAGE = "Employee not found";
//    public EmployeeNotFoundException() {
//        super(DEFAULT_MESSAGE);
//    }
//
//
////    public EmployeeNotFoundException(String message) {
////        super(message);
////    }
////
////    public EmployeeNotFoundException(String message, Throwable cause) {
////        super(message, cause);
////    }
////
////    public EmployeeNotFoundException(Throwable cause) {
////        super(cause);
////    }
//}
// 2
//src/main/java/com/example/exceptions/demoexceptions/EmployeeServiceImpl.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -1,36 +1,37 @@
//package com.example.exceptions.demoexceptions;
//import org.springframework.stereotype.Service;
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//   private final Employee[] employees;
//    private int size;
//    public EmployeeServiceImpl () {
//        employees = new Employee[10];
//    }
//    @Override
//    public Employee add(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        return add(newEmployee);
//    }
//    public Employee add(Employee employee) {
//        if (size == employees.length) {
//            throw new EmployeeBookOverflowException();
//    }
//        int index = indexOf(employee);
//        if (index != -1) {
//            throw new EmployeeExistsException();
//        }
//        employees[size++] = employee;
//        return employee;
//    }
//
//
//    @Override
//    public Employee remove(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        return remove(newEmployee);
//    }
//    public Employee remove(Employee employee) {
//        int index = indexOf(employee);
//        if (index != -1) {
//            Employee result = employees[index];
//            System.arraycopy(employees, index +1, employees, index, size - index);
//            size--;
//            return result;
//        }
//        throw new EmployeeNotFoundException();
//    }
//
//
//    @Override
//    public Employee find(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        int index = indexOf(newEmployee);
//        if (index != -1) {
//            return employees[index];
//        }
//        throw new EmployeeNotFoundException();
//    }
//    public int indexOf(Employee employee) {
//        for (int i = 0; i < size; i++) {
//            if (employees[i].equals(employee)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}package com.exceptions.exceptions;
//
//import java.util.Objects;
//
//public class Employee {
//
//    String firstName;
//    String lastName;
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
//    public String toString() {
//        return String.format("Employee: %s %w", lastName, firstName);
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
//}
// 18
//src/main/java/com/exceptions/exceptions/EmployeeBookOverflowException.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,18 @@
//package com.exceptions.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.INSUFFICIENT_STORAGE)
//public class EmployeeBookOverflowException extends RuntimeException {
//
//    public static final String DEFAULT_MESSAGE = "Employee book is full";
//
//    public EmployeeBookOverflowException() {
//        this(DEFAULT_MESSAGE);
//    }
//
//    public EmployeeBookOverflowException(String message) {
//        super(message);
//    }
//}
// 41
//src/main/java/com/exceptions/exceptions/EmployeeController.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,41 @@
//package com.exceptions.exceptions;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping
//public class EmployeeController {
//    private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/add")
//    public String add(@RequestParam String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.add(firstName, lastName);
//        return generateMessage(result, "Successfully added");
//    }
//
//    @GetMapping("/remove")
//    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.remove(firstName, lastName);
//        return generateMessage(result, "Successfully removed");
//    }
//
//    @GetMapping("/find")
//    public Employee find(@RequestParam String firstName, @RequestParam String lastName) {
//        return employeeService.find(firstName, lastName);
//    }
//
//    public String generateMessage(Employee employee, String status) {
//        return String.format("Employee %s %s %s.",
//                employee.getFirstName(),
//                employee.getLastName(),
//                status
//        );
//    }
//}
// 18
//src/main/java/com/exceptions/exceptions/EmployeeExistsException.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,18 @@
//package com.exceptions.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.BAD_REQUEST)
//public class EmployeeExistsException extends RuntimeException {
//
//    public static final String DEFAULT_MESSAGE = "Employee exists";
//
//    public EmployeeExistsException() {
//        this(DEFAULT_MESSAGE);
//    }
//
//    public EmployeeExistsException(String message) {
//        super(message);
//    }
//}
// 18
//src/main/java/com/exceptions/exceptions/EmployeeNotFoundException.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,18 @@
//package com.exceptions.exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(HttpStatus.NOT_FOUND)
//public class EmployeeNotFoundException extends RuntimeException {
//
//        public static final String DEFAULT_MESSAGE = "Employee not Found";
//
//        public EmployeeNotFoundException() {
//            this(DEFAULT_MESSAGE);
//        }
//
//        public EmployeeNotFoundException(String message) {
//            super(message);
//        }
//}
// 16
//src/main/java/com/exceptions/exceptions/EmployeeService.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,16 @@
//package com.exceptions.exceptions;
//
//public interface EmployeeService {
//
//    Employee add(String firstName, String lastName);
//
//    Employee add(Employee employee);
//
//    Employee remove(String firstName, String lastName);
//
//    Employee remove(Employee employee);
//
//    Employee find(String firstName, String lastName);
//
//
//}
// 74
//src/main/java/com/exceptions/exceptions/EmployeeServiceImpl.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,74 @@
//package com.exceptions.exceptions;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//    public static final int DEFAULT_CAPACITY = 10;
//    private final Employee[] employees;
//    private int size;
//
//    public EmployeeServiceImpl() {
//        employees = new Employee[DEFAULT_CAPACITY];
//    }
//
//    @Override
//    public Employee add(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        return add(newEmployee);
//    }
//
//    @Override
//    public Employee add(Employee employee) {
//        if (size == employees.length) {
//            throw new EmployeeBookOverflowException();
//        }
//        int index = indexOf(employee);
//        if (index != -1) {
//            throw new EmployeeExistsException();
//        }
//        employees[size++] = employee;
//        return employee;
//    }
//
//    @Override
//    public Employee remove(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        return add(newEmployee);
//@Avenirre Avenirre on Mar 1, 2022
//remove
//
//@mativaclub	Reply...
//For you:
//    }
//
//    @Override
//    public Employee remove(Employee employee) {
//        int index = indexOf(employee);
//
//        if (index != -1) {
//            Employee result = employees[index];
//            System.arraycopy(employees, index + 1, employees, index, size - index);
//            employees[--size] = null;
//            return result;
//        }
//        throw new EmployeeNotFoundException();
//    }
//
//
//    @Override
//    public Employee find(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        int index = indexOf(newEmployee);
//
//        if (index != -1) {
//            return employees[index];
//        }
//        throw new EmployeeNotFoundException();
//    }
//
//    public int indexOf(Employee employee) {
//        for (int i = 0; i < size; i++) {
//            if (employees[i].equals(employee)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//}
// 1
//src/main/java/com/exceptions/exceptions/ExceptionsApplication.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -1,14 +1,13 @@
//package com.exceptions.exceptions;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication
//public class ExceptionsApplication {
//	public static void main(String[] args) {
//		SpringApplication.run(ExceptionsApplication.class, args);
//	}
