package booksTask;

public class Book {
    private String title;
    private String author;
    private boolean available;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void rent(){
        if(available){
            available = false;
            System.out.println(title + "kitab icareye goturuldu: ");
        }else{
            System.out.println(" kitap icareye goturulub");
        }
    }
    public void returnBook(){
        if(!available){
            available = true;
            System.out.println(title + " Kitab geri qaytarildi");
        }else{
            System.out.println(title + " kitap icareye goturulmeyib");
        }
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        String status = available ? "Mövcuddur" : "Mövcud deyil";
        return "Book{title='" + title + "', author='" + author + "', available=" + status + "}";
    }
}
