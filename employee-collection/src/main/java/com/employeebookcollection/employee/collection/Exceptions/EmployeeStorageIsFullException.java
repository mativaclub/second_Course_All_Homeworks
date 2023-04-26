package com.employeebookcollection.employee.collection.Exceptions;

public class EmployeeStorageIsFullException extends RuntimeException {

    public static final String DEFAULT_MESSAGE = "Employees storage is full";

    public EmployeeStorageIsFullException() {
        this(DEFAULT_MESSAGE);
    }
    public EmployeeStorageIsFullException(String message) {
        super(message);
    }

}
