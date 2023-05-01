package com.collections.lists.employee.impl;

import com.collections.lists.employee.exceptions.EmployeeAlreadyAddedException;
import com.collections.lists.employee.exceptions.EmployeeNotFoundException;
import com.collections.lists.employee.exceptions.EmployeeStorageIsFullException;
import com.collections.lists.employee.model.Employee;
import com.collections.lists.employee.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    public static final int MAX_SIZE = 100;
    private final List<Employee> employeeList;
    public EmployeeServiceImpl() {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        if (employeeList.size() > MAX_SIZE) {
            throw new EmployeeStorageIsFullException();
        }
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    public List<Employee> getAll() {
        return employeeList;
    }
}
