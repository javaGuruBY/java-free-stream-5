package by.jrr.rakhnianski;

public class CreateDocument {
    public static void main(String[] args) {
        turnOnComputer();
        openWord();
        createDocument();
        fillItWithText();
        saveIt();

    }
    public static void turnOnComputer() {
        System.out.println("Turning on the computer");
    }
    public static void openWord() {
        System.out.println("Opening Word");
    }
    public static void createDocument() {
        System.out.println("Creating a document");
    }
    public static void fillItWithText() {
        System.out.println("Filling the document with the text");
    }
    public static void saveIt() {
        System.out.println("Saving the document");
    }

}
