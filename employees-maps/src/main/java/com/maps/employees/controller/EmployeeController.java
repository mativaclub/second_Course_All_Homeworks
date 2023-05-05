package com.maps.employees.controller;

import com.maps.employees.exceptions.EmployeeAlreadyAddedException;
import com.maps.employees.exceptions.EmployeeNotFoundException;
import com.maps.employees.exceptions.EmployeeStorageIsFullException;
import com.maps.employees.model.Employee;
import com.maps.employees.service.EmployeeService;
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
    public Employee add(@RequestParam String firstName, @RequestParam String lastName) {
        try {
            return employeeService.add(firstName, lastName);
        } catch (EmployeeAlreadyAddedException | EmployeeStorageIsFullException e) {
            throw new EmployeeAlreadyAddedException(e.getMessage());
        }
    }


    @GetMapping("/remove")
    public Employee remove(@RequestParam String firstName, @RequestParam String lastName) {
        try {
            return employeeService.remove(firstName, lastName);
        } catch (EmployeeNotFoundException e) {
            throw new EmployeeNotFoundException(e.getMessage());
        }
    }


    @GetMapping("/find")
    public Employee find(@RequestParam String firstName, @RequestParam String lastName) {
        try {
            return employeeService.find(firstName, lastName);
        } catch (EmployeeNotFoundException e) {
            throw new EmployeeNotFoundException(e.getMessage());
        }
    }

    @GetMapping("/all")
    public String all() {
        return employeeService.getAll().toString();
    }
}
