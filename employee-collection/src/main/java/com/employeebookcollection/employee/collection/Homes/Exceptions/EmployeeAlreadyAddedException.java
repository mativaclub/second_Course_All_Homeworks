package com.employeebookcollection.employee.collection.Homes.Exceptions;

public class EmployeeAlreadyAddedException extends RuntimeException {

//    public static final String DEFAULT_MESSAGE = "Employee already added";
//    public EmployeeAlreadyAddedException() {
//        this(DEFAULT_MESSAGE);
//    }
    public EmployeeAlreadyAddedException(String message) {
        super(message);
    }
}
