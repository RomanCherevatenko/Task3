package controller;

import model.Model;
import view.View;
import view.TextConst;

import java.util.Scanner;


public class Controller {

    private Model model;
    private View view;

    public Controller(View view, Model model) {

        this.model = model;
        this.view = view;
    }

    public void process() {
        Scanner scan = new Scanner(System.in);
        UtilityController utilControl = new UtilityController(scan,view);
        InputToNoteBook inpNote = new InputToNoteBook();

        inpNote.setSurname(utilControl.inputStringValueRegex(TextConst.INPUT_SURNAME, RegexConst.SurnameReg));
        inpNote.setName(utilControl.inputStringValueRegex(TextConst.INPUT_NAME, RegexConst.nameReg));

    }
}

