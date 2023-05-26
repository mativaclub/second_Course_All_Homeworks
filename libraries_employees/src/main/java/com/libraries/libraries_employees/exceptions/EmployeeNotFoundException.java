package com.libraries.libraries_employees.exceptions;

public class EmployeeNotFoundException extends RuntimeException {


    public EmployeeNotFoundException() {
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
