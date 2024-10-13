package NewLibrary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Library {
    private final ArrayList<Book> books;
    private final ArrayList<User> users;
    private Scanner scanner = new Scanner(System.in);

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


    }

    public void returnBook() {
        System.out.println("Hello. If you want to return book, first say your name. ");
        printAllUsers();
        String userName = askUserName();

    }

    public String askUserName() {
        String userName = "";
        while (true) {
            System.out.println("Enter the user name:");
            userName = scanner.nextLine();
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getName().equalsIgnoreCase(userName)) {
                    return userName;
                }
            }
        }
    }

    public void printAllUsers () {
        for (User user: users) {
            System.out.println("Username: "+ user.getName());
        }
    }
}



