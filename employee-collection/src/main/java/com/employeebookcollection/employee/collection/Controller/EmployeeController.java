package com.employeebookcollection.employee.collection.Controller;

import com.employeebookcollection.employee.collection.Exceptions.EmployeeAlreadyAddedException;
import com.employeebookcollection.employee.collection.Exceptions.EmployeeNotFoundException;
import com.employeebookcollection.employee.collection.Exceptions.EmployeeStorageIsFullException;
import com.employeebookcollection.employee.collection.Model.Employee;
import com.employeebookcollection.employee.collection.Service.EmployeeService;
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
                        @RequestParam String lastName) {
        try {
            return employeeService.add(firstName, lastName);
        } catch (EmployeeAlreadyAddedException | EmployeeStorageIsFullException e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    @GetMapping("/remove")
    public Employee remove(@RequestParam String firstName,
                           @RequestParam String lastName) {
        try {
            return employeeService.remove(firstName, lastName);
        } catch (EmployeeNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    @GetMapping("/find")
    public Employee find(@RequestParam String firstName,
                         @RequestParam String lastName) {
        try {
            return employeeService.find(firstName, lastName);
        } catch (EmployeeNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }

    }


    @GetMapping("/getList")
    public String getAllList() {
        return employeeService.getEmployeeList().toString();
    }


}
