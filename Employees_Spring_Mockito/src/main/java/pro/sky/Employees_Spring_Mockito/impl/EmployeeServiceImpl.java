package pro.sky.Employees_Spring_Mockito.impl;

import org.springframework.stereotype.Service;
import pro.sky.Employees_Spring_Mockito.exceptions.EmployeeAlreadyAddedException;
import pro.sky.Employees_Spring_Mockito.exceptions.EmployeeNotFoundException;
import pro.sky.Employees_Spring_Mockito.exceptions.EmployeeStorageIsFullException;
import pro.sky.Employees_Spring_Mockito.model.Employee;
import pro.sky.Employees_Spring_Mockito.service.EmployeeService;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    public static final int MAX_SIZE = 100;
    private final Map<String, Employee> employees = new HashMap<>();

    @Override
    public Employee add(String fullName, int department, int salary) {
        if (employees.size() > MAX_SIZE) {
            throw new EmployeeStorageIsFullException("Storage is full");
        }
        var key = fullName;
        if (employees.containsKey(key)) {
            throw new EmployeeAlreadyAddedException("Employee already added");
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        employees.put(key, newEmployee);
        return newEmployee;
    }

    @Override
    public String remove(String fullName) {
        employees.remove(fullName);
        return fullName;
    }

    @Override
    public Employee find(String fullName) {
        return employees.get(fullName);
    }
    public Map<String, Employee> getEmployees() {
        return employees;
    }
    @Override
    public Collection<Employee> getAll() {
        return Collections.unmodifiableCollection(employees.values());
    }

}

