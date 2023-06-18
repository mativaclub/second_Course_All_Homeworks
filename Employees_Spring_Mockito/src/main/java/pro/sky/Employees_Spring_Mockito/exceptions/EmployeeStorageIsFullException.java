package pro.sky.Employees_Spring_Mockito.exceptions;

public class EmployeeStorageIsFullException extends RuntimeException{

    public EmployeeStorageIsFullException() {
    }

    public EmployeeStorageIsFullException(String message) {
        super(message);
    }
}