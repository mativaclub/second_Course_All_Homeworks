package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DepartmentService {
    private final EmployeeService employeeService;
    public DepartmentService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void changeDepartment(Employee employee, int newDepartment) {
        employeeService.getAll().stream()
                .filter(value -> Objects.equals(employee, value))
                .findFirst()
                .ifPresent(value -> {
                    value.setDepartment(newDepartment);
                });
    }
    public Collection<Employee> findEmployeesByDepartment(int departmentId) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartment() == departmentId)
                .collect(Collectors.toList());
    }
//    public void indexSalariesForDepartment(double index, int department) {
//        employeeService.getAll().stream()
//                .filter(employee -> employee.getDepartment() == department)
//                .forEach(employee -> employee.getClass(
//                        (int) (employee.getSalary() + employee.getSalary() * index / 100)));
//    }
    public double averageSalaryForDepartment(int department) {
        double orElse = employeeService.getAll().stream()
                .filter(employee -> employee.getDepartment() == department)
                .mapToInt(Employee::getSalary)
                .average()
                .orElse(0);
        return orElse;
    }

    public Employee findEmployeeWithMinSalaryFromDepartment(int department) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartment() == department)
                .min(Comparator.comparing(Employee::getSalary))
                .orElse(null);
    }
    public Employee findEmployeeWithMaxSalaryFromDepartment(int department) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartment() == department)
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
    }
    public double totalSalariesForDepartment(int department) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartment() == department)
                .mapToInt(Employee::getSalary)
                .sum();
    }
    public Collection<Employee> findAllEmployeesFromDepartment(int department) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartment() == department)
                .collect(Collectors.toList());
    }

}
