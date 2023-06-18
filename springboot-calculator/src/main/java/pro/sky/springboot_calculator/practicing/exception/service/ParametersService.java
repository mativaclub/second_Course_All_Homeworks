package pro.sky.springboot_calculator.practicing.exception.service;
import pro.sky.springboot_calculator.practicing.exception.WrongLoginException;
import pro.sky.springboot_calculator.practicing.exception.WrongPasswordException;

public interface ParametersService {

    void validateParameters(String login, String password, String confirmPassword)
            throws WrongPasswordException, WrongLoginException;

}
