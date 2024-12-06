package booklibrary;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book java = new Book("Java Programing","James Gosling","Code");
        Book java1 = new Book("Java Programing","James Gosling","gaming");
        Book cleanCode = new Book("Clean Code","Robert C. Martin","Code");
        try{
            library.addBook(java);
            library.addBook(java1);
            library.returnBook("Java Programing");
            library.rent("Java Programing",2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}