package booklibrary;

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
    public void rent(String title){
        for(Book book: books){
            if(book.getTitle().equals(title)){
                book.rent();
                return;
            }
        }
        System.out.println("'" + title + "' tapılmadı.");
    }
    public void returnBook(String title){
        for(Book book: books){
            if(book.getTitle().equals(title)){
                book.returnBook();
                return;
            }
        }
        System.out.println(title + " kitabi icareye goturulmeyib.");
    }
    public void showavailableBooks(){
        for(Book book:books){
            if(book.isAvailable()){
                System.out.println(book);
            }else{
                System.out.println("kitap tapilmadi");
            }
        }
    }


}


