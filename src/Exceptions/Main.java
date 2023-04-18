package Exceptions;

import java.util.regex.Matcher;

public class Main {

    public static boolean check(String login, String password, String confirmPassword) {
        //2. Параметр Login содержит в себе только латинские буквы, цифры и знак подчеркивания.
        if (!login.matches("[a-zA-Z0-9_]")) {
            throw new WrongLoginException("Login must contain letters, numbers and underline");
        }

        //   Если login длиннее 20 символов, то  необходимо выбросить исключение – `WrongLoginException`.
        if (!(login.length() <= 20)) {
            throw new WrongLoginException("Login must be less then 20 symbols");
        }


        //3. Параметр Password содержит в себе только латинские буквы, цифры и знак подчеркивания.
        if (!password.matches("[:word:]")) {
            throw new RuntimeException("Password must contain letters, numbers and underline");
        }

        //4. У параметра password есть ограничение по длине – он должен быть строго меньше 20 символов.
        if (!(password.length() < 20)) {
            throw new WrongPasswordException("Password must be less then 20 symbols");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords must be equal");
        }
        return true;
    }


    public static void main(String[] args) {

        try {
            check("Login_123", "password", "password");
        } catch (WrongLoginException e) {
            System.out.println("Length must be less then 20 symbols");
        } catch (WrongPasswordException e) {
            System.out.println("Passwords must be equal");
        } finally {
            System.out.println("Good luck");
        }


    }
}