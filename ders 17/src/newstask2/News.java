package newstask2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class News <T, U, V>{
    private T name;
    private Category<U> category;
    private Author<U> author;
    private LocalDate date;

    public News(T name, Category<U> category, Author<U> author, LocalDate date) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.date = date;
    }

    public T getName() {
        return name;
    }

    public Category<U> getCategory() {
        return category;
    }

    public Author<U> getAuthor() {
        return author;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getFormatterDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }
    public void displayInfo(){
        System.out.println("Xeber adi: " + getName());
        System.out.println("Kategorisi: " + category.getName());
        System.out.println("Yazari: " + author.getFullName());
        System.out.println("Yazari: " + getFormatterDate());
    }

    @Override
    public String toString() {
        return "News{" +
                "name=" + name +
                ", category=" + category +
                ", author=" + author +
                ", date=" + date +
                '}';
    }
}
