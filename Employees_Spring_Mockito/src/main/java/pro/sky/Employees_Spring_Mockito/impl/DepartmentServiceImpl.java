package pro.sky.Employees_Spring_Mockito.impl;

import org.springframework.stereotype.Service;
import pro.sky.Employees_Spring_Mockito.exceptions.EmployeeNotFoundException;
import pro.sky.Employees_Spring_Mockito.model.Employee;
import pro.sky.Employees_Spring_Mockito.service.DepartmentService;
import pro.sky.Employees_Spring_Mockito.service.EmployeeService;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @Override
    public Employee maxSalary(int departmentId) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .max(Comparator.comparingInt(employee -> employee.getSalary()))
                .orElseThrow(() -> new EmployeeNotFoundException("Not found"));
    }

    public Employee minSalary(int departmentId) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow(() -> new EmployeeNotFoundException("Not found"));
    }

    public Collection<Employee> allByDepartment(int departmentId) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .collect(Collectors.toList());
    }

    @Override
    public Map<Integer, List<Employee>> all() {
        return employeeService.getAll().stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartmentId()));
    }

    @Override
    public int salarySumByDepartment(int departmentId) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .mapToInt(Employee::getSalary)
                .sum();
    }



}
