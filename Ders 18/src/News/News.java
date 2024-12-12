package News;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class News <T,U extends Category,V extends Author>{
    private T title;
    private U category;
    private V author;
    private LocalDate date;

    public News(T title, U category, V author, LocalDate date) {
        this.title = title;
        this.category = category;
        this.author = author;
        this.date = date;
    }

    public T getTitle() {
        return title;
    }

    public U getCategory() {
        return category;
    }

    public V getAuthor() {
        return author;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getFormatterInfo(){
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public void displayInfo(){
        System.out.println("Xeber basligi: " + title);
        System.out.println("Xeber Kategorisi: " + category.getCategoryName());
        System.out.println("Xeber Muellifi: " + author.getFullName());
        System.out.println("Xeber Zamani: " + getFormatterInfo());
    }
}
