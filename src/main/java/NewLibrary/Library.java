package NewLibrary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Library {
    private final ArrayList<Book> books;
    private final ArrayList<User> users;
    private final Scanner scanner = new Scanner(System.in);

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBooks() {
        BookList FromList = new BookList();
        Collections.addAll(this.books, FromList.books);
    }

    public void displayAvailableBooks() {
        System.out.println("Display all available books. ");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.printf("%d. Tittle: %s . Author: %s. %n", book.getBookId(), book.getTitle(), book.getAuthor());
            }
        }
    }

    public void createUser() {
        String username = "";
        System.out.println("Create user !");
        while (true) {
            System.out.print("Enter user name: ");
            String checkUserName = scanner.nextLine();
            if (checkUserName.length() < 3) {
                System.out.println("Username is too short.");
            } else {
                username = checkUserName;
                users.add(new User(username));
                System.out.println("Username is correct.");
                break;
            }
        }
    }

    public void barrowBook() {
        System.out.println("Hello. If you want to barrow book, first say your name. ");
        printAllUsers();
        String userName = askUserName();
        System.out.println("Choose the book from list.");
        displayAvailableBooks();
        System.out.print("Enter book id: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        Book bookCopy = null;

        for (Book book : books) {
            if (book.getBookId() == bookId) {
                book.setAvailable(false);
                bookCopy = book;
                break;
            }
        }
        if (bookCopy == null) {
            System.out.println("Book Copy null");
            return;
        }

        for (User user : users) {
            if (user.getName().equalsIgnoreCase(userName)) {
                for (int j = 0; j < user.books.length; j++) {
                    if (user.books[j] == null) {
                        user.books[0] = bookCopy;
                        break;
                    }
                }
            }
        }
    }

    public void returnBook() {
        System.out.println("Hello. If you want to return book, first say your username. ");
        printAllUsers();
        String userName = askUserName();

        System.out.println("Choose book ID from list.");
        printUserBooks(userName);
        int userBookID = scanner.nextInt();

        for (User user : users) {
            if (user.getName().equalsIgnoreCase(userName)) {
                for (int j = 0; j < user.books.length; j++) {
                    if (user.books[j].getBookId() == userBookID) {
                        user.books[j] = null;
                    }
                }
            }

        }
        for (Book book : books) {
            if (book.getBookId() == userBookID) {
                book.setAvailable(false);
            }
        }
    }

    public void menu() {

        boolean isOn = true;
        while (isOn) {
            System.out.println("MENU");
            System.out.println("1. Display available books.");
            System.out.println("2. Create new user");
            System.out.println("3. Barrow book");
            System.out.println("4. Return book");

            System.out.println("Choose number ");
            int menuNumber = scanner.nextInt();

            switch (menuNumber) {
                case 1 -> displayAvailableBooks();
                case 2 -> createUser();
                case 3 -> barrowBook();
                case 4 -> returnBook();
                case 0 -> isOn = false;
                default -> System.out.println("Invalid value");
            }
        }


    }

    public String askUserName() {
        String userName = "";
        while (true) {
            System.out.print("Enter your username: ");
            userName = scanner.nextLine();
            for (User user : users) {
                if (user.getName().equalsIgnoreCase(userName)) {
                    return userName;
                }
            }
        }
    }

    public void printAllUsers() {
        System.out.println("All usernames: ");
        for (User user : users) {
            System.out.println("Username: " + user.getName());
        }
    }

    public void printUserBooks(String username) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(username)) {
                for (int j = 0; j < user.books.length; j++) {
                    System.out.printf("ID: %d. Tittle: %s : Author: %s . %n", user.books[j].getBookId(), user.books[j].getAuthor(), user.books[j].getTitle());
                }
            }
        }

    }
}



