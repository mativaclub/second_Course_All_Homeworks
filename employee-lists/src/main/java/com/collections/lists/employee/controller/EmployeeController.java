package com.collections.lists.employee.controller;

import com.collections.lists.employee.exceptions.EmployeeAlreadyAddedException;
import com.collections.lists.employee.exceptions.EmployeeNotFoundException;
import com.collections.lists.employee.exceptions.EmployeeStorageIsFullException;
import com.collections.lists.employee.model.Employee;
import com.collections.lists.employee.service.EmployeeService;
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
