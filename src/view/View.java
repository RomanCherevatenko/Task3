package view;

public class View {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void concatMessage(String... messages) {
        String str = "";
        for (String s : messages) {
            str+=s+" ";

        }
        printMessage(str);


    }
}