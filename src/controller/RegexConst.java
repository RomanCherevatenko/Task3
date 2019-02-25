package controller;

public interface RegexConst {
    String Login = "\\w{5,15}";
    String nameReg = "[А-ЯІЇ]{1}[а-яїі]+";
    String SurnameReg = "([а-яА-ЯїЇіІ]')?[А-ЯІЇ][а-яїі]+";
    String patronymic = "[А-ЯІЇ]{1}[а-яії]+";
    String TelNumber = "(\\+?[0-9]{3})?[-\\s]?[0-9]{2}[-\\s]?[0-9]{2}[-\\s]?[0-9]{3}[-\\s]?";
}
