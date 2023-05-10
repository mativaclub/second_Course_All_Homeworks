package com.stream.employeesStreamApi.impl;

import com.stream.employeesStreamApi.exceptions.EmployeeAlreadyAddedException;
import com.stream.employeesStreamApi.exceptions.EmployeeNotFoundException;
import com.stream.employeesStreamApi.exceptions.EmployeeStorageIsFullException;
import com.stream.employeesStreamApi.model.Employee;
import com.stream.employeesStreamApi.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    public static final int MAX_SIZE = 100;
    private final Map<String, Employee> employees = new HashMap<>();

    @Override
    public Employee add(String firstName, String lastName, int department, int salary) {
        if (employees.size() > MAX_SIZE) {
            throw new EmployeeStorageIsFullException("Storage is full");
        }
        var key = firstName + " " + lastName + " " + department + " " + salary;
        if (employees.containsKey(key)) {
            throw new EmployeeAlreadyAddedException("Employee already added");
        }
        Employee newEmployee = new Employee(firstName, lastName, department, salary);
        employees.put(key, newEmployee);
        return newEmployee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        var key = firstName + " " + lastName;
        var removed = employees.remove(key);
        if (removed == null) {
            throw new EmployeeNotFoundException("Employee not found");
        }
        return removed;
    }

    @Override
    public Employee find(String firstName, String lastName) {
        var key = firstName + " " + lastName;
        var found = employees.get(key);
        if (found == null) {
            throw new EmployeeNotFoundException("Employee not found");
        }
        return found;
    }

    @Override
    public Collection<Employee> getAll() {
        return Collections.unmodifiableCollection(employees.values());
    }





}
