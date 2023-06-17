package pro.sky.Employees_Spring_Mockito.service;

import pro.sky.Employees_Spring_Mockito.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {

    Employee maxSalary(int departmentId);

    Employee minSalary(int departmentId);

    Collection<Employee> allByDepartment(int departmentId);

    Map<Integer, List<Employee>> all();

    int salarySumByDepartment(int departmentId);

}
