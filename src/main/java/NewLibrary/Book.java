package NewLibrary;

public class Book {
    private final String title;
    private final String author;
    private boolean isAvailable;
    private final int bookId ;

    public Book(String title, String author, boolean isAvailable, int bookId) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
