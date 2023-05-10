package com.stream.employeesStreamApi.controller;

import com.stream.employeesStreamApi.exceptions.EmployeeAlreadyAddedException;
import com.stream.employeesStreamApi.exceptions.EmployeeNotFoundException;
import com.stream.employeesStreamApi.exceptions.EmployeeStorageIsFullException;
import com.stream.employeesStreamApi.model.Employee;
import com.stream.employeesStreamApi.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/add")
    public Employee add(@RequestParam String firstName,
                        @RequestParam String lastName,
                        @RequestParam int department,
                        @RequestParam int salary) {
        try {
            return employeeService.add(firstName, lastName, department, salary);
        } catch (EmployeeAlreadyAddedException | EmployeeStorageIsFullException e) {
            throw new RuntimeException();
        }
    }

    @GetMapping("/remove")
    public Employee add(@RequestParam String firstName,
                        @RequestParam String lastName) {
        try {
            return employeeService.remove(firstName, lastName);
        } catch (EmployeeNotFoundException e) {
            throw new RuntimeException();
        }
    }

    @GetMapping("/find")
    public Employee find(@RequestParam String firstName,
                        @RequestParam String lastName) {
        try {
            return employeeService.find(firstName, lastName);
        } catch (EmployeeNotFoundException e) {
            throw new RuntimeException();
        }
    }

    @GetMapping("/all")
    public String getAll() {
        return employeeService.getAll().toString();
    }

}
