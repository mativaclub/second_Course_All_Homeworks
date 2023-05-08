package com.maps.employees.impl;

import com.maps.employees.exceptions.EmployeeAlreadyAddedException;
import com.maps.employees.exceptions.EmployeeNotFoundException;
import com.maps.employees.exceptions.EmployeeStorageIsFullException;
import com.maps.employees.model.Employee;
import com.maps.employees.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    public static final int MAX_SIZE = 100;

    private final Map<String, Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new HashMap<>();
    }


    @Override
    public Employee add(String firstName, String lastName) {
        if (employees.size() > MAX_SIZE) {
            throw new EmployeeStorageIsFullException();
        }
        var key = firstName + " " + lastName;
        if (employees.containsKey(key)) {
            throw new EmployeeAlreadyAddedException();
        }
        Employee employee = new Employee(firstName, lastName);
        employees.put(key, employee);
        return employee;
    }


    @Override
    public Employee remove(String firstName, String lastName) {
        var key = firstName + " " + lastName;
        var removed = employees.remove(key);
        if (removed == null) {
            throw new EmployeeNotFoundException();
        }
        return removed;
    }


    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getKey())) {
            return employees.get(employee.getKey());
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employee> getAll() {
        return Collections.unmodifiableCollection(employees.values());
    }


}
