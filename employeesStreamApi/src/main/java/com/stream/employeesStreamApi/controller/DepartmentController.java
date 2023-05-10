package com.stream.employeesStreamApi.controller;

import com.stream.employeesStreamApi.model.Employee;
import com.stream.employeesStreamApi.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    //    /departments/max-salary?departmentId=5
    @GetMapping("/max-salary")
    public Employee maxSalary(@RequestParam int departmentId) {
        return departmentService.maxSalary(departmentId);

    }

    //     /departments/min-salary?departmentId=5
    @GetMapping("/min-salary")
    public Employee minSalary(@RequestParam int departmentId) {
        return departmentService.minSalary(departmentId);
    }
//3. Возвращать всех сотрудников по отделу.

    //    /departments/all?departmentId=5
    @GetMapping("/all")
    public Collection<Employee> allDepartments(@RequestParam int departmentId) {
        return departmentService.allDepartments(departmentId);
    }
//4. Возвращать всех сотрудников с разделением по отделам.

    //     /departments/all
    @GetMapping("/all")
    public Map<Integer, List<Employee>> all() {
        return departmentService.all();

    }








}
