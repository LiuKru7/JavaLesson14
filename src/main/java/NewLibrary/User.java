package NewLibrary;

import java.util.ArrayList;

public class User {
    private String name ;
    Book[] books;

    public User(String name) {
        this.name = name;
        books = new Book[5];
    }

    public String getName() {
        return name;
    }
}
