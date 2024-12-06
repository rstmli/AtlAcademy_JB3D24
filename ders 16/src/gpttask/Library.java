package gpttask;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book + " elave edildi.");
    }

    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed: " + book.getTitle());
                System.out.println(isbn + " nomreli kitap silindi");
                return;
            }
        }
    }

    public void bookList() {
        if(books.isEmpty()){
            throw new BookNotFoundException("Kitapxanada kitap yoxddur");
        }else{
            for (Book book : books) {
                System.out.println(book);
                return;
            }
        }

    }
}
