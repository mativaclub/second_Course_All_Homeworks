package pro.sky.springboot_calculator.practicing.exception.service;
import org.springframework.stereotype.Service;
import pro.sky.springboot_calculator.practicing.exception.WrongLoginException;
import pro.sky.springboot_calculator.practicing.exception.WrongPasswordException;

@Service
public class ParametersServiceClass implements ParametersService {
    public void validateParameters(String login, String password, String confirmPassword) {
        if (!login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Login must contain letters, numbers and underline");
        }

        if (login.length() > 20) {
            throw new WrongLoginException();
        }

        if (!password.matches("\\w+")) {
            throw new RuntimeException("Password must contain letters, numbers and underline");
        }

        if (!(password.length() < 20)) {
            throw new WrongPasswordException("Password must be less then 20 symbols");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }

}


