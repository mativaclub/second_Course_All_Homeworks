package com.employeebookcollection.employee.collection.Exceptions;

public class EmployeeNotFoundException extends RuntimeException {

    public static final String DEFAULT_MESSAGE = "Employee not found exception";
    public EmployeeNotFoundException() {
        this(DEFAULT_MESSAGE);
    }
    public EmployeeNotFoundException(String message) {
        super(message);
    }

}
