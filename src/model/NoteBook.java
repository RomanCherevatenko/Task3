package model;

public class NoteBook {

    private String name;
    private String login;

    public NoteBook(String name, String login) throws AlreadyExistsException {
        this.name = name;

        if (DBNoteBook.CheckLog(login))
            throw new AlreadyExistsException("already exists ", login);

        this.login = login;
    }
}