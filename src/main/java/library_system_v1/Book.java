package library_system_v1;

public class Book {
    String title ;
    String author ;
    boolean isAvailable;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.isAvailable = true;
    }
}
