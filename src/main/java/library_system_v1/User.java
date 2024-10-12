package library_system_v1;

public class User {
    String name;
    Book[] books = new Book[5];

    public User(String name) {
        this.name = name;
    }
}