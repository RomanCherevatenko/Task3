package controller;

import model.AlreadyExistsException;
import model.Model;
import model.NoteBook;
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
        UtilityController utilControl = new UtilityController(scan, view);
        InputToNoteBook inpNote = new InputToNoteBook();
        NoteBook noteBook;

        inpNote.setLogin((utilControl.inputStringValueRegex(TextConst.INPUTE_LOGIN, RegexConst.Login)));
        inpNote.setSurname(utilControl.inputStringValueRegex(TextConst.INPUT_SURNAME, RegexConst.SurnameReg));
        inpNote.setName(utilControl.inputStringValueRegex(TextConst.INPUT_NAME, RegexConst.nameReg));
        inpNote.setPatronymic(utilControl.inputStringValueRegex(TextConst.INPUTE_PATRONYMIC, RegexConst.patronymic));
        inpNote.setTelNumber((utilControl.inputStringValueRegex(TextConst.INPUTE_TEL_NUMBER, RegexConst.TelNumber)));

        try {
            noteBook = new NoteBook(inpNote.getName(), inpNote.getLogin());
        } catch (AlreadyExistsException e) {
            view.printErrorMessage(e.getMessage());
            this.process();
        }
    }
}

