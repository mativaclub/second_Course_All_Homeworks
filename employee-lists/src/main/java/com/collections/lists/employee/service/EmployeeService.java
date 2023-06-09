package com.collections.lists.employee.service;

import com.collections.lists.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    List<Employee> getAll();
}
