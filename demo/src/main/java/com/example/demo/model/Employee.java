package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Employee {
//    @JsonProperty("Name")
    private final String name;
//    @JsonProperty("Surname")
    private final String surname;
    private int department;
    private int salary;
    public Employee(String firstName, String surname, int department, int salary) {
        this.name = firstName;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public int getSalary() {return salary;
    }
    public void setSalary(int salary) {this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary &&
                Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
//        return name.equals(employee.name) && surname.equals(employee.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, department, salary);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname);
//    }



    @Override
    public String toString() {
        return String.format("ФИ: %s %s, отдел: %d, ЗП: %d", surname, name, department, salary);
    }
}
