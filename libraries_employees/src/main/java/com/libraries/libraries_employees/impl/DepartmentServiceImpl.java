package com.libraries.libraries_employees.impl;


import com.libraries.libraries_employees.exceptions.EmployeeNotFoundException;
import com.libraries.libraries_employees.model.Employee;
import com.libraries.libraries_employees.service.DepartmentService;
import com.libraries.libraries_employees.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @Override
    public Employee maxSalary(int departmentId) {
       return employeeService.getAll().stream()
               .filter(employee -> employee.getDepartmentId() == departmentId)
               .max(Comparator.comparingInt(employee -> employee.getSalary()))
               .orElseThrow(() -> new EmployeeNotFoundException("Not found"));
    }

    public Employee minSalary(int departmentId) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow(() -> new EmployeeNotFoundException("Not found"));
    }

    public Collection<Employee> allByDepartment(int departmentId) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .collect(Collectors.toList());
    }

    @Override
    public Map<Integer, List<Employee>> all() {
        return employeeService.getAll().stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartmentId()));
    }


}
