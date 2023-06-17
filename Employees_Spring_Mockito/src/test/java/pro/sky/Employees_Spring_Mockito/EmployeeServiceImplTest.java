package pro.sky.Employees_Spring_Mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.Employees_Spring_Mockito.exceptions.EmployeeAlreadyAddedException;
import pro.sky.Employees_Spring_Mockito.exceptions.EmployeeNotFoundException;
import pro.sky.Employees_Spring_Mockito.exceptions.EmployeeStorageIsFullException;
import pro.sky.Employees_Spring_Mockito.impl.EmployeeServiceImpl;
import pro.sky.Employees_Spring_Mockito.model.Employee;


import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.Employees_Spring_Mockito.TestConstants.*;

public class EmployeeServiceImplTest {
    public final EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

    @Test
    void addEmployeeWhenHeDontExistAndCheckSize() {
        //Checking that the list is empty
        assertEquals(0, employeeServiceImpl.getAll().size());
        //Creating new object of employee, which will be expected
        Employee expectedResult = new Employee(FULL_NAME_1, SALARY_1, DEPARTMENT_ID_1);
        //Adding employee, using actual method, that will be actual
        Employee actualResult = employeeServiceImpl.add(FULL_NAME_1, SALARY_1, DEPARTMENT_ID_1);
        //Comparing expected with actual
        assertEquals(expectedResult, actualResult);
        //Checking if size has been changed
        assertEquals(1, employeeServiceImpl.getAll().size());
    }

    @Test
    void throwEmployeeAlreadyAddedIfEmployeeExists() {
        //Adding employee, using actual method, that will be actual
        Employee actualResult = employeeServiceImpl.add(FULL_NAME_1, SALARY_1, DEPARTMENT_ID_1);
        //Checking if this added employee exists, by getting all employees anc checking with contains
        assertTrue(employeeServiceImpl.getAll().contains(actualResult));
        //Throwing exception when trying to add the same employee
        assertThrows(EmployeeAlreadyAddedException.class, () -> employeeServiceImpl.add(FULL_NAME_1,
                SALARY_1, DEPARTMENT_ID_1));
    }

    @Test
    void throwEmployeeFullListException() {
        for (int i = 0; i < 10; i++) {
            employeeServiceImpl.add(FULL_NAME_1 + i, SALARY_1, DEPARTMENT_ID_1);
        }
        assertThrows(EmployeeStorageIsFullException.class, () -> employeeServiceImpl.add(FULL_NAME_1 + 11,
                SALARY_1, DEPARTMENT_ID_1));
    }

    @Test
    void throwEmployeeNotFoundExceptionIfEmployeeDontExist() {
        assertEquals(0, employeeServiceImpl.getAll().size());
        assertThrows(EmployeeNotFoundException.class, () -> employeeServiceImpl.find(FULL_NAME_1));
    }


    @Test
    void findEmployeeWhenTheyExist() {
        Employee expected = employeeServiceImpl.add(FULL_NAME_1, SALARY_1, DEPARTMENT_ID_1);
        Employee actual = employeeServiceImpl.find(FULL_NAME_1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void removeEmployeeWhenTheyExist() {
        employeeServiceImpl.add(FULL_NAME_1, SALARY_1, DEPARTMENT_ID_1);
        assertEquals(1, employeeServiceImpl.getAll().size());
        employeeServiceImpl.remove(FULL_NAME_1);
        assertFalse(employeeServiceImpl.getEmployees().containsValue(EXPECTED_EMPLOYEE_1));
        assertEquals(0, employeeServiceImpl.getAll().size());
    }

    @Test
    public void returnListOfEmployees() {
        Employee employee1 = employeeServiceImpl.add(FULL_NAME_1, SALARY_1, DEPARTMENT_ID_1);
        Employee employee2 = employeeServiceImpl.add(FULL_NAME_2, SALARY_2, DEPARTMENT_ID_1);
        Collection<Employee> expected = List.of(employee1, employee2);
        Collection<Employee> actual = employeeServiceImpl.getAll();
        assertIterableEquals(expected, actual);
    }
}






