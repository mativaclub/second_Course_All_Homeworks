package pro.sky.Employees_Spring_Mockito.service;

import pro.sky.Employees_Spring_Mockito.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String fullName, int department, int salary);

    String remove(String fullName);

    Employee find(String fullName);

    Collection<Employee> getAll();
}
