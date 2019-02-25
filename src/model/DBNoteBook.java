package model;

public enum DBNoteBook {
    P1("Иван", "pupkin123"),
    P2("Вася ", "vasichkin99"),
    P3("Ксения", "sobchak23");

    private String Name;
    private String Login;

    DBNoteBook(String Name, String Login) {
        this.Name = Name;
        this.Login = Login;
    }

    public static boolean CheckLog(String checked) {
        for (DBNoteBook c : DBNoteBook.values()) {
            if (checked.equals(c.Login)) {
                return true;
            }
        }
        return false;
    }
}




