package newstask;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class News <T, U, V>{
    // ev tapsiriqi - hedefimiz xeber classidir, cetegori,name,muellif, ve hansi zamanda paylasilib, istenilir
    // - birinci date her hansisa bir xeberi ekrana verilende xeberin tarixi ekrana formattir edilib gosgterilsin, author adinda bir class muellifin adi surname,
    // sert - xeber classinda yazar ozu generic olmalidir, category ozude generic olsun,name olsun categoryde
    private Category<U> category;
    private T title;
    private Author<V> author;
    private LocalDate date;


    public String getFormatterNewsDate(){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    public Category<U> getCategory() {
        return category;
    }

    public void setCategory(Category<U> category) {
        this.category = category;
    }

    public T getTitle() {
        return title;
    }

    public void setTitle(T title) {
        this.title = title;
    }

    public News(Category<U> category, T title, Author<V> author, LocalDate date) {
        this.category = category;
        this.title = title;
        this.author = author;
        this.date = date;
    }

    public Author<V> getAuthor() {
        return author;
    }

    public void setAuthor(Author<V> author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void displayInfo(){
        System.out.println("Xeber adi: " + title);
        System.out.println("Kategori: " + category.getCategoryName());
        System.out.println("Müəllif: " + author.fullName());
        System.out.println("Tarih: " + getFormatterNewsDate());
    }


    @Override
    public String toString() {
        return "News{" +
                "category=" + category +
                ", title=" + title +
                ", author=" + author +
                ", date=" + date +
                '}';
    }
}
