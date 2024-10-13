package NewLibrary;

import java.util.ArrayList;

public class User {
    private String name ;
    private Book[] books;

    public User(String name) {
        this.name = name;
        books = new Book[5];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book barrowBook (Book book) {
        return book;
    }
    public Book returnBook (Book book) {
        book = null;
        return book;
    }




}
