package practice;

public class Mockito {

//    package com.mockito.mockito;
//import com.mockito.mockito.exceptions.EmployeeNotFoundException;
//import com.mockito.mockito.service.EmployeeService;
//import com.mockito.mockito.service.impl.DepartmentServiceImpl;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import static com.mockito.mockito.TestConstants.*;
//import static java.util.Collections.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.Mockito.when;
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

//    package com.mockito.mockito;
//
//import com.mockito.mockito.exceptions.EmployeeNotFoundException;
//import com.mockito.mockito.service.EmployeeService;
//import com.mockito.mockito.service.impl.DepartmentServiceImpl;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static com.mockito.mockito.TestConstants.*;
//import static java.util.Collections.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class DepartmentServiceImplTest {
//
//    @Mock
//    private EmployeeService employeeService;
//
//    @InjectMocks
//    private DepartmentServiceImpl out;
//
//    @Test
//    public void shouldFindEmployeeWithMaxSalaryByDepartmentId() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertEquals(MAX_SALARY_EMPLOYEE, out.employeeWithMaxSalary(DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMAxSalaryInEmptyEmployeeList() {
//        when(employeeService.getAll()).thenReturn(emptyList());
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMaxSalary(DEPARTMENT_ID));
//    }
//
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMaxSalaryInEmptyDepartment() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMaxSalary(BAD_DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldFindEmployeeWithMinSalaryByDepartmentId() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertEquals(MIN_SALARY_EMPLOYEE, out.employeeWithMinSalary(DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMinSalaryInEmptyEmployeeList() {
//        when(employeeService.getAll()).thenReturn(emptyList());
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMinSalary(DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMinSalaryInEmptyDepartment() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMinSalary(BAD_DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldReturnAllEmployeesByDepartmentWhenEmployeeExist() {
//        when(employeeService.getAll()).thenReturn(DIFF_DEPARTMENT_EMPLOYEES);
//        assertEquals(DEPARTMENT_MAP.get(1), out.findEmployeeByDepartment(DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldReturnEmptyMapWhenEmployeeDontExist() {
//        when(employeeService.getAll()).thenReturn(emptyList());
//        assertEquals(emptyMap(), out.getAllEmployeesByDepartment());
//    }
//
//    @Test
//    public void shouldReturnEmployeeDepartmentsWhenDepartmentIsCorrectAndEmployeeExistThere() {
//        when(employeeService.getAll()).thenReturn(DIFF_DEPARTMENT_EMPLOYEES);
//        assertEquals(singletonList(MIN_SALARY_EMPLOYEE), out.findEmployeeByDepartment(DEPARTMENT_ID));
//        assertEquals(singletonList(DIFFERENT_DEPARTMENT_EMPLOYEE), out.findEmployeeByDepartment(BAD_DEPARTMENT_ID));
//
//    }
//
//    @Test
//    public void shouldReturnEmptyListWhenEmployeeDontFoundInDepartment() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertEquals(emptyList(), out.findEmployeeByDepartment(BAD_DEPARTMENT_ID));
//
//    }
//
//
//
//}
// 87
//src/test/java/com/mockito/mockito/EmployeeServiceImplTest.java
//Viewed
//@@ -0,0 +1,87 @@
//package com.mockito.mockito;
//
//import com.mockito.mockito.data.Employee;
//import com.mockito.mockito.exceptions.EmployeeExistException;
//import com.mockito.mockito.exceptions.EmployeeNotFoundException;
//import com.mockito.mockito.service.impl.EmployeeServiceImpl;
//import org.junit.jupiter.api.Test;
//
//import java.util.Collection;
//import java.util.List;
//
//import static com.mockito.mockito.TestConstants.*;
//import static java.util.Collections.emptyList;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class EmployeeServiceImplTest {
//
//    private final EmployeeServiceImpl out = new EmployeeServiceImpl();
//
//    @Test
//    public void shouldAddEmployeeWhenTheyDontExist() {
//
//        Employee expected = new Employee(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//        assertEquals(0, out.getAll().size());
//        assertFalse(out.getAll().contains(expected));
//        Employee actual = out.add(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//        assertEquals(1, out.getAll().size());
//        assertTrue(out.getAll().contains(expected));
//    }
//
//    @Test
//    public void shouldThrowEmployeeExistExceptionWhenTheyExist() {
//        Employee existed = out.add(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//        assertTrue(out.getAll().contains(existed));
//        assertThrows(EmployeeExistException.class,
//                () -> out.add(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY));
//    }
//
//    @Test
//    public void shouldFindEmployeeWhenTheyExist() {
//        Employee existed = out.add(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//        assertEquals(existed, out.find(FIRST_NAME1, LAST_NAME1));
//
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindEmployeeWhichDontExist() {
//        assertEquals(0, out.getAll().size());
//        assertThrows(EmployeeNotFoundException.class,
//                () -> out.find(FIRST_NAME1, LAST_NAME1));
//    }
//
//    @Test
//    public void shouldRemoveEmployeeWhenTheyExist() {
//        Employee expected = out.add(FIRST_NAME1, LAST_NAME1, SALARY, DEPARTMENT_ID);
//        assertEquals(1, out.getAll().size());
//        assertTrue(out.getAll().contains(expected));
//
//        Employee actual = out.remove(FIRST_NAME1, LAST_NAME1);
//        assertEquals(expected, actual);
//        assertTrue(out.getAll().isEmpty());
//        assertFalse(out.getAll().contains(expected));
//
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenRemoveEmployeeWhichDoesntExist() {
//        assertTrue(out.getAll().isEmpty());
//        assertThrows(EmployeeNotFoundException.class,() -> out.find(FIRST_NAME1, LAST_NAME1));
//    }
//
//    @Test
//    public void shouldReturnEmptyCollectionWhenEmployeeDontExist() {
//        assertIterableEquals(emptyList(), out.getAll());
//    }
//
//    @Test
//    public void shouldReturnListOfEmployeesWhenTheyExist() {
//        Employee employee1 = out.add(FIRST_NAME1, LAST_NAME1, SALARY, DEPARTMENT_ID);
//        Employee employee2 = out.add(FIRST_NAME2, LAST_NAME2, SALARY, DEPARTMENT_ID);
//        Collection<Employee> expected = List.of(employee1, employee2);
//        Collection<Employee> actual = out.getAll();
////        assertIterableEquals(expected, actual);
//
//    }
//}
// 31
//src/test/java/com/mockito/mockito/TestConstants.java
//Viewed
//@@ -0,0 +1,31 @@
//package com.mockito.mockito;
//
//import com.mockito.mockito.data.Employee;
//
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class TestConstants {
//
//    public static final String FIRST_NAME1 = "Maria";
//    public static final String FIRST_NAME2 = "Anna";
//    public static final String LAST_NAME1 = "Gabriel";
//    public static final String LAST_NAME2 = "Yan";
//
//    public static final int SALARY = 50000;
//    public static final int MIN_SALARY = 30000;
//
//    public static final int DEPARTMENT_ID = 1;
//    public static final int BAD_DEPARTMENT_ID = 2;
//
//    public static final Employee MAX_SALARY_EMPLOYEE = new Employee(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//    public static final Employee MIN_SALARY_EMPLOYEE = new Employee(FIRST_NAME2, LAST_NAME2, DEPARTMENT_ID, MIN_SALARY);
//    public static final Employee DIFFERENT_DEPARTMENT_EMPLOYEE = new Employee(FIRST_NAME2, LAST_NAME2, BAD_DEPARTMENT_ID, SALARY);
//
//    public static final List<Employee> EMPLOYEES = List.of(MAX_SALARY_EMPLOYEE, MIN_SALARY_EMPLOYEE);
//    public static final List<Employee> DIFF_DEPARTMENT_EMPLOYEES = List.of(MIN_SALARY_EMPLOYEE, DIFFERENT_DEPARTMENT_EMPLOYEE);
//
//    public static final Map<Integer, List<Employee>> DEPARTMENT_MAP = DIFF_DEPARTMENT_EMPLOYEES.stream()
//            .collect(Collectors.groupingBy(Employee::getDepartmentId));
//}

//    package com.mockito.mockito;
//
//import com.mockito.mockito.exceptions.EmployeeNotFoundException;
//import com.mockito.mockito.service.EmployeeService;
//import com.mockito.mockito.service.impl.DepartmentServiceImpl;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static com.mockito.mockito.TestConstants.*;
//import static java.util.Collections.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class DepartmentServiceImplTest {
//
//    @Mock
//    private EmployeeService employeeService;
//
//    @InjectMocks
//    private DepartmentServiceImpl out;
//
//    @Test
//    public void shouldFindEmployeeWithMaxSalaryByDepartmentId() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertEquals(MAX_SALARY_EMPLOYEE, out.employeeWithMaxSalary(DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMAxSalaryInEmptyEmployeeList() {
//        when(employeeService.getAll()).thenReturn(emptyList());
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMaxSalary(DEPARTMENT_ID));
//    }
//
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMaxSalaryInEmptyDepartment() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMaxSalary(BAD_DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldFindEmployeeWithMinSalaryByDepartmentId() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertEquals(MIN_SALARY_EMPLOYEE, out.employeeWithMinSalary(DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMinSalaryInEmptyEmployeeList() {
//        when(employeeService.getAll()).thenReturn(emptyList());
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMinSalary(DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMinSalaryInEmptyDepartment() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMinSalary(BAD_DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldReturnAllEmployeesByDepartmentWhenEmployeeExist() {
//        when(employeeService.getAll()).thenReturn(DIFF_DEPARTMENT_EMPLOYEES);
//        assertEquals(DEPARTMENT_MAP.get(1), out.findEmployeeByDepartment(DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldReturnEmptyMapWhenEmployeeDontExist() {
//        when(employeeService.getAll()).thenReturn(emptyList());
//        assertEquals(emptyMap(), out.getAllEmployeesByDepartment());
//    }
//
//    @Test
//    public void shouldReturnEmployeeDepartmentsWhenDepartmentIsCorrectAndEmployeeExistThere() {
//        when(employeeService.getAll()).thenReturn(DIFF_DEPARTMENT_EMPLOYEES);
//        assertEquals(singletonList(MIN_SALARY_EMPLOYEE), out.findEmployeeByDepartment(DEPARTMENT_ID));
//        assertEquals(singletonList(DIFFERENT_DEPARTMENT_EMPLOYEE), out.findEmployeeByDepartment(BAD_DEPARTMENT_ID));
//
//    }
//
//    @Test
//    public void shouldReturnEmptyListWhenEmployeeDontFoundInDepartment() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertEquals(emptyList(), out.findEmployeeByDepartment(BAD_DEPARTMENT_ID));
//
//    }
//
//
//
//}
// 87
//src/test/java/com/mockito/mockito/EmployeeServiceImplTest.java
//Viewed
//@@ -0,0 +1,87 @@
//package com.mockito.mockito;
//
//import com.mockito.mockito.data.Employee;
//import com.mockito.mockito.exceptions.EmployeeExistException;
//import com.mockito.mockito.exceptions.EmployeeNotFoundException;
//import com.mockito.mockito.service.impl.EmployeeServiceImpl;
//import org.junit.jupiter.api.Test;
//
//import java.util.Collection;
//import java.util.List;
//
//import static com.mockito.mockito.TestConstants.*;
//import static java.util.Collections.emptyList;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class EmployeeServiceImplTest {
//
//    private final EmployeeServiceImpl out = new EmployeeServiceImpl();
//
//    @Test
//    public void shouldAddEmployeeWhenTheyDontExist() {
//
//        Employee expected = new Employee(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//        assertEquals(0, out.getAll().size());
//        assertFalse(out.getAll().contains(expected));
//        Employee actual = out.add(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//        assertEquals(1, out.getAll().size());
//        assertTrue(out.getAll().contains(expected));
//    }
//
//    @Test
//    public void shouldThrowEmployeeExistExceptionWhenTheyExist() {
//        Employee existed = out.add(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//        assertTrue(out.getAll().contains(existed));
//        assertThrows(EmployeeExistException.class,
//                () -> out.add(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY));
//    }
//
//    @Test
//    public void shouldFindEmployeeWhenTheyExist() {
//        Employee existed = out.add(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//        assertEquals(existed, out.find(FIRST_NAME1, LAST_NAME1));
//
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindEmployeeWhichDontExist() {
//        assertEquals(0, out.getAll().size());
//        assertThrows(EmployeeNotFoundException.class,
//                () -> out.find(FIRST_NAME1, LAST_NAME1));
//    }
//
//    @Test
//    public void shouldRemoveEmployeeWhenTheyExist() {
//        Employee expected = out.add(FIRST_NAME1, LAST_NAME1, SALARY, DEPARTMENT_ID);
//        assertEquals(1, out.getAll().size());
//        assertTrue(out.getAll().contains(expected));
//
//        Employee actual = out.remove(FIRST_NAME1, LAST_NAME1);
//        assertEquals(expected, actual);
//        assertTrue(out.getAll().isEmpty());
//        assertFalse(out.getAll().contains(expected));
//
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenRemoveEmployeeWhichDoesntExist() {
//        assertTrue(out.getAll().isEmpty());
//        assertThrows(EmployeeNotFoundException.class,() -> out.find(FIRST_NAME1, LAST_NAME1));
//    }
//
//    @Test
//    public void shouldReturnEmptyCollectionWhenEmployeeDontExist() {
//        assertIterableEquals(emptyList(), out.getAll());
//    }
//
//    @Test
//    public void shouldReturnListOfEmployeesWhenTheyExist() {
//        Employee employee1 = out.add(FIRST_NAME1, LAST_NAME1, SALARY, DEPARTMENT_ID);
//        Employee employee2 = out.add(FIRST_NAME2, LAST_NAME2, SALARY, DEPARTMENT_ID);
//        Collection<Employee> expected = List.of(employee1, employee2);
//        Collection<Employee> actual = out.getAll();
////        assertIterableEquals(expected, actual);
//
//    }
//}
// 31
//src/test/java/com/mockito/mockito/TestConstants.java
//Viewed
//@@ -0,0 +1,31 @@
//package com.mockito.mockito;
//
//import com.mockito.mockito.data.Employee;
//
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class TestConstants {
//
//    public static final String FIRST_NAME1 = "Maria";
//    public static final String FIRST_NAME2 = "Anna";
//    public static final String LAST_NAME1 = "Gabriel";
//    public static final String LAST_NAME2 = "Yan";
//
//    public static final int SALARY = 50000;
//    public static final int MIN_SALARY = 30000;
//
//    public static final int DEPARTMENT_ID = 1;
//    public static final int BAD_DEPARTMENT_ID = 2;
//
//    public static final Employee MAX_SALARY_EMPLOYEE = new Employee(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//    public static final Employee MIN_SALARY_EMPLOYEE = new Employee(FIRST_NAME2, LAST_NAME2, DEPARTMENT_ID, MIN_SALARY);
//    public static final Employee DIFFERENT_DEPARTMENT_EMPLOYEE = new Employee(FIRST_NAME2, LAST_NAME2, BAD_DEPARTMENT_ID, SALARY);
//
//    public static final List<Employee> EMPLOYEES = List.of(MAX_SALARY_EMPLOYEE, MIN_SALARY_EMPLOYEE);
//    public static final List<Employee> DIFF_DEPARTMENT_EMPLOYEES = List.of(MIN_SALARY_EMPLOYEE, DIFFERENT_DEPARTMENT_EMPLOYEE);
//
//    public static final Map<Integer, List<Employee>> DEPARTMENT_MAP = DIFF_DEPARTMENT_EMPLOYEES.stream()
//            .collect(Collectors.groupingBy(Employee::getDepartmentId));
//}package com.mockito.mockito;
//
//import com.mockito.mockito.exceptions.EmployeeNotFoundException;
//import com.mockito.mockito.service.EmployeeService;
//import com.mockito.mockito.service.impl.DepartmentServiceImpl;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static com.mockito.mockito.TestConstants.*;
//import static java.util.Collections.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class DepartmentServiceImplTest {
//
//    @Mock
//    private EmployeeService employeeService;
//
//    @InjectMocks
//    private DepartmentServiceImpl out;
//
//    @Test
//    public void shouldFindEmployeeWithMaxSalaryByDepartmentId() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertEquals(MAX_SALARY_EMPLOYEE, out.employeeWithMaxSalary(DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMAxSalaryInEmptyEmployeeList() {
//        when(employeeService.getAll()).thenReturn(emptyList());
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMaxSalary(DEPARTMENT_ID));
//    }
//
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMaxSalaryInEmptyDepartment() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMaxSalary(BAD_DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldFindEmployeeWithMinSalaryByDepartmentId() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertEquals(MIN_SALARY_EMPLOYEE, out.employeeWithMinSalary(DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMinSalaryInEmptyEmployeeList() {
//        when(employeeService.getAll()).thenReturn(emptyList());
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMinSalary(DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindMinSalaryInEmptyDepartment() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertThrows(EmployeeNotFoundException.class, () -> out.employeeWithMinSalary(BAD_DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldReturnAllEmployeesByDepartmentWhenEmployeeExist() {
//        when(employeeService.getAll()).thenReturn(DIFF_DEPARTMENT_EMPLOYEES);
//        assertEquals(DEPARTMENT_MAP.get(1), out.findEmployeeByDepartment(DEPARTMENT_ID));
//    }
//
//    @Test
//    public void shouldReturnEmptyMapWhenEmployeeDontExist() {
//        when(employeeService.getAll()).thenReturn(emptyList());
//        assertEquals(emptyMap(), out.getAllEmployeesByDepartment());
//    }
//
//    @Test
//    public void shouldReturnEmployeeDepartmentsWhenDepartmentIsCorrectAndEmployeeExistThere() {
//        when(employeeService.getAll()).thenReturn(DIFF_DEPARTMENT_EMPLOYEES);
//        assertEquals(singletonList(MIN_SALARY_EMPLOYEE), out.findEmployeeByDepartment(DEPARTMENT_ID));
//        assertEquals(singletonList(DIFFERENT_DEPARTMENT_EMPLOYEE), out.findEmployeeByDepartment(BAD_DEPARTMENT_ID));
//
//    }
//
//    @Test
//    public void shouldReturnEmptyListWhenEmployeeDontFoundInDepartment() {
//        when(employeeService.getAll()).thenReturn(EMPLOYEES);
//        assertEquals(emptyList(), out.findEmployeeByDepartment(BAD_DEPARTMENT_ID));
//
//    }
//
//
//
//}
// 87
//src/test/java/com/mockito/mockito/EmployeeServiceImplTest.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,87 @@
//package com.mockito.mockito;
//
//import com.mockito.mockito.data.Employee;
//import com.mockito.mockito.exceptions.EmployeeExistException;
//import com.mockito.mockito.exceptions.EmployeeNotFoundException;
//import com.mockito.mockito.service.impl.EmployeeServiceImpl;
//import org.junit.jupiter.api.Test;
//
//import java.util.Collection;
//import java.util.List;
//
//import static com.mockito.mockito.TestConstants.*;
//import static java.util.Collections.emptyList;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class EmployeeServiceImplTest {
//
//    private final EmployeeServiceImpl out = new EmployeeServiceImpl();
//
//    @Test
//    public void shouldAddEmployeeWhenTheyDontExist() {
//
//        Employee expected = new Employee(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//        assertEquals(0, out.getAll().size());
//        assertFalse(out.getAll().contains(expected));
//        Employee actual = out.add(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//        assertEquals(1, out.getAll().size());
//        assertTrue(out.getAll().contains(expected));
//    }
//
//    @Test
//    public void shouldThrowEmployeeExistExceptionWhenTheyExist() {
//        Employee existed = out.add(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//        assertTrue(out.getAll().contains(existed));
//        assertThrows(EmployeeExistException.class,
//                () -> out.add(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY));
//    }
//
//    @Test
//    public void shouldFindEmployeeWhenTheyExist() {
//        Employee existed = out.add(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//        assertEquals(existed, out.find(FIRST_NAME1, LAST_NAME1));
//
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenFindEmployeeWhichDontExist() {
//        assertEquals(0, out.getAll().size());
//        assertThrows(EmployeeNotFoundException.class,
//                () -> out.find(FIRST_NAME1, LAST_NAME1));
//    }
//
//    @Test
//    public void shouldRemoveEmployeeWhenTheyExist() {
//        Employee expected = out.add(FIRST_NAME1, LAST_NAME1, SALARY, DEPARTMENT_ID);
//        assertEquals(1, out.getAll().size());
//        assertTrue(out.getAll().contains(expected));
//
//        Employee actual = out.remove(FIRST_NAME1, LAST_NAME1);
//        assertEquals(expected, actual);
//        assertTrue(out.getAll().isEmpty());
//        assertFalse(out.getAll().contains(expected));
//
//    }
//
//    @Test
//    public void shouldThrowEmployeeNotFoundExceptionWhenRemoveEmployeeWhichDoesntExist() {
//        assertTrue(out.getAll().isEmpty());
//        assertThrows(EmployeeNotFoundException.class,() -> out.find(FIRST_NAME1, LAST_NAME1));
//    }
//
//    @Test
//    public void shouldReturnEmptyCollectionWhenEmployeeDontExist() {
//        assertIterableEquals(emptyList(), out.getAll());
//    }
//
//    @Test
//    public void shouldReturnListOfEmployeesWhenTheyExist() {
//        Employee employee1 = out.add(FIRST_NAME1, LAST_NAME1, SALARY, DEPARTMENT_ID);
//        Employee employee2 = out.add(FIRST_NAME2, LAST_NAME2, SALARY, DEPARTMENT_ID);
//        Collection<Employee> expected = List.of(employee1, employee2);
//        Collection<Employee> actual = out.getAll();
////        assertIterableEquals(expected, actual);
//
//    }
//}
// 31
//src/test/java/com/mockito/mockito/TestConstants.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,31 @@
//package com.mockito.mockito;
//
//import com.mockito.mockito.data.Employee;
//
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class TestConstants {
//
//    public static final String FIRST_NAME1 = "Maria";
//    public static final String FIRST_NAME2 = "Anna";
//    public static final String LAST_NAME1 = "Gabriel";
//    public static final String LAST_NAME2 = "Yan";
//
//    public static final int SALARY = 50000;
//    public static final int MIN_SALARY = 30000;
//
//    public static final int DEPARTMENT_ID = 1;
//    public static final int BAD_DEPARTMENT_ID = 2;
//
//    public static final Employee MAX_SALARY_EMPLOYEE = new Employee(FIRST_NAME1, LAST_NAME1, DEPARTMENT_ID, SALARY);
//    public static final Employee MIN_SALARY_EMPLOYEE = new Employee(FIRST_NAME2, LAST_NAME2, DEPARTMENT_ID, MIN_SALARY);
//    public static final Employee DIFFERENT_DEPARTMENT_EMPLOYEE = new Employee(FIRST_NAME2, LAST_NAME2, BAD_DEPARTMENT_ID, SALARY);
//
//    public static final List<Employee> EMPLOYEES = List.of(MAX_SALARY_EMPLOYEE, MIN_SALARY_EMPLOYEE);
//    public static final List<Employee> DIFF_DEPARTMENT_EMPLOYEES = List.of(MIN_SALARY_EMPLOYEE, DIFFERENT_DEPARTMENT_EMPLOYEE);
//
//    public static final Map<Integer, List<Employee>> DEPARTMENT_MAP = DIFF_DEPARTMENT_EMPLOYEES.stream()
//            .collect(Collectors.groupingBy(Employee::getDepartmentId));
}
