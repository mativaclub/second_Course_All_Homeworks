package com.stream.employeesStreamApi.service.impl;

import com.stream.employeesStreamApi.exceptions.EmployeeNotFoundException;
import com.stream.employeesStreamApi.model.Employee;
import com.stream.employeesStreamApi.service.DepartmentService;
import com.stream.employeesStreamApi.service.EmployeeService;
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
