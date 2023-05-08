package com.maps.employees.service;

import com.maps.employees.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Collection<Employee> getAll();
}
