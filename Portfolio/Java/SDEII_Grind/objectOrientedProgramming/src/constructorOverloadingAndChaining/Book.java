package constructorOverloadingAndChaining;

public class Book {

    private String title;
    private String author;
    private double price;


    public Book() {
        this("title", "author", 0.0);
    }

    public Book(String title, String author) {}

}
