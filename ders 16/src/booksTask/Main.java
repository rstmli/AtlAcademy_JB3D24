package booksTask;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book java = new Book("Hesderxan","Mushfiq");
        library.addBook(java);
        library.showAvailableBooks();
    }

}
