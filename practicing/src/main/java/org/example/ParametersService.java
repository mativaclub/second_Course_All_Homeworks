package org.example;

public interface ParametersService {

    public   void validateParameters(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException;

}