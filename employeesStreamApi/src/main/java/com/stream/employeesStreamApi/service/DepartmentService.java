package com.stream.employeesStreamApi.service;

import com.stream.employeesStreamApi.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee maxSalary(int departmentId);

    Employee minSalary(int departmentId);

    Collection<Employee> allDepartments(int departmentId);

    Map<Integer, List<Employee>> all();

}
