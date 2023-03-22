package old;

public class Api {

//    package com.apihomework.apihomework;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication
//public class ApihomeworkApplication {
//	public static void main(String[] args) {
//		SpringApplication.run(ApihomeworkApplication.class, args);
//	}
//
//
//
//}
// 6
//src/main/java/com/apihomework/apihomework/Main.java
//Viewed
//@@ -0,0 +1,6 @@
//package com.apihomework.apihomework;
//
//public class Main {
//
//        }
//@OlgaLugacheva OlgaLugacheva on Apr 11
//это ненужный класс
//
//@mativaclub	Reply...
//
// 41
//src/main/java/com/apihomework/apihomework/controller/DepartmentController.java
//Viewed
//@@ -0,0 +1,41 @@
//package com.apihomework.apihomework.controller;
//
//import com.apihomework.apihomework.data.Employee;
//import com.apihomework.apihomework.service.DepartmentService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.Map;
//@RestController
//@RequestMapping("/departments")
//public class DepartmentController {
//    private final DepartmentService departmentService;
//
//    public DepartmentController(DepartmentService departmentService) {
//        this.departmentService = departmentService;
//    }
//
//    @GetMapping("/max-salary")
//    public Employee employeeWithMaxSalary(@RequestParam("departmentId") int departmentId) {
//        return departmentService.employeeWithMaxSalary(departmentId);
//    }
//
//    @GetMapping("/min-salary")
//    public Employee employeeWithMinSalary(@RequestParam("departmentId") int departmentId) {
//        return departmentService.employeeWithMinSalary(departmentId);
//    }
//
//    @GetMapping(path="/all", params = "departmentId")
//    public Collection<Employee> findEmployeesByDepartment (@RequestParam("departmentId") int departmentId) {
//        return departmentService.findEmployeesByDepartment(departmentId);
//    }
//
//    @GetMapping("/all")
//    public Map<Integer, List<Employee>> findAllEmployeesByDepartment() {
//        return departmentService.findAllEmployees();
//    }
//}
// 35
//src/main/java/com/apihomework/apihomework/controller/EmployeeController.java
//Viewed
//@@ -0,0 +1,35 @@
//package com.apihomework.apihomework.controller;
//
//import com.apihomework.apihomework.data.Employee;
//import com.apihomework.apihomework.service.EmployeeService;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//public class EmployeeController {
//
//    private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/add")
//    public Employee addEmployee(@RequestParam("firstName") String firstName,
//                                @RequestParam("lastName") String lastName,
//                                @RequestParam("salary") int salary,
//                                @RequestParam("department") int department) {
//        return employeeService.addEmployee(firstName, lastName, salary, department);
//    }
//
//    @GetMapping("/remove")
//    public Employee removeEmployee(@RequestParam("firstName") String firstName,
//                                   @RequestParam("lastName") String lastName) {
//        return employeeService.removeEmployee(firstName, lastName);
//    }
//
//    @GetMapping("/find")
//    public Employee findEmployee(@RequestParam("firstName") String firstName,
//                                @RequestParam("lastName") String lastName) {
//        return employeeService.findEmployee(firstName, lastName);
//}
//}
// 68
//src/main/java/com/apihomework/apihomework/data/Employee.java
//Viewed
//@@ -0,0 +1,68 @@
//package com.apihomework.apihomework.data;
//
//import java.util.Objects;
//
//public class Employee {
//    private String firstName;
//    private String lastName;
//    private int salary;
//    private int departmentId;
//
//    public Employee(String firstName, String lastName, int salary, int departmentId) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.salary = salary;
//        this.departmentId = departmentId;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//    public String getLastName() {
//        return lastName;
//    }
//    public int getSalary() {
//        return salary;
//    }
//    public int getDepartmentId() {
//        return departmentId;
//    }
//
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public void setDepartmentId(int departmentId) {
//        this.departmentId = departmentId;
//    }
//
//    @Override
//    public String toString() {
//        return "FirstName: " + firstName + ",  LastName: " + lastName + ",  Salary: "
//                + salary + ", DepartmentId: " + departmentId;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Float.compare(employee.salary, salary) == 0 && departmentId == employee.departmentId
//                && Objects.equals(firstName, employee.firstName) &&
//                Objects.equals(lastName, employee.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName, salary, departmentId);
//    }
//}
// 6
//src/main/java/com/apihomework/apihomework/exceptions/EmployeeExistsException.java
//Viewed
//@@ -0,0 +1,6 @@
//package com.apihomework.apihomework.exceptions;
//
//public class EmployeeExistsException extends RuntimeException {
//    public EmployeeExistsException(String employee_already_added) {
//    }
//}
// 6
//src/main/java/com/apihomework/apihomework/exceptions/EmployeeNotFoundException.java
//Viewed
//@@ -0,0 +1,6 @@
//package com.apihomework.apihomework.exceptions;
//
//public class EmployeeNotFoundException extends RuntimeException {
//    public EmployeeNotFoundException(String this_employee_not_found) {
//    }
//}
// 17
//src/main/java/com/apihomework/apihomework/service/DepartmentService.java
//Viewed
//@@ -0,0 +1,17 @@
//package com.apihomework.apihomework.service;
//
//import com.apihomework.apihomework.data.Employee;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.Map;
//
//public interface DepartmentService {
//    Employee employeeWithMaxSalary(int departmentId);
//
//    Employee employeeWithMinSalary(int departmentId);
//
//    Collection<Employee> findEmployeesByDepartment(int departmentId);
//
//    Map<Integer, List<Employee>> findAllEmployees();
//}
// 17
//src/main/java/com/apihomework/apihomework/service/EmployeeService.java
//Viewed
//@@ -0,0 +1,17 @@
//package com.apihomework.apihomework.service;
//
//import com.apihomework.apihomework.data.Employee;
//
//import java.util.List;
//
//public interface EmployeeService {
//    Employee addEmployee(String firstName, String lastName, int salary, int department);
//
//    Employee removeEmployee(String firstName, String lastName);
//
//    Employee findEmployee(String firstName, String lastName);
//
//    List<Employee> getAllEmployees();
//
//    String getKey(String firstName, String lastName);
//}
// 54
//src/main/java/com/apihomework/apihomework/service/impl/DepartmentServiceImpl.java
//Viewed
//@@ -0,0 +1,54 @@
//package com.apihomework.apihomework.service.impl;
//
//import com.apihomework.apihomework.exceptions.EmployeeNotFoundException;
//import com.apihomework.apihomework.data.Employee;
//import com.apihomework.apihomework.service.DepartmentService;
//import com.apihomework.apihomework.service.EmployeeService;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//
//@Service
//public class DepartmentServiceImpl implements DepartmentService {
//
//    private final EmployeeService employeeService;
//
//    public DepartmentServiceImpl(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @Override
//    public Employee employeeWithMaxSalary(int departmentId) {
//        return employeeService.getAllEmployees().stream()
//                .filter(employee -> employee.getDepartmentId() == departmentId)
//                .max(Comparator.comparingInt(Employee::getSalary))
//                .orElseThrow(() -> new EmployeeNotFoundException("This employee not found"));
//    }
//
//    @Override
//    public Employee employeeWithMinSalary(int departmentId) {
//        return employeeService.getAllEmployees().stream()
//                .filter(e -> e.getDepartmentId() == departmentId)
//                .min(Comparator.comparingInt(Employee::getSalary))
//                .orElseThrow(() -> new EmployeeNotFoundException("This employee not found"));
//    }
//
//    @Override
//    public Collection<Employee> findEmployeesByDepartment(int departmentId) {
//        return employeeService.getAllEmployees().stream()
//                .filter(employee -> employee.getDepartmentId() == departmentId)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public Map<Integer, List<Employee>> findAllEmployees() {
//        return employeeService.getAllEmployees().stream()
//                .collect(Collectors.groupingBy(Employee::getDepartmentId));
//    }
//
//}
// 56
//src/main/java/com/apihomework/apihomework/service/impl/EmployeeServiceImpl.java
//Viewed
//@@ -0,0 +1,56 @@
//package com.apihomework.apihomework.service.impl;
//
//import com.apihomework.apihomework.exceptions.EmployeeExistsException;
//import com.apihomework.apihomework.data.Employee;
//import com.apihomework.apihomework.exceptions.EmployeeNotFoundException;
//import com.apihomework.apihomework.service.EmployeeService;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    private final Map<String, Employee> employees = new HashMap<>();
//
//    public Employee addEmployee(String firstName, String lastName, int salary, int department) {
//        String key = getKey(firstName, lastName);
//        Employee addEmployee = new Employee(firstName, lastName, salary, department);
//        if (employees.containsKey(key)) {
//            throw new EmployeeExistsException("Employee already added");
//        }
//        employees.put(key, addEmployee);
//        return addEmployee;
//    }
//
//    public Employee removeEmployee(String firstName, String lastName) {
//        String key = getKey(firstName, lastName);
//        if (!employees.containsKey(key)) {
//            throw new EmployeeNotFoundException("Employee not found");
//        }
//        return employees.get(key);
//    }
//
//    public Employee findEmployee(String firstName, String lastName) {
//        String key = getKey(firstName, lastName);
//        if (!employees.containsKey(key)) {
//            throw new EmployeeNotFoundException("Employee not found");
//        }
//        return employees.get(key);
//    }
//
//    @Override
//    public List<Employee> getAllEmployees() {
//        return new ArrayList<>(employees.values());
//    }
//
//    @Override
//    public String getKey(String firstName, String lastName) {
//        return firstName + lastName;
//    }
//
//@@ -1,13 +1,16 @@
//package com.api.stream.api.homework;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication
//public class Application {
//	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
//	}
//
//
//
//
//}
//}
}
