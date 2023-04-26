package com.employeebookcollection.employee.collection.Impl;

import com.employeebookcollection.employee.collection.Exceptions.EmployeeAlreadyAddedException;
import com.employeebookcollection.employee.collection.Exceptions.EmployeeNotFoundException;
import com.employeebookcollection.employee.collection.Exceptions.EmployeeStorageIsFullException;
import com.employeebookcollection.employee.collection.Model.Employee;
import com.employeebookcollection.employee.collection.Service.EmployeeService;
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
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.size() > MAX_SIZE) {
            throw new EmployeeStorageIsFullException();
        }
        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException("Employee already added");
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

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}



















