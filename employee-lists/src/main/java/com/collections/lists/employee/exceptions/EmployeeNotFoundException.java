package com.collections.lists.employee.exceptions;

public class EmployeeNotFoundException extends RuntimeException{

    public static final String DEFAULT_MESSAGE = "Employee not found";

    public EmployeeNotFoundException() {
        this(DEFAULT_MESSAGE);
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
