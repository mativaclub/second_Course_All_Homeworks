package old;

public class Collections {

//    package com.collectionsone.collectionsone;
//import org.springframework.stereotype.Service;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//    private final List<Employee> employeeList;
//    public EmployeeServiceImpl() {
//        employeeList = new ArrayList<>();
//    }
//    @Override
//    public Employee add(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        return add(newEmployee);
//    }
//    @Override
//    public Employee add(Employee employee) {
//        if (employeeList.contains(employee)) {
//            throw new EmployeeExistsException();
//        }
//        employeeList.add(employee);
//        return employee;
//    }
//    @Override
//    public Employee remove(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        return add(newEmployee);
//    }
//    @Override
//    public Employee remove(Employee employee) {
//        if (!employeeList.remove(employee)) {
//            throw new EmployeeNotFoundException();
//        }
//        return employee;
//    }
//    @Override
//    public Employee find(String firstName, String lastName) {
//        Employee employee = new Employee(firstName, lastName);
//        if (employeeList.remove(employee)) {
//            return employee;
//        }
//        throw new EmployeeNotFoundException();
//    }
//
//
//    @Override
//    public Collection <Employee> getAll() {
//        return (employeeList);





//    @SpringBootApplication
//public class CollectionsfirstApplication {
//
//
//	public static void main(String[] args) {
//		SpringApplication.run(CollectionsfirstApplication.class, args);
//	}




//    package com.collectionsfirst.collectionsfirst;
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
//src/main/java/com/collectionsfirst/collectionsfirst/EmployeeBookOverflowException.java
//@@ -0,0 +1,18 @@
//package com.collectionsfirst.collectionsfirst;
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
// 48
//src/main/java/com/collectionsfirst/collectionsfirst/EmployeeController.java
//@@ -0,0 +1,48 @@
//package com.collectionsfirst.collectionsfirst;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collection;
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
//    @GetMapping("/all")
//    public Collection<Employee> all() {
//        return employeeService.getAll();
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
//src/main/java/com/collectionsfirst/collectionsfirst/EmployeeExistsException.java
//@@ -0,0 +1,18 @@
//package com.collectionsfirst.collectionsfirst;
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
//src/main/java/com/collectionsfirst/collectionsfirst/EmployeeNotFoundException.java
//@@ -0,0 +1,18 @@
//package com.collectionsfirst.collectionsfirst;
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
// 18
//src/main/java/com/collectionsfirst/collectionsfirst/EmployeeService.java
//@@ -0,0 +1,18 @@
//package com.collectionsfirst.collectionsfirst;
//
//import java.util.Collection;
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
//    Collection<Employee> getAll();
//}
// 64
//src/main/java/com/collectionsfirst/collectionsfirst/EmployeeServiceImpl.java
//@@ -0,0 +1,64 @@
//package com.collectionsfirst.collectionsfirst;
//
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
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
//    }
//
//    @Override
//    public Employee add(Employee employee) {
//        if (employeeList.contains(employee)) {
//            throw new EmployeeExistsException();
//        }
//        employeeList.add(employee);
//        return employee;
//    }
//
//    @Override
//    public Employee remove(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        return add(newEmployee);
//    }
//
//    @Override
//    public Employee remove(Employee employee) {
//
//        if (!employeeList.remove(employee)) {
//            throw new EmployeeNotFoundException();
//        }
//        return employee;
//    }
//
//
//    @Override
//    public Employee find(String firstName, String lastName) {
//        Employee employee = new Employee(firstName, lastName);
//        if (employeeList.remove(employee)) {
//            return employee;
//        }
//        throw new EmployeeNotFoundException();
//    }
//
//
//    @Override
//    public Collection <Employee> getAll() {
//        return (employeeList);
//    }
//
//}

//    import java.util.Collection;
//
//@RestController
//@RequestMapping
//@RequestMapping("/employee")
//public class EmployeeController {
//    private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//    @GetMapping("/add")
//    public String add(@RequestParam String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.add(firstName, lastName);
//        return generateMessage(result, "Successfully added");
//    }
//    @GetMapping("/remove")
//    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
//        Employee result = employeeService.remove(firstName, lastName);
//        return generateMessage(result, "Successfully removed");
//    }
//    @GetMapping("/find")
//    public Employee find(@RequestParam String firstName, @RequestParam String lastName) {
//        return employeeService.find(firstName, lastName);
//    }
//    @GetMapping("/all")
//    public Collection<Employee> all() {
//        return employeeService.getAll();
//    }
//    public String generateMessage(Employee employee, String status) {
//        return String.format("Employee %s %s %s.",
//                employee.getFirstName(),
//                employee.getLastName(),
//                status
//        );
//    }
//}
//    package ru.skypro;
//
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
//        List<String> words = new ArrayList<>(List.of("прыг", "скок", "мяу", "квак", "прыг", "скок", "рык"));
//        printOddNumbers(nums);
//        System.out.println();
//        printUniqueEvenNumbers(nums);
//        System.out.println();
//        printUniqueWords(words);
//        System.out.println();
//        printDoublesSize(words);
//    }
//
//    public static void printOddNumbers(List<Integer> nums) {
//        for (int num : nums) {
//            if (num % 2 != 0) {
//                System.out.print(num + " ");
//            }
//        }
//    }
//
//    public static void printUniqueEvenNumbers(List<Integer> nums) {
//        List<Integer> uniqueEvenNumbers = new ArrayList<>(Set.copyOf(nums));
//        Collections.sort(uniqueEvenNumbers);
//        uniqueEvenNumbers.removeIf(num -> num % 2 != 0);
//        for (Integer num:uniqueEvenNumbers) {
//                System.out.print(num + " ");
//            }
//        }
//
//    public static void printUniqueWords(List<String> words) {
//        Set<String> uniqueWords = new HashSet<>(words);
//        List<String> duplicates = new ArrayList<>(words);
//        for (String uniqueWord:uniqueWords) {
//            duplicates.remove(uniqueWord);
//        }
//        uniqueWords.removeAll(duplicates);
//        System.out.println(uniqueWords);
//    }
//
//    public static void printDoublesSize(List<String> words) {
//        Set<String> doubles = new HashSet<>(words);
//        System.out.println(words.size()-doubles.size());
//    }
//}


//    package com.collectionsfinal.collectionsfinal;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication
//public class CollectionsfinalApplication {
//	public static void main(String[] args) {
//		SpringApplication.run(CollectionsfinalApplication.class, args);
//	}
//
//
//
//}
// 40
//src/main/java/com/collectionsfinal/collectionsfinal/Employee.java
//Viewed
//@@ -0,0 +1,40 @@
//package com.collectionsfinal.collectionsfinal;
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
//    public String toString() {
//        return String.format("Employee: %s %s", lastName, firstName);
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
// 48
//src/main/java/com/collectionsfinal/collectionsfinal/EmployeeController.java
//Viewed
//@@ -0,0 +1,48 @@
//package com.collectionsfinal.collectionsfinal;
//
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
//    @GetMapping("/all")
//    public Collection<Employee> all() {
//        return employeeService.getAll();
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
//src/main/java/com/collectionsfinal/collectionsfinal/EmployeeExistsException.java
//Viewed
//@@ -0,0 +1,18 @@
//package com.collectionsfinal.collectionsfinal;
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
//src/main/java/com/collectionsfinal/collectionsfinal/EmployeeNotFoundException.java
//Viewed
//@@ -0,0 +1,18 @@
//package com.collectionsfinal.collectionsfinal;
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
// 14
//src/main/java/com/collectionsfinal/collectionsfinal/EmployeeService.java
//Viewed
//@@ -0,0 +1,14 @@
//package com.collectionsfinal.collectionsfinal;
//
//import java.util.Collection;
//
//public interface EmployeeService {
//
//    Employee add(String firstName, String lastName);
//
//    Employee remove(String firstName, String lastName);
//
//    Employee find(String firstName, String lastName);
//
//    Collection<Employee> getAll();
//}
// 58
//src/main/java/com/collectionsfinal/collectionsfinal/EmployeeServiceImpl.java
//Viewed
//@@ -0,0 +1,58 @@
//package com.collectionsfinal.collectionsfinal;
//
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    private final Map <String, Employee> employeeList;
//
//    public EmployeeServiceImpl() {
//        employeeList = new HashMap<>();
//    }
//
//    @Override
//    public Employee add(String firstName, String lastName) {
//        String key = getKey(firstName, lastName);
//        if (employeeList.containsKey(key)) {
//            throw new EmployeeExistsException();
//        }
//        Employee newEmployee = new Employee(firstName, lastName);
//        employeeList.put(key, newEmployee);
//        return newEmployee;
//    }
//
//    @Override
//    public Employee remove(String firstName, String lastName) {
//        String key = getKey(firstName, lastName);
//        if (employeeList.remove(key) == null) {
//            throw new EmployeeNotFoundException();
//        }
//        Employee removedEmployee = new Employee(firstName, lastName);
//        return removedEmployee;
//    }
//
//
//    @Override
//    public Employee find(String firstName, String lastName) {
//        String key = getKey(firstName, lastName);
//        Employee employee = employeeList.get(key);
//        if (employee == null) {
//@madyar997 madyar997 on Mar 8
//employee никогда не будет null, так как создан строкой выше. employee нужно получить по ключу key(ключ key сейчас не используется)
//
//@mativaclub	Reply...
//            throw new EmployeeNotFoundException();
//        }
//        return employee;
//    }
//
//
//    @Override
//    public Collection <Employee> getAll() {
//        return Collections.unmodifiableCollection(employeeList.values());
//    }
//
//    private String getKey(String firstName, String lastName) {
//        return firstName + " " + lastName;
//    }
//
//}package com.collectionfirst.collectionfirst;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication
//public class CollectionfirstApplication {
//	public static void main(String[] args) {
//		SpringApplication.run(CollectionfirstApplication.class, args);
//	}
//
//
//
//}
// 40
//src/main/java/com/collectionfirst/collectionfirst/Employee.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,40 @@
//package com.collectionfirst.collectionfirst;
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
// 48
//src/main/java/com/collectionfirst/collectionfirst/EmployeeController.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,48 @@
//package com.collectionfirst.collectionfirst;
//
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
//    @GetMapping("/all")
//    public Collection<Employee> all() {
//        return employeeService.getAll();
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
//src/main/java/com/collectionfirst/collectionfirst/EmployeeExistsException.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,18 @@
//package com.collectionfirst.collectionfirst;
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
//src/main/java/com/collectionfirst/collectionfirst/EmployeeNotFoundException.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,18 @@
//package com.collectionfirst.collectionfirst;
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
// 18
//src/main/java/com/collectionfirst/collectionfirst/EmployeeService.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,18 @@
//package com.collectionfirst.collectionfirst;
//
//import java.util.Collection;
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
//    Collection<Employee> getAll();
//}
// 64
//src/main/java/com/collectionfirst/collectionfirst/EmployeeServiceImpl.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,64 @@
//package com.collectionfirst.collectionfirst;
//
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
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
//    }
//
//    @Override
//    public Employee add(Employee employee) {
//        if (employeeList.contains(employee)) {
//            throw new EmployeeExistsException();
//        }
//        employeeList.add(employee);
//        return employee;
//    }
//
//    @Override
//    public Employee remove(String firstName, String lastName) {
//        Employee newEmployee = new Employee(firstName, lastName);
//        return add(newEmployee);
//    }
//
//    @Override
//    public Employee remove(Employee employee) {
//
//        if (!employeeList.remove(employee)) {
//            throw new EmployeeNotFoundException();
//        }
//        return employee;
//    }
//
//
//    @Override
//    public Employee find(String firstName, String lastName) {
//        Employee employee = new Employee(firstName, lastName);
//        if (employeeList.remove(employee)) {
//            return employee;
//        }
//        throw new EmployeeNotFoundException();
//    }
//
//
//    @Override
//    public Collection <Employee> getAll() {
//        return (employeeList);
//    }
//
//}package ru.skypro;
//
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
//        List<String> words = new ArrayList<>(List.of("прыг", "скок", "мяу", "квак", "прыг", "скок", "рык"));
//        printOddNumbers(nums);
//        System.out.println();
//        printUniqueEvenNumbers(nums);
//        System.out.println();
//        printUniqueWords(words);
//        System.out.println();
//        printDoublesSize(words);
//    }
//
//    public static void printOddNumbers(List<Integer> nums) {
//        for (int num : nums) {
//            if (num % 2 != 0) {
//                System.out.print(num + " ");
//            }
//        }
//    }
//
//    public static void printUniqueEvenNumbers(List<Integer> nums) {
//        List<Integer> uniqueEvenNumbers = new ArrayList<>(Set.copyOf(nums));
//        Collections.sort(uniqueEvenNumbers);
//        uniqueEvenNumbers.removeIf(num -> num % 2 != 0);
//        for (Integer num:uniqueEvenNumbers) {
//@rmuhamedgaliev rmuhamedgaliev on Mar 8, 2022
//Можно и так, но можно и через SET еше
//
//@mativaclub	Reply...
//For you:
//                System.out.print(num + " ");
//            }
//        }
//
//    public static void printUniqueWords(List<String> words) {
//        Set<String> uniqueWords = new HashSet<>(words);
//        List<String> duplicates = new ArrayList<>(words);
//        for (String uniqueWord:uniqueWords) {
//            duplicates.remove(uniqueWord);
//        }
//        uniqueWords.removeAll(duplicates);
//        System.out.println(uniqueWords);
//    }
//
//    public static void printDoublesSize(List<String> words) {
//        Set<String> doubles = new HashSet<>(words);
//        System.out.println(words.size()-doubles.size());
//    }
//}
//
//
//package com.collectionsfinal.collectionsfinal;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication
//public class CollectionsfinalApplication {
//	public static void main(String[] args) {
//		SpringApplication.run(CollectionsfinalApplication.class, args);
//	}
//
//
//
//}
// 40
//src/main/java/com/collectionsfinal/collectionsfinal/Employee.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,40 @@
//package com.collectionsfinal.collectionsfinal;
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
//    public String toString() {
//        return String.format("Employee: %s %s", lastName, firstName);
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
// 48
//src/main/java/com/collectionsfinal/collectionsfinal/EmployeeController.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,48 @@
//package com.collectionsfinal.collectionsfinal;
//
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
//    @GetMapping("/all")
//    public Collection<Employee> all() {
//        return employeeService.getAll();
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
//src/main/java/com/collectionsfinal/collectionsfinal/EmployeeExistsException.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,18 @@
//package com.collectionsfinal.collectionsfinal;
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
//src/main/java/com/collectionsfinal/collectionsfinal/EmployeeNotFoundException.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,18 @@
//package com.collectionsfinal.collectionsfinal;
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
// 14
//src/main/java/com/collectionsfinal/collectionsfinal/EmployeeService.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,14 @@
//package com.collectionsfinal.collectionsfinal;
//
//import java.util.Collection;
//
//public interface EmployeeService {
//
//    Employee add(String firstName, String lastName);
//
//    Employee remove(String firstName, String lastName);
//
//    Employee find(String firstName, String lastName);
//
//    Collection<Employee> getAll();
//}
// 58
//src/main/java/com/collectionsfinal/collectionsfinal/EmployeeServiceImpl.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,58 @@
//package com.collectionsfinal.collectionsfinal;
//
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    private final Map <String, Employee> employeeList;
//
//    public EmployeeServiceImpl() {
//        employeeList = new HashMap<>();
//    }
//
//    @Override
//    public Employee add(String firstName, String lastName) {
//        String key = getKey(firstName, lastName);
//        if (employeeList.containsKey(key)) {
//            throw new EmployeeExistsException();
//        }
//        Employee newEmployee = new Employee(firstName, lastName);
//        employeeList.put(key, newEmployee);
//        return newEmployee;
//    }
//
//    @Override
//    public Employee remove(String firstName, String lastName) {
//        String key = getKey(firstName, lastName);
//        if (employeeList.remove(key) == null) {
//            throw new EmployeeNotFoundException();
//        }
//        Employee removedEmployee = new Employee(firstName, lastName);
//        return removedEmployee;
//    }
//
//
//    @Override
//    public Employee find(String firstName, String lastName) {
//        String key = getKey(firstName, lastName);
//        Employee employee = employeeList.get(key);
//        if (employee == null) {
//@madyar997 madyar997 on Mar 8, 2022
//employee никогда не будет null, так как создан строкой выше. employee нужно получить по ключу key(ключ key сейчас не используется)
//
//@mativaclub	Reply...
//For you:
//            throw new EmployeeNotFoundException();
//        }
//        return employee;
//    }
//
//
//    @Override
//    public Collection <Employee> getAll() {
//        return Collections.unmodifiableCollection(employeeList.values());
//    }
//
//    private String getKey(String firstName, String lastName) {
//        return firstName + " " + lastName;
//    }
//
//}
//
//
//    }
}
