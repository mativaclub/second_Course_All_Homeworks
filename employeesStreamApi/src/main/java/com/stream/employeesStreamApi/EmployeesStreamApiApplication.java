package com.stream.employeesStreamApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeesStreamApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesStreamApiApplication.class, args);
	}


//Шаг 3. Заменить реализацию через циклы на Stream API. Написать новый контроллер и сервис, которые будут:
//
//1. Возвращать сотрудника с максимальной зарплатой на основе номера отдела, который приходит в запрос из браузера.

//    /departments/max-salary?departmentId=5

//2.  Возвращать сотрудника с минимальной зарплатой на основе номера отдела.

//     /departments/min-salary?departmentId=5

//3. Возвращать всех сотрудников по отделу.

//    /departments/all?departmentId=5

//4. Возвращать всех сотрудников с разделением по отделам.

//     /departments/all

//
//- *Подсказка*
//
//    Для того чтобы получить список сотрудников, надо в новый сервис заинжектить старый сервис и
//    запросить список всех сотрудников, затем этот список пропустить через Stream API.
//
//    Для поиска минимальной или максимальной зарплаты нужно после фильтрации использовать
//    методы min и max, передав в качестве компаратора строку кода, представленную ниже.
//
//    ```java
//    Comparator.comparingInt(employee -> employee.getSalary())
//    ```
//
//- Критерии оценки:
//    - В поле Employee  добавлены новые поля «Зарплата» и «Отдел»
//    - Переписаны контроллер и сервис, которые возвращают сотрудника с максимальной зарплатой
//    на основе номера отдела, который приходит в запрос из браузера.
//    - Переписаны контроллер и сервис, которые возвращают сотрудника с минимальной зарплатой
//    на основе номера отдела.
//    - Переписаны контроллер и сервис, которые возвращают всех сотрудников по отделу
//    - Переписаны контроллер и сервис, которые возвращают всех сотрудников с разделением по отделам.
//    - Реализация проекта заменена на циклы на Stream API.
//

//- Смотреть
//    1. ***Нужно сотрудников также с помощью метода add добавлять, или же в main создать записи
//    о сотрудниках ?***
//
//    **Ответ**:  Все действия в программе  мы теперь проводим через сервис с методом add.
//
//    1. ***В домашке написано "В текущий проект на Spring перенести методы работы с отделами из
//    курсовой работы." Но в курсовой работе почти все методы завязаны на зарплате (общая сумма
//    за, минимальная, максимальная, средняя и вывод ФИО сотрудников). Это имеется в виду?***
//
//    **Ответ**: Да, нужно перенести те поля, которые ранее не использовались и, соответственно,
//    методы по поиску зарплаты среди сотрудников департамента.
//




















//@RestController
//@RequestMapping("/departments")
//public class DepartmentController {
//    private final DepartmentService departmentService;
//
//    public DepartmentController(DepartmentService departmentService) {
//        this.departmentService = departmentService;
//    }
//
//    @GetMapping("/max-salary")
//    public Employee employeeWithMaxSalary(@RequestParam("departmentId") int departmentId) {
//        return departmentService.employeeWithMaxSalary(departmentId);
//    }
//
//    @GetMapping("/min-salary")
//    public Employee employeeWithMinSalary(@RequestParam("departmentId") int departmentId) {
//        return departmentService.employeeWithMinSalary(departmentId);
//    }
//
//    @GetMapping(path="/all", params = "departmentId")
//    public Collection<Employee> findEmployeesByDepartment (@RequestParam("departmentId") int departmentId) {
//        return departmentService.findEmployeesByDepartment(departmentId);
//    }
//
//    @GetMapping("/all")
//    public Map<Integer, List<Employee>> findAllEmployeesByDepartment() {
//        return departmentService.findAllEmployees();
//    }
//}



//public class EmployeeController {
//
//    private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/add")
//    public Employee addEmployee(@RequestParam("firstName") String firstName,
//                                @RequestParam("lastName") String lastName,
//                                @RequestParam("salary") int salary,
//                                @RequestParam("department") int department) {
//        return employeeService.addEmployee(firstName, lastName, salary, department);
//    }
//
//    @GetMapping("/remove")
//    public Employee removeEmployee(@RequestParam("firstName") String firstName,
//                                   @RequestParam("lastName") String lastName) {
//        return employeeService.removeEmployee(firstName, lastName);
//    }
//
//    @GetMapping("/find")
//    public Employee findEmployee(@RequestParam("firstName") String firstName,
//                                @RequestParam("lastName") String lastName) {
//        return employeeService.findEmployee(firstName, lastName);




//public interface DepartmentService {
//    Employee employeeWithMaxSalary(int departmentId);
//
//    Employee employeeWithMinSalary(int departmentId);
//
//    Collection<Employee> findEmployeesByDepartment(int departmentId);
//
//    Map<Integer, List<Employee>> findAllEmployees();



//public interface EmployeeService {
//    Employee addEmployee(String firstName, String lastName, int salary, int department);
//
//    Employee removeEmployee(String firstName, String lastName);
//
//    Employee findEmployee(String firstName, String lastName);
//
//    List<Employee> getAllEmployees();
//
//    String getKey(String firstName, String lastName);




//@Service
//public class DepartmentServiceImpl implements DepartmentService {
//
//    private final EmployeeService employeeService;
//
//    public DepartmentServiceImpl(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @Override
//    public Employee employeeWithMaxSalary(int departmentId) {
//        return employeeService.getAllEmployees().stream()
//                .filter(employee -> employee.getDepartmentId() == departmentId)
//                .max(Comparator.comparingInt(Employee::getSalary))
//                .orElseThrow(() -> new EmployeeNotFoundException("This employee not found"));
//    }
//
//    @Override
//    public Employee employeeWithMinSalary(int departmentId) {
//        return employeeService.getAllEmployees().stream()
//                .filter(e -> e.getDepartmentId() == departmentId)
//                .min(Comparator.comparingInt(Employee::getSalary))
//                .orElseThrow(() -> new EmployeeNotFoundException("This employee not found"));
//    }
//
//    @Override
//    public Collection<Employee> findEmployeesByDepartment(int departmentId) {
//        return employeeService.getAllEmployees().stream()
//                .filter(employee -> employee.getDepartmentId() == departmentId)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public Map<Integer, List<Employee>> findAllEmployees() {
//        return employeeService.getAllEmployees().stream()
//                .collect(Collectors.groupingBy(Employee::getDepartmentId));



//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    private final Map<String, Employee> employees = new HashMap<>();
//
//    public Employee addEmployee(String firstName, String lastName, int salary, int department) {
//        String key = getKey(firstName, lastName);
//        Employee addEmployee = new Employee(firstName, lastName, salary, department);
//        if (employees.containsKey(key)) {
//            throw new EmployeeExistsException("Employee already added");
//        }
//        employees.put(key, addEmployee);
//        return addEmployee;
//    }
//
//    public Employee removeEmployee(String firstName, String lastName) {
//        String key = getKey(firstName, lastName);
//        if (!employees.containsKey(key)) {
//            throw new EmployeeNotFoundException("Employee not found");
//        }
//        return employees.get(key);
//    }
//
//    public Employee findEmployee(String firstName, String lastName) {
//        String key = getKey(firstName, lastName);
//        if (!employees.containsKey(key)) {
//            throw new EmployeeNotFoundException("Employee not found");
//        }
//        return employees.get(key);
//    }
//
//    @Override
//    public List<Employee> getAllEmployees() {
//        return new ArrayList<>(employees.values());
//    }
//
//    @Override
//    public String getKey(String firstName, String lastName) {
//        return firstName + lastName;
//    }


}
