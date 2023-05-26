package com.libraries.libraries_employees.controller;

import com.libraries.libraries_employees.model.Employee;
import com.libraries.libraries_employees.service.DepartmentService;
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


    @GetMapping("/max-salary")
    public Employee maxSalary(@RequestParam int departmentId) {
        return departmentService.maxSalary(departmentId);

    }

    @GetMapping("/min-salary")
    public Employee minSalary(@RequestParam int departmentId) {
        return departmentService.minSalary(departmentId);

    }

    @GetMapping(path = "/all", params = "/departmentId")
    public Collection<Employee> allByDepartment(@RequestParam int departmentId) {
        return departmentService.allByDepartment(departmentId);

    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> all() {
        return departmentService.all();

    }

}

