package com.stream.employeesStreamApi.service;

import com.stream.employeesStreamApi.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String firstName, String lastName, int department, int salary);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Collection<Employee> getAll();


}
