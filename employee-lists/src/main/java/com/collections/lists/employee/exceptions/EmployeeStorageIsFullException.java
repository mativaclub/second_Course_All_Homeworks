package com.collections.lists.employee.exceptions;

public class EmployeeStorageIsFullException extends RuntimeException{

    public static final String DEFAULT_MESSAGE = "Employee Storage Is Full";

    public EmployeeStorageIsFullException() {
        this(DEFAULT_MESSAGE);
    }

    public EmployeeStorageIsFullException(String message) {
        super(message);
    }
}
