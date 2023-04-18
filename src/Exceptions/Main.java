package Exceptions;

public class Main {

    public static boolean registration(String login, String password, String confirmPassword) {
        //2. Параметр Login содержит в себе только латинские буквы, цифры и знак подчеркивания.
        if (login.contains("[a-zA-Z0-9_]")) {
            throw new RuntimeException("Login must contain letters, numbers and underline");
        }

        //    Если login длиннее 20 символов, то  необходимо выбросить исключение – `WrongLoginException`.
        if (!(login.length() <= 20)) {
            throw new WrongLoginException("Login must be less then 20 symbols");
        }

        //3. Параметр Password содержит в себе только латинские буквы, цифры и знак подчеркивания.
        if (!password.contains("[:word:]")) {
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
            registration("Login_123", "password", "password");
        } catch (WrongLoginException e) {
            throw new WrongLoginException("Length must be less then 20 symbols");
        } catch (WrongPasswordException e) {
            throw new WrongPasswordException("Passwords must be equal");
        } finally {
            System.out.println("Registration completed");
        }


    }
}