package booklibrary;

import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Locale;


public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("'" + book.getTitle() + "' kitabxanaya əlavə edildi.");
    }
    public void rent(String title,long b ){
        for(Book book: books){
            if(book.getTitle().equals(title)){
                book.rent(b);
                return;
            }
        }
        throw new RentErrorException("'" + title + "' tapılmadı.");
    }
    public void returnBook(String title){
        for(Book book: books){
            if(book.getTitle().equals(title)){
                book.returnBook();
                return;
            }
        }
        throw new RentErrorException( title + " kitabi icareye goturulmeyib.");
    }
    public void showavailableBooks(){
        for(Book book:books){
            if(book.isAvailable()){
                System.out.println(book);
            }
        }
    }


}


