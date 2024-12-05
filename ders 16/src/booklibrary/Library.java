package booklibrary;

import java.time.chrono.ChronoLocalDate;
import java.util.*;
import java.time.LocalDate;

public class Library {
        private Map<String, Set<Book>> booksByGenre;
        public Library() {
            booksByGenre = new HashMap<>();
        }
    public void addBook(Book book){
        booksByGenre.putIfAbsent(book.getGenre(), new HashSet<>());
        booksByGenre.get(book.getGenre()).add(book);
        System.out.println("'" + book.getTitle() + "' kitabı '" + book.getGenre() + "' janrına əlavə edildi.");
    }
    public void rent(String title,long day ){
        for(Set<Book> books : booksByGenre.values()){
            for(Book book: books){
                if(book.isAvailable() && book.getTitle().equals(title)){
                    book.rent(day);
                }
            }
        }
    }

    public void returnBook(String title){
        for (Set<Book> books : booksByGenre.values()) {
            for (Book book : books) {
                if (book.getTitle().equals(title) && book.isAvailable()) {
                    book.returnBook();
                    return;
                }
            }
        }
        throw new ReturnErrorException( title + " kitabi icareye goturulmeyib.");
    }
    public void showavailableBooks(String genre){
        Set<Book> books = booksByGenre.get(genre);
        if (books != null) {
            for (Book book : books) {
                if (book.isAvailable()) {
                    System.out.print(book);
                }
            }
        } else {
            throw new BookNotFoundException("Bu janrda heç bir kitab mövcud deyil.");
        }



    }


}


