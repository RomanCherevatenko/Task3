package controller;

import view.TextConst;
import view.View;

import java.util.Scanner;

public class UtilityController {

    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String inputStringValueRegex(String message, String regex) {
        String res;
        view.printMessage(message);

        while (!(scanner.hasNext() &&
                (res = scanner.nextLine()).matches(regex))) {
            view.concatMessage(TextConst.ERROR_INPUT, message);
        }

        return res;
    }

}
