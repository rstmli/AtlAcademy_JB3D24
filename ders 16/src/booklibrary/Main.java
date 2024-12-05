package booklibrary;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book java = new Book("Java Programing","James Gosling");
        Book cleanCode = new Book("Clean Code","Robert C. Martin");
        library.addBook(java);
        library.addBook(cleanCode);
        library.rent("Java Programing");
        library.returnBook("Java Programing");
        library.returnBook("Java Programing");
        library.showavailableBooks();
    }

}
