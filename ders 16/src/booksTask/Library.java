package booksTask;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("'" + book.getTitle() + "' kitabxanaya əlavə edildi.");
    }

    public void rentBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.rent();
                return;
            }
        }
        System.out.println(title + " kitabi icarededir");
    }

    public void returnBook(String title){

        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println(" icarede kitap yoxdu");
    }
    public void showAvailableBooks() {
        boolean found = false;
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Hazırda əlçatan kitab yoxdur.");
        }
    }
}
