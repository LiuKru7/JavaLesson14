package NewLibrary;

public class Book {
    private String title;
    private String author;
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

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public boolean barrow() {
        return isAvailable=false;
    }
    public boolean returnBook() {
        return isAvailable=true;
    }


}
