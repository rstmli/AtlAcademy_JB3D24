package booklibrary;

public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title,String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void rent(){
        if(available){
            available = false;
            System.out.println("'" + title + "' kitabi icraye goturuldu.");
        }else{
            System.out.println("'" + title + "' artıq icarəyə götürülüb.");
        }
    }
    public void returnBook(){
        available = true;
        System.out.println("'" + title + "' geri qaytarıldı.");
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        String status = available ? "Movcuddur" : "Movcud deyil";
        return "Book{title='" + title + "', author='" + author + "', available=" + status + "}";
    }
}
