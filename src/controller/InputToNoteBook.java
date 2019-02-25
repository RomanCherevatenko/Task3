package controller;

public class InputToNoteBook {

    private String name;
    private String surname;
    private String patronymic;
    private String TelNumber;
    private String Login;


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setTelNumber(String TelNumber) {
        this.TelNumber = TelNumber;
    }

    public void setLogin(String login) {
        Login = login;
    }

    String getName() {
        return name;
    }

    String getLogin() {
        return Login;
    }
}

