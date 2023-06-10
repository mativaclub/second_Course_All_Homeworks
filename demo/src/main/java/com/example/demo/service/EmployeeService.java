package com.example.demo.service;

import com.example.demo.exceptions.EmployeeAlreadyAddedException;
import com.example.demo.exceptions.EmployeeNotFoundException;
import com.example.demo.exceptions.EmployeeStorageIsFullException;
import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {
    private static final int SIZE = 3;
    private final Employee[] employees = new Employee[SIZE];

        public Collection<Employee> getAll() {
            return List.of(employees);
        }


    public Employee add(String firstName, String lastName, int department, int salary) {
        int indexForAdding = -1;
        Employee employee = new Employee(firstName, lastName, department, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null && indexForAdding == -1) {
                indexForAdding = i;
            }
            if (employees[i] != null && employees[i].equals(employee)) {
                throw new EmployeeAlreadyAddedException();
            }
        }
        if (indexForAdding == -1) {
            throw new EmployeeStorageIsFullException();
        }
        employees[indexForAdding] = employee;
        return employees[indexForAdding];
    }
    public Employee find(String name, String surname, int department, int salary) {
        Employee employee = new Employee(name, surname, department, salary);
        for (Employee emp : employees) {
            if (employee.equals(emp)) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException();
    }
    public Employee remove(String name, String surname, int department, int salary) {
        Employee employee = new Employee(name, surname, department, salary);
        for (int i = 0; i < employees.length; i++) {
            employees[i] = null;
            return employee;
        }
        throw new EmployeeNotFoundException();
    }


}
