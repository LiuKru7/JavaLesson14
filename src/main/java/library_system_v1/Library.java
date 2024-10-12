package library_system_v1;

import java.util.Scanner;

public class Library {
    public String name;
    public Book[] books = new Book[20];
    public User[] users = new User[5];
    public Scanner scanner = new Scanner(System.in);

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = book;
                return;
            }
        }
    }

    public void displayAvailableBooks() {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && books[i].isAvailable) {
                System.out.printf("%d.Title: %s Author: %s. %n", i + 1, books[i].title, books[i].author);
            }
        }
    }

    public void createUser() {
        boolean isAvailableUserName = false;
        String userName = null;
        System.out.println("Create new user");

        while (!isAvailableUserName) {
            System.out.print("Write your name: ");
            userName = scanner.nextLine();
            if (userName.length() < 3) {
                System.out.println("Your username is too short. Try Again.");
                continue;
            }
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    continue;
                }
                if (users[i].name.equalsIgnoreCase(userName)) {
                    System.out.println("We have this username. Try again");
                    continue;
                }
            }
            isAvailableUserName = true;
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = new User(userName);
                System.out.println("Your username is: " + userName);
                System.out.println(users[0].name);
                return;
            }
        }
        System.out.println("No enought space for new users");

    }


    public void barrowBook() {
        System.out.println("If you want to take book from library write 'Y' : ");
        int bookIndex;
        int userIndex = -1;
        String wantToTakeBook = scanner.nextLine();

        if (!wantToTakeBook.equalsIgnoreCase("y")) {
            System.out.println("Good bye!");
            return;
        }

        System.out.println("Say your username: ");
        String userName = scanner.nextLine();
        boolean isConnected = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.equalsIgnoreCase(userName)) {
                System.out.println("You are connected");
                userIndex = i;
                isConnected = true;
                break;
            }
        }
        if (!isConnected) {
            System.out.println("bad username");
            return;
        }

        System.out.println("Choose book from list, write the number");
        displayAvailableBooks();
        int chooseBookNumber = scanner.nextInt();
        bookIndex = chooseBookNumber - 1;
        System.out.println("userindex " + userIndex);

        if (chooseBookNumber > 0 && chooseBookNumber < books.length) {
            books[bookIndex].isAvailable = false;
        }

        for (int i = 0; i < users[userIndex].books.length; i++) {
            if (users[userIndex].books[i] == null) {
                users[userIndex].books[i] = books[bookIndex];
                System.out.println("You take the book!");
                break;
            }
        }
        System.out.println("FINISH");

    }

    public void returnBook() {
        scanner.nextLine();
        System.out.println("If you want return book to library write 'Y' : ");
        int bookIndex;
        int userIndex = -1;
        String wantToTakeBook = scanner.nextLine();

        if (!wantToTakeBook.equalsIgnoreCase("y")) {
            System.out.println("Good bye!");
            return;
        }
        System.out.println("Say your username: ");
        String userName = scanner.nextLine();
        boolean isConnected = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.equalsIgnoreCase(userName)) {
                System.out.println("You are connected");
                userIndex = i;
                isConnected = true;
                break;
            }
        }
        if (!isConnected) {
            System.out.println("bad username");
            return;
        }

        for (int j = 0; j < users[userIndex].books.length; j++) {
            if (users[userIndex].books[j] != null) {
                System.out.printf("%d. Tittle: %s, Author: %s ", j + 1, users[userIndex].books[j].title, users[userIndex].books[j].author);
            }
        }

        System.out.println("Choose the book you want to return. write the number.");
        int bookNumber = scanner.nextInt();
        bookIndex = bookNumber - 1 ;
        if (bookIndex<0 || bookIndex>users[userIndex].books.length) {
            System.out.println("Bad number");
            return;
        }

        String bookTitle = users[userIndex].books[bookIndex].title;
        users[userIndex].books[bookIndex] = null;

        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equalsIgnoreCase(bookTitle)) {
                books[i].isAvailable = true;
            }
        }
    }
}

