package booksTask;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book java = new Book("Java programming","İsmayıl Şıxlı");
        Book birHekaye = new Book("Bir Hekayə","İsmayıl Şıxlı");
        library.addBook(java);
        library.addBook(birHekaye);
        library.rentBook("Bir Hekayə");
        library.returnBook("Bir Hekayə");
        library.showAvailableBooks();
    }

}
