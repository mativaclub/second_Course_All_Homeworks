package pro.sky.Employees_Spring_Mockito;

import pro.sky.Employees_Spring_Mockito.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestConstants {
    public static final String FULL_NAME_1 = "Maria Curie";
    public static final String FULL_NAME_2 = "Albert Einstein";
    public static final String FULL_NAME_3 = "Nicola Tesla";
    public static final int SALARY_1 = 50000;
    public static final int SALARY_2 = 30000;
    public static final int SALARY_3 = 70000;
    public static final int DEPARTMENT_ID_1 = 1;
    public static final int DEPARTMENT_ID_2 = 2;
    public static final int WRONG_DEPARTMENT_ID = 2;

    public static final Employee EXPECTED_EMPLOYEE_1 = new Employee(FULL_NAME_1, DEPARTMENT_ID_1, SALARY_1);
    public static final Employee EXPECTED_EMPLOYEE_2 = new Employee(FULL_NAME_2, DEPARTMENT_ID_1, SALARY_2);
    public static final Employee EXPECTED_EMPLOYEE_3 = new Employee(FULL_NAME_3, WRONG_DEPARTMENT_ID, SALARY_3);
    public static final Employee DIFFERENT_DEPARTMENT_EMPLOYEE = new Employee(FULL_NAME_2, WRONG_DEPARTMENT_ID, SALARY_1);

    public static final List<Employee> EMPLOYEES = List.of(EXPECTED_EMPLOYEE_1, EXPECTED_EMPLOYEE_2, EXPECTED_EMPLOYEE_3);



}
