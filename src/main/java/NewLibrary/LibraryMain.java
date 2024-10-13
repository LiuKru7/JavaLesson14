package NewLibrary;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBooks();
        library.displayAvailableBooks();
        library.createUser();
        library.barrowBook();
    }
}
