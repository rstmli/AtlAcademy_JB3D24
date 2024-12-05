package booklibrary;

public class Main {
    public static void main(String[] args) {
        try{
            Library library = new Library();
            Book java = new Book("Java Programing","James Gosling");
            Book cleanCode = new Book("Clean Code","Robert C. Martin");
            library.addBook(java);
            library.rent("Java Programing",1);
            library.rent("Java Programing",1);
            library.returnBook("Clean Code");

            library.showavailableBooks();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}
