package gpttask;

public class Main {
    public static void main(String[] args) {
        try{
            Library library = new Library();
            Book java = new Book("Vetendas A","Huseyn Rustemli","123214");
            Book python = new Book("Python A","Huseyn Rustemli","123211234");
            library.addBook(java);
            library.addBook(python);
            library.bookList();
            library.removeBook("123214");
            library.bookList();
        }catch (BookNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

}
