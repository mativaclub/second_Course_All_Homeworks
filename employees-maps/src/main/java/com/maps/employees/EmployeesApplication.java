package com.maps.employees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesApplication.class, args);
	}



	//1. Перенести проект с EmployeeBook на Map в качестве хранилища сотрудников, реализовав методы
// добавления, удаления и поиска.
//2. Продумать контракт для ключей, чтобы сотрудник с одним ФИО существовал только в одном экземпляре,
// корректно добавлялся и удалялся.
//3. Избавиться от циклов в методах по поиску сотрудника, заменив на методы Map.
//4. Переработать все методы по работе с хранилищем на работу с методами Map.
//- **Критерии оценки**
//    - Все сотрудники существуют только в одном экземпляре
//    - Поиск сотрудников осуществляется с помощью метода
//    - Все методы по работе с хранилищем заменены на мапы
//    - Любого сотрудника можно удалить
//    - Можно добавить нового сотрудника
//    - Проект перенесен на map
//
//🐝 FAQ
//
//Вопросы, которые уже задавали ученики после этого урока.
//
//Возможно, вы найдёте ответ на свой вопрос.
//
//- Смотреть
//    1. ***При добавлении сотрудника в мапу, если такой сотрудник уже есть бросаем ошибку с
//    каким статусом, 404 Bad Request ?***
//
//    **Ответ**: Только 400 , 404 - not found.
//
//    1. ***Как создать ключ, если метод должен принимать только фамилию и имя по изначальным условиям?***
//
//    **Ответ**: Например, конкатенацией имени и фамилии. Напоминаем, что конкатенация это сложение строк.


	//Проект перенесен с EmployeeBook на Map в качестве хранилища сотрудников.
	//Все сотрудники существуют только в одном экземпляре.
	//Можно добавить нового сотрудника.
	//Любого сотрудника можно удалить.
	//Поиск сотрудников осуществляется с помощью метода.
	//Все методы по работе с хранилищем переработаны на работу с методами Map.
	//Вы избавились от циклов в методах по поиску сотрудника, заменив на методы Ma




	//Александр Миленьков
	//01.05.23 15:00
	//Не понял по заданию :
	//
	//1 нужно ли это делать в спринг?
	//
	//2 если не делать в спринг почему тогда в вопросах  к заданию есть такой "
	//
	//
	//При добавлении сотрудника в мапу, если такой сотрудник уже есть бросаем ошибку с каким статусом,
	// 404 Bad Request ?
	//
	//Ответ: Только 400 , 404 - not found."
	//
	//как вернуть HTTP статус без аннотаций?
	//
	//
	//
	//3 нужно сделать какой-то уникальный id в поле ключа в MAP, и предлагается сложить Имя и Фамилию,
	// но ведь это не сделает уникальный ключ, запросто в списке сотрудников может быть несколько
	// Ивановых Иванов? И даже если допустить,что нам нужно хранить только уникальных сотрудников)
	// можно ли например использовать в качестве ключа хешкод Employee, преобразованный в строку?
	//
	//
	//Дмитрий Бизин
	//01.05.23 15:48
	//Привет!
	//
	//
	//
	//Да, нужно выполнять задание в спринговом проекте.
	//По заданию не предполагается сотрудников с одинаковыми именами и фамилиями,
	// иначе бы не было такого требования) Поэтому нужна какая-то функция от имени и
	// фамилии сотрудника, которая даст ключ для мапы. Но в целом можно и другой ключ
	// использовать, не принципиально на самом деле)



	//Станислав Любань
	//03.05.23 11:31
	//Подскажите как исправить ошибку при запуске сервера?
	//
	//Хочу пока вывести содержание моего Map в браузер по запросу lacalhost:8080.
	// но вылетает ошибка 500. а что не так не могу поянть
	//
	//https://github.com/Liuban0Stanislav/Homework2.8/pull/1
	//
	//
	//Артем Петросян
	//03.05.23 14:17
	//Привет, Станислав!
	//
	//
	//
	//Ошибка в том, что в методе контроллера ты обращаешься не к методу сервиса, а к методу контроллера.
	//
	//Из-за этого у тебя будет StackOverflowError.
	//
	//Тебе нужно обратиться к getEmployees() через employeeBook.
	//
	//
	//Станислав Любань
	//03.05.23 14:32
	//Да, уже заметил ))) ох уж эта невнимательность
	//
	//Спасибо!



	//Станислав Любань
	//04.05.23 07:38
	//Здравствуйте!
	//
	//Хочу сделать чтобы при выводе всех сотрудников из Мар в браузер они бы выводились
	// не строкой, а каждый сотрудник в отдельной строке.
	//
	//
	//
	//Это у меня метод из класса Сервис:
	//
	//public StringBuilder printEmployees() {
	//    StringBuilder rezString = new StringBuilder("");
	//    if (employees.isEmpty()){
	//       return rezString.append("интерфейс Map не содержит ни одного сотрудника");
	//    }
	//    for (Employee employee: employees.values()) {
	//        rezString.append(employee.getFullName() + " " + employee.getSalary() + " " + employee.getId() + "\n");
	//    }
	//    return rezString;
	//}
	//
	//
	//Далее он работает в Контроллере:
	//
	//@GetMapping("/")
	//public String getEmployees() {
	//    return "Список всех сотрудников: " + employeeBook.printEmployees();
	//}
	//В браузер все равно выводится все строкой.
	//
	//Однако, если эти же методы я использую в обычном main то все работает как надо. Хм...., что не так?

























	//
//        @RestController
//        public class Controller {
//
//            private EmployeeBook employeeBook;
//
//            public Controller(EmployeeBook employeeBook) {
//                this.employeeBook = employeeBook;
//            }
//
//            @GetMapping("/")
//            public String getEmployees() {
//                return "<pre><h2><b>Список всех сотрудников:</b></h2>\n" + "" + employeeBook.printEmployees() + "<pre>";
//            }
//
//            @GetMapping("/add")
//            public String addEmployee(@RequestParam("fullName") String fullName,
//                                      @RequestParam("salary") int salary,
//                                      @RequestParam("dept") int dept) {
//                if (employeeBook.getEmployees().containsKey(fullName)) {
//                    return "такой сотрудник уже есть";
//                }
//                try {
//                    employeeBook.addEmployee(fullName, salary, dept);
//                } catch (FullMapException e) {
//                    throw new RuntimeException("\u001B[31m Нельзя добавить сотрудника, " +
//                            "достигнут искуственный предел заполнения интерфейса Map\u001B[0m");
//                }
//                return "Сотрудник: " + employeeBook.getEmployees().get(fullName) + " добавлен";
//            }
//
//            @GetMapping("/find")
//            public String findEmployee(@RequestParam("fullName") String fullName) {
//                if (employeeBook.getEmployees().containsKey(fullName)) {
//                    return "Сотрудник: " + employeeBook.getEmployees().get(fullName);
//                } else {
//                    return "Сотрудник не найден";
//                }
//            }
//
//            @GetMapping("/remove")
//            public String removeEmployee(@RequestParam("fullName") String fullName) {
//                try {
//                    employeeBook.removeEmployee(fullName);
//                } catch (NullPointerException e) {
//                    throw new RuntimeException("\u001B[31m Такого сотрудника не существует \u001B[0m");
//                }
//                return "Сотрудник " + fullName + " удален";
//            }
//
//            @GetMapping("/change")
//            public String changeEmployee(@RequestParam("fullNameDeletingEmployee") String fullNameDeletingEmployee,
//                                         @RequestParam("fullNameNewEmployee") String fullNameNewEmployee,
//                                         @RequestParam("newSalary") int newSalary,
//                                         @RequestParam("newDept") int newDept) {
//                try {
//                    employeeBook.changeEmployee(fullNameDeletingEmployee,
//                            fullNameNewEmployee,
//                            newSalary,
//                            newDept);
//                } catch (NullPointerException e) {
//                    throw new RuntimeException("\u001B[31m Такого сотрудника не существует \u001B[0m");
//                }
//                return "Сотрудник " + fullNameDeletingEmployee + " заменен сотрудником " + fullNameNewEmployee;
//            }
//
//            @GetMapping("/printAllEmployeesWithoutDept")
//            public String printAllEmployeesWithoutDept() {
//                return "<pre><h2><b>Список всех сотрудников без отделов:</b></h2>\n" + "" + employeeBook.printEmployeesWithoutDept() + "<pre>";
//            }
//
//            @GetMapping("/printEmployeesAccordingToDept")
//            public String printEmployeesAccordingToDept() {
//                return "<pre><h2><b>Список всех сотрудников по отделам:</b></h2>\n" + "" + employeeBook.printEmployeesAccordingToDept() + "<pre>";
//            }
//
//            @GetMapping("/salaryIndexing")
//            public String salaryIndexing(@RequestParam("percent") double percentOfIndexing) {
//                StringBuilder sb = new StringBuilder("");
//                String bilo = employeeBook.salariesBILO().toString();
//                employeeBook.salaryIndexing(percentOfIndexing);
//                return "<pre><h2><b>Зарплаты БЫЛО:</b></h2>\n" + "" + bilo + "<pre>" +
//                        "<pre><h2><b>Зарплаты СТАЛО:</b></h2>\n" + "" + employeeBook.printEmployees() + "<pre>" +
//                        "<pre><h2>Размер индексации - " + percentOfIndexing + "%</h2></pre>";
//            }
//
//            @GetMapping("/salaryLess")
//            public String salaryLessThan(@RequestParam("lessThan") int salaryLessThan) {
//                return "<pre><h2><b>Сотрудник с зарплатой меньше чем - " + salaryLessThan + " рублей</b></h2><pre>" +
//                        "<pre>" + employeeBook.salaryLessThan(salaryLessThan) + "<pre>";
//
//            }
//            @GetMapping("/salaryMore")
//            public String salaryMoreThan(@RequestParam("moreThan") int salaryMoreThan) {
//                return "<pre><h2><b>Сотрудник с зарплатой больше чем - " + salaryMoreThan + " рублей</b></h2><pre>" +
//                        "<pre>" + employeeBook.salaryMoreThan(salaryMoreThan) + "<pre>";
//
//            }
//        }
//        74 changes: 74 additions & 0 deletions74
//        src/main/java/com/skypro/homework2_8/Employee.java
//        Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//        Comment on this file
//        @@ -0,0 +1,74 @@
//package com.skypro.homework2_8;
//
//import java.util.Objects;
//
//        public class Employee {
//            private String fullName;
//            private int salary;
//            private int dept;
//            private int id;
//            private static int idCounter = 0;
//
//            public Employee(String fullName, int salary, int dept) {
//                this.fullName = fullName;
//                this.salary = salary;
//                this.dept = dept;
//                this.id = idCounter++;
//            }
//
//            public String getFullName() {
//                return fullName;
//            }
//
//            public int getDept() {
//                return dept;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public int getSalary() {
//                return salary;
//            }
//
//            public static int getIdCounter() {
//                return idCounter;
//            }
//
//            public void setFullName(String firstName) {
//                this.fullName = firstName;
//            }
//
//            public void setDept(int dept) {
//                this.dept = dept;
//            }

//            public void setSalary(int salary) {
//                this.salary = salary;
//            }
//
//            @Override
//            public boolean equals(Object o) {
//                if (this == o) return true;
//                if (o == null || getClass() != o.getClass()) return false;
//                Employee employee = (Employee) o;
//                return fullName.equals(employee.fullName);
//            }
//
//            @Override
//            public int hashCode() {
//                int result = 17;
//                result = 31 * result + fullName.hashCode();
//                return result;
//            }
//
//
//            @Override
//            public String toString() {
//                return                  fullName +
//                        " зарплата: " + salary +
//                        ", отдел: " + dept +
//                        ", id: " + id ;
//            }
//        }
//        289 changes: 289 additions & 0 deletions289
//        src/main/java/com/skypro/homework2_8/EmployeeBook.java
//        Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//        Comment on this file
//        @@ -0,0 +1,289 @@
//package com.skypro.homework2_8;

//import com.skypro.homework2_8.execptions.FullMapException;
//import org.springframework.stereotype.Service;
//
//import java.text.DecimalFormat;
//import java.util.*;
//
//        @Service
//        public class EmployeeBook {
//
//            private Map<String, Employee> employees = new HashMap<>(Map.of(
//                    "Попова Варвара Богдановна",
//                    new Employee("Попова Варвара Богдановна", 85_000, 5),
//                    "Петрова Елена Павловна",
//                    new Employee("Петрова Елена Павловна", 87_000, 2),
//                    "Васильев Денис Андреевич",
//                    new Employee("Васильев Денис Андреевич", 65_000, 1),
//                    "Лянге Александр Григорьевич",
//                    new Employee("Лянге Александр Григорьевич", 90_000, 3),
//                    "Кузнецов Александр Семенович",
//                    new Employee("Кузнцов Александр Семенович", 67_000, 4),
//                    "Скворцов Сергей Денисович",
//                    new Employee("Скворцов Сергей Денисович", 63_000, 4)
//            ));
//
//
//            public StringBuilder printEmployees() {
//                StringBuilder rezString = new StringBuilder("");
//                if (employees.isEmpty()) {
//                    return rezString.append("интерфейс Map не содержит ни одного сотрудника");
//                }
//                for (Employee employee : employees.values()) {
//                    rezString.append("- " + employee.getFullName() +
//                            ", зарплата: " + employee.getSalary() +
//                            ", отдел: " + employee.getDept() + "\n");
//                }
//                return rezString;
//            }
//
//
//            public void addEmployee(String fullName, int salary, int dept) {
//                if (Employee.getIdCounter() > 6) {
//                    throw new FullMapException();
//                }
//                employees.put(fullName, new Employee(fullName, salary, dept));
//            }
//
//            public void removeEmployee(String fullName) {
//                if (employees.containsKey(fullName)) {
//                    employees.remove(fullName);
//                } else {
//                    throw new RuntimeException();
//                }
//            }


//            public Map<String, Employee> getEmployees() {
//                return employees;
//            }
//
//            public void changeEmployee(String fullNameDeletingEmlpoyee,
//                                       String fullNameNewEmployee,
//                                       Integer newSalary,
//                                       Integer newDept) {
//                if (employees.containsKey(fullNameDeletingEmlpoyee)) {
//                    removeEmployee(fullNameDeletingEmlpoyee);
//                    addEmployee(fullNameNewEmployee, newSalary, newDept);
//                } else {
//                    throw new NullPointerException();
//                }
//            }
//
//            public StringBuilder printEmployeesWithoutDept() {
//                StringBuilder rezString = new StringBuilder("");
//                if (employees.isEmpty()) {
//                    return rezString.append("интерфейс Map не содержит ни одного сотрудника");
//                }
//                for (Employee employee : employees.values()) {
//                    rezString.append("- " + employee.getFullName() +
//                            ", зарплата: " + employee.getSalary() +
//                            "\n");
//                }
//                return rezString;
//            }


//            public StringBuilder printEmployeesAccordingToDept() {
//                int[] arrDept = new int[employees.size()];
//                /**
//                 * Пытаюсь получить упорядоченный список существующих отделов, где отделы не повторяются.
//                 * Для этого:
//                 * Сохдаю массив arrDept и записываю в него номера существующих отделов в произвольном порядке.
//                 */
//                int i = 0;
//                for (Employee employee: employees.values()) {
//                    arrDept[i++] = employee.getDept();
//                }
//                System.out.println("Несортированный массив arrDept: " + Arrays.toString(arrDept));
//                Arrays.sort(arrDept);
//                System.out.println("Сортированный массив arrDept: " + Arrays.toString(arrDept));
//                int arrElCounter = 1;
//                /**
//                 * После сортировки массива в нем могут быть одинаковые отделы
//                 * Создаю переменную arrElCounter, которая просуммирует уникальные отделы, и станет количеством элементов
//                 * в массиве с сортированными неповторяющимися отделами.
//                 */
//                for (i = 0; i < employees.size() - 1; i++) {
//                    if (arrDept[i] != arrDept[i + 1]) {
//                        arrElCounter++;
//                    }
//                }
//                /**
//                 * Переменная заполнилась и теперь можно создать итоговый массив с отделами arrDeptUnic.
//                 */
//                int[] arrDeptUnic = new int[arrElCounter];
//                /**
//                 * Теперь нужно пройтись циклом по сортированному массиву arrDept,
//                 * выбрать из него неповторяющиеся номера отделов, и записать их в массив arrDeptUnic
//                 * который имеет необходимое количество элементов.
//                 */
//                arrElCounter = 0;
//                System.out.println("Пустой массив arrDeptUnic: " + Arrays.toString(arrDeptUnic));
//                for (i = 0; i < employees.size() - 1; i++) {
//                    if (arrDept[i] != arrDept[i + 1]) {
//                        arrDeptUnic[arrElCounter]=arrDept[i];
//                        System.arraycopy(arrDept, i, arrDeptUnic, arrElCounter, 1);
//                        arrElCounter++;
//                    }
//                }
//                arrDeptUnic[arrElCounter] = arrDept[arrDept.length - 1];
//                System.out.println("Заполненный массив arrDeptUnic: " + Arrays.toString(arrDeptUnic));
//                /**
//                 * Массив с существующими отделами получен, и теперь можно найти
//                 * каждого сотрудника принадлежащего своему отделу и вывести его в консоль.
//                 * Для этого создаю цикл в цикле. Внешний цикл - это перебор отделов. Внутренний
//                 * цикл это перебор сотрудников и отбор тех чей номер отдела совпадает с
//                 * номерм отдела во внешнем цикле.
//                 */
//                StringBuilder sbRez = new StringBuilder("");
//                for (i = 0; i < arrDeptUnic.length; i++) {
//                    sbRez.append("\nОтдел №" + arrDeptUnic[i] + "\n");
//                    for(Employee employee: employees.values()){
//                        if(employee.getDept() == arrDeptUnic[i]){
//                            sbRez.append(employee.getFullName() + " \n");
//                        }
//                    }
//                }
//                return sbRez;
//            }
//
//            public void salaryIndexing(double percentOfIndexing) {
//                for (Employee employee: employees.values()) {
//                    double increasedSalary = employee.getSalary() * (1 + percentOfIndexing / 100);
//                    employee.setSalary((int) increasedSalary);
//                }
//            }
//            public StringBuilder salariesBILO() {
//                Map<String , Employee> emloyeeSalaryesBILO = employees;
//                StringBuilder rezString = new StringBuilder("");
//                if (emloyeeSalaryesBILO.isEmpty()) {
//                    return rezString.append("интерфейс Map не содержит ни одного сотрудника");
//                }
//                for (Employee employee : emloyeeSalaryesBILO.values()) {
//                    rezString.append("- " + employee.getFullName() +
//                            ", зарплата: " + employee.getSalary() +
//                            ", отдел: " + employee.getDept() + "\n");
//                }
//                return rezString;
//            }
//
//            public static void printEmployeeInfo(Employee employee) {
//                System.out.println("id: " + employee.getId() + ", полное имя: " +
//                        employee.getFullName() + ", зарплата: " +
//                        new DecimalFormat("###,###.##").format(employee.getSalary()) +
//                        " рублей, " + " отдел: " + employee.getDept());
//            }
//
//            public StringBuilder salaryLessThan(int lessThanThisNum) {
//                int lessSalariesCounter = 0;
//                StringBuilder rezString = new StringBuilder("");
//                for (Employee employee : employees.values()) {
//                    if (employee.getSalary() < lessThanThisNum) {
//                        rezString.append("- " + employee.getFullName() +
//                                ", зарплата: " + employee.getSalary() +
//                                ", отдел: " + employee.getDept() + "\n");
//                        lessSalariesCounter++;
//                    }
//
//                }
//                if (lessSalariesCounter == 0) {
//                    return rezString.append("Сотрудников с зарплатой ниже " + lessThanThisNum + " рублей " + " - нет");
//                }
//                return rezString;
//            }
//
//            public StringBuilder salaryMoreThan(int moreThanThisNum) {
//                int moreSalariesCounter = 0;
//                StringBuilder rezString = new StringBuilder("");
//                for (Employee employee : employees.values()) {
//                    if (employee.getSalary() > moreThanThisNum) {
//                        rezString.append("- " + employee.getFullName() +
//                                ", зарплата: " + employee.getSalary() +
//                                ", отдел: " + employee.getDept() + "\n");
//                        moreSalariesCounter++;
//                    }
//
//                }
//                if (moreSalariesCounter == 0) {
//                    return rezString.append("Сотрудников с зарплатой выше " + moreThanThisNum + " рублей " + " - нет");
//                }
//                return rezString;
//            }
//
//


//    public int findEmployeesIdMinimalSalary() throws Exception {
//        if (employees == null) {
//            throw new Exception ("В базе отсутствуют сотрудники");
//        }
//        int min = employees[0].getSalary();
//        int idEmployee = 0;
//        for (int i = 0; i < idCounter; i++) {
//            if (employees[i].getSalary() <= min) {
//                min = employees[i].getSalary();
//                idEmployee = employees[i].getId();
//            }
//        }
//        return idEmployee;
//    }
//
//    public int findEmployeesIdMaximalSalary() {
//        int max = employees[0].getSalary();
//        int idEmployee = 0;
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].getSalary() > max) {
//                max = employees[i].getSalary();
//                idEmployee = employees[i].getId();
//            }
//        }
//        return idEmployee;
//    }
//
//    public void findAndPrintEmployeeById(int id) {
//        for (int i = 0; i < employees.length; i++) {
//            if (id == employees[i].getId()) {
//                printEmployeeInfo(employees[i]);
//            }
//        }
//    }
//
//    public int monthSumSalary() {
//        int sum = 0;
//        for (int i = 0; i < employees.length; i++) {
//            sum = employees[i].getSalary() + sum;
//        }
//        return sum;
//    }
//
//    public double monthMiddleSalary(int sum) {
//        return (double) sum / employees.length;
//    }
//
//    public double middleSalaryById(int idOfEmployee) {
//        int sumSalaries = 0;
//        int deptsCounter = 0;
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].getDept() == idOfEmployee) {
//                sumSalaries = employees[i].getSalary() + sumSalaries;
//                deptsCounter++;
//            }
//            if (sumSalaries == 0) {
//                return -1;
//            }
//        }
//        return (double) sumSalaries / deptsCounter;
//    }
//
//    public static int getIdCounter() {
//        return idCounter;
//    }
//
//    public static void setIdCounter(int idCounter) {
//        EmployeeBook.idCounter = idCounter;
//    }
//

//        }
//        40 changes: 40 additions & 0 deletions40
//        src/main/java/com/skypro/homework2_8/Main.java
//        Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//        Comment on this file
//        @@ -0,0 +1,40 @@
//package com.skypro.homework2_8;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//        public class Main {
//
//            static Map<String, Employee> employees;

//            public static void main(String[] args) {
//                employees = new HashMap<>(Map.of());
//                "Попова Варвара Богдановна",
//                new Employee("Попова Варвара Богдановна", 85_000,5),
//                "Петрова Елена Павловна",
//                new Employee("Петрова Елена Павловна", 87_000, 2),
//                "Васильев Денис Андреевич",
//                new Employee("Васильев Денис Андреевич", 65_000, 1),
//                "Лянге Александр Григорьевич",
//                new Employee("Лянге Александр Григорьевич", 90_000, 3)));
//                System.out.println(getEmployees());
//                if (employees.isEmpty() ){
//                    System.out.println("ybxtuj");
//                };
//            }
//
//            public static StringBuilder getEmployees() {
//                StringBuilder rezString = new StringBuilder("");
//                for (Employee employee: employees.values()) {
//                    rezString.append(employee.getFullName() + " " + employee.getSalary() + " " + employee.getId() + "\n");
//                }
//                return rezString;
//            }

//    public static Map<String, Employee> getEmployees() {
//        return employees;
//    }

//        }
//        4 changes: 4 additions & 0 deletions4
//        src/main/java/com/skypro/homework2_8/execptions/FullMapException.java
//        Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//        Comment on this file
//        @@ -0,0 +1,4 @@
//package com.skypro.homework2_8.execptions;
//
//        public class FullMapException extends RuntimeException{
//        }
//        6 changes: 6 additions & 0 deletions6
//        src/main/resources/templatesOfRequests.txt
//        Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//        Comment on this file
//        @@ -0,0 +1,6 @@
//                http://localhost:8080/find?fullName=Попова%20Варвара%20Богдановна
//        http://localhost:8080/remove?fullName=Попова%20Варвара%20Богдановна
//        http://localhost:8080/change?fullNameDeletingEmployee=Попова%20Варвара%20Богдановна&fullNameNewEmployee=Андреев%20Максим%20Викторович&newSalary=63250&newDept=1
//        http://localhost:8080/salaryIndexing?percent=3.5
//        http://localhost:8080/salaryLess?lessThan=80000
//        http://localhost:8080/salaryMore?moreThan=80000











}
