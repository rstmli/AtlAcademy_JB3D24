package booklibrary;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Locale;

public class Book {
    private String title;
    private String author;
    private boolean available;
    private String genre;
    LocalDate date = LocalDate.now();

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

//    public void reverseBookTime(long a) {
//
//    }
    public void rent(long b) {
        if(available){
            available = false;
            System.out.println("'" + title + "' kitabi icaraye goturuldu." + date + " categori: " + genre);
            System.out.println(getTitle() + " Kitabi geri qaytaracaq: " + date.plusDays(b));


        }else{

        }
    }
    public void returnBook(){
        available = true;
        System.out.println("'" + title + "' geri qaytarıldı." + date + " qaytarildigi janr: " + genre);
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        String status = available ? "Movcuddur" : "Movcud deyil";
        return "Book{title='" + title + "', author='" + author + "', available=" + status + " Janri: " + genre+ " }";
    }

    public String getGenre() {
        return genre;
    }
}
