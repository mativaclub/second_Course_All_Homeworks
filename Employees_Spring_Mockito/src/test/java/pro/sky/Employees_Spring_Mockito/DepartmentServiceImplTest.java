package pro.sky.Employees_Spring_Mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.Employees_Spring_Mockito.exceptions.EmployeeNotFoundException;
import pro.sky.Employees_Spring_Mockito.impl.DepartmentServiceImpl;
import pro.sky.Employees_Spring_Mockito.impl.EmployeeServiceImpl;
import pro.sky.Employees_Spring_Mockito.model.Employee;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DepartmentServiceImplTest {
    @Mock
    EmployeeServiceImpl employeeService;
    @InjectMocks
    DepartmentServiceImpl departmentService;

    @Test
    public void shouldTestMaxSalaryThrow() {
        Map<String, Employee> employees = new HashMap<>();
        when(employeeService.getAll()).thenReturn(Collections.unmodifiableCollection(employees.values()));
        assertThrows(EmployeeNotFoundException.class, () -> departmentService.maxSalary(1));
    }

    @Test
    public void shouldTestMaxSalaryWhenEmployeeExists() {
        Map<String, Employee> employees = new HashMap<>();
        Employee employee1 = new Employee("Name1", 1, 20000);
        Employee employee2 = new Employee("Name2", 1, 40000);
        Employee employee3 = new Employee("Name3", 2, 70000);
        employees.put("1", employee1);
        employees.put("2", employee2);
        employees.put("3", employee3);
        when(employeeService.getAll()).thenReturn(Collections.unmodifiableCollection(employees.values()));
        Assertions.assertEquals(employee2, departmentService.maxSalary(1));
    }


    @Test
    public void shouldTestMinSalaryThrow() {
        Map<String, Employee> employees = new HashMap<>();
        when(employeeService.getAll()).thenReturn(Collections.unmodifiableCollection(employees.values()));
        assertThrows(EmployeeNotFoundException.class, () -> departmentService.minSalary(1));
    }

    @Test
    public void shouldTestMinSalaryWhenEmployeeExists() {
        Map<String, Employee> employees = new HashMap<>();
        Employee employee1 = new Employee("Name1", 1, 20000);
        Employee employee2 = new Employee("Name2", 1, 40000);
        Employee employee3 = new Employee("Name3", 2, 70000);
        employees.put("Num1", employee1);
        employees.put("Num2", employee2);
        employees.put("Num3", employee3);
        when(employeeService.getAll()).thenReturn(Collections.unmodifiableCollection(employees.values()));
        Assertions.assertEquals(employee1, departmentService.minSalary(1));
    }


    @Test
    public void shouldReturnEmployeesByDepartment() {
        Map<String, Employee> employees = new HashMap<>();
        Employee employee1 = new Employee("Name1", 1, 20000);
        Employee employee2 = new Employee("Name2", 1, 40000);
        Employee employee3 = new Employee("Name3", 2, 70000);
        employees.put("Num1", employee1);
        employees.put("Num2", employee2);
        employees.put("Num3", employee3);
        Collection<Employee> expectedResult = new ArrayList<>();
        expectedResult.add(employee2);
        expectedResult.add(employee1);
        when(employeeService.getAll()).thenReturn(Collections.unmodifiableCollection(employees.values()));
        Assertions.assertEquals(expectedResult, departmentService.allByDepartment(1));
    }

    @Test
    public void shouldReturnAllEmployees() {
        Map<Integer, List<Employee>> expectedResult = new HashMap<>();
        Employee employee1 = new Employee("Name1", 1, 20000);
        Employee employee2 = new Employee("Name2", 1, 40000);
        Employee employee3 = new Employee("Name3", 2, 70000);
        //List for 1 department
        List<Employee> employeesFromDepartment1 = new ArrayList<>();
        employeesFromDepartment1.add(employee2);
        employeesFromDepartment1.add(employee1);

        //List for 2 department
        List<Employee> employeesFromDepartment2 = new ArrayList<>();
        employeesFromDepartment2.add(employee3);
        //put all to the map
        expectedResult.put(1, employeesFromDepartment1);
        expectedResult.put(2, employeesFromDepartment2);

        //Collection with actual details
        Map<String, Employee> actual = new HashMap<>();
        actual.put("Num2", employee2);
        actual.put("Num1", employee1);
        actual.put("Num3", employee3);
        when(employeeService.getAll()).thenReturn(Collections.unmodifiableCollection(actual.values()));
        Assertions.assertEquals(expectedResult, departmentService.all());
    }


    @Test
    public void salarySumByDepartment() {
        int expectedResults = 60000;
        Map<String, Employee> actual = new HashMap<>();
        Employee employee1 = new Employee("Name1", 1, 20000);
        Employee employee2 = new Employee("Name2", 1, 40000);
        Employee employee3 = new Employee("Name3", 2, 70000);
        actual.put("Num2", employee2);
        actual.put("Num1", employee1);
        actual.put("Num3", employee3);
        when(employeeService.getAll()).thenReturn(Collections.unmodifiableCollection(actual.values()));
        Assertions.assertEquals(expectedResults, departmentService.salarySumByDepartment(1));
    }
}
//@ExtendWith(MockitoExtension.class)
//public class DepartmentServiceImplTest {
//    @Mock
//    private EmployeeService employeeService;
//    @InjectMocks
//    private DepartmentServiceImpl out;
//    @Test
//    public void shouldFindEmployeeWithMaxSalaryByDepartmentId() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertEquals(MAX_SALARY_EMPLOYEE, out.employeeWithMaxSalary(DEPARTMENT_ID));
//    }

//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMAxSalaryInEmptyEmployeeList() {
//        when(employeeService.getAll()).thenReturn(emptyList());
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMaxSalary(DEPARTMENT_ID));
//    }
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMaxSalaryInEmptyDepartment() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMaxSalary(BAD_DEPARTMENT_ID));
//    }
//    @Test
//    public void shouldFindEmployeeWithMinSalaryByDepartmentId() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertEquals(MIN_SALARY_EMPLOYEE, out.employeeWithMinSalary(DEPARTMENT_ID));
//    }
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMinSalaryInEmptyEmployeeList() {
//        when(employeeService.getAll()).thenReturn(emptyList());
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMinSalary(DEPARTMENT_ID));
//    }
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMinSalaryInEmptyDepartment() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMinSalary(BAD_DEPARTMENT_ID));
//    }
//    @Test
//    public void shouldReturnAllEmployeesByDepartmentWhenEmployeeExist() {
//        when(employeeService.getAll()).thenReturn(DIFF_DEPARTMENT_EMPLOYEES);
//        assertEquals(DEPARTMENT_MAP, out.findEmployeeByDepartment(DEPARTMENT_ID));
//        assertEquals(DEPARTMENT_MAP.get(1), out.findEmployeeByDepartment(DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldReturnEmptyMapWhenEmployeeDontExist() {
//        when(employeeService.getAll()).thenReturn(emptyList());
//        assertEquals(emptyMap(), out.findEmployeeByDepartment(DEPARTMENT_ID));
//        assertEquals(emptyMap(), out.getAllEmployeesByDepartment());
//    }
//
//    @Test
//    public void shouldReturnEmployeeDepartmentsWhenDepartmentIsCorrectAndEmployeeExistThere() {
//        when(employeeService.getAll()).thenReturn(DIFF_DEPARTMENT_EMPLOYEES);
//        assertEquals(singletonList(MIN_SALARY_EMPLOYEE), out.findEmployeeByDepartment(DEPARTMENT_ID));
//        assertEquals(singletonList(DIFF_DEPARTMENT_EMPLOYEES), out.findEmployeeByDepartment(BAD_DEPARTMENT_ID));
//        assertEquals(singletonList(DIFFERENT_DEPARTMENT_EMPLOYEE), out.findEmployeeByDepartment(BAD_DEPARTMENT_ID));
//
//    }
//
//    @Test
//    public void shouldReturnEmptyListWhenEmployeeDontFoundInDepartment() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertEquals(emptyList(), out.findEmployeeByDepartment(BAD_DEPARTMENT_ID));
//    }
//}