package Challenges;

public class Book {

    String title;
    int year;

    public Book(String title, int year) {

        this.title = title;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("TItle: " + title + " Year: " + year);
    }

    public static void generalInfo() {
        System.out.println("Books are sources of knowledge");
    }

    public static void main(String[] args) {

        Book book = new Book("The all knowing Java God", 2025);

        book.displayInfo();
        Book.generalInfo();

    }

    }

