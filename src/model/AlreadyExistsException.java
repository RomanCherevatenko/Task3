package model;

public class AlreadyExistsException extends Exception {

    private String Login;

    AlreadyExistsException(String message, String Login) {
        super(Login + message);
        this.Login = Login;
    }
}