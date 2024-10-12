package library_system_v1;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library("Miskiniu");
        library.addBook(new Book("Kristijonas Donelaitis", "Metai"));
        library.addBook(new Book("Maironis", "Pavasario balsai"));
        library.addBook(new Book("Balys Sruoga", "Dievų miškas"));
        library.addBook(new Book("Juozas Tumas-Vaižgantas", "Dėdės ir dėdienės"));
        library.addBook(new Book("Vincas Mykolaitis-Putinas", "Altorių šešėly"));
        library.addBook(new Book("Jonas Biliūnas", "Liūdna pasaka"));
        library.addBook(new Book("Antanas Škėma", "Balta drobulė"));
        library.addBook(new Book("Ričardas Gavelis", "Vilniaus pokeris"));
        library.addBook(new Book("Šatrijos Ragana", "Sename dvare"));
        library.addBook(new Book("Ieva Simonaitytė", "Aukštujų Šimonių likimas"));
        library.addBook(new Book("Vytautas Mačernis", "Vizijos"));
        library.addBook(new Book("Kazys Boruta", "Baltaragio malūnas"));
        library.addBook(new Book("Juozas Grušas", "Meilė, džiazas ir velnias"));
        library.addBook(new Book("Justinas Marcinkevičius", "Mindaugas"));
        library.addBook(new Book("Vydūnas", "Septyni šimtmečiai lietuvių ir vokiečių santykių"));

        library.displayAvailableBooks();
        library.createUser();
        library.barrowBook();
        library.displayAvailableBooks();
        library.returnBook();
        library.displayAvailableBooks();


    }
}
