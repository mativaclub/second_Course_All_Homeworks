package com.employeebookcollection.employee.collection.Service;
import com.employeebookcollection.employee.collection.Model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    List<Employee> getEmployeeList();

}




