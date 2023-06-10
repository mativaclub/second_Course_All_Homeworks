package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
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
    public Employee add(@RequestParam String name, @RequestParam String surname, @RequestParam int department,
                        @RequestParam int salary) {
        return employeeService.add(name, surname, department, salary);
    }


    @GetMapping("/remove")
    public Employee remove(@RequestParam String name, @RequestParam String surname, @RequestParam int department,
                           @RequestParam int salary) {
        return employeeService.remove(name, surname, department, salary); //remove
    }
    @GetMapping("/find")
    public Employee find(@RequestParam String name, @RequestParam String surname, @RequestParam int department,
                         @RequestParam int salary) {
        return employeeService.find(name, surname, department, salary);//find
    }


//additional method
    @GetMapping("/all")
    public String getAll() {
        return employeeService.getAll().toString();
    }

}
