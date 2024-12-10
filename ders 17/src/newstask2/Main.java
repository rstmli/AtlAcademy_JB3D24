package newstask2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        News<String,String,String> news = new News<>("Iqtisadi yonumluluk",
                new Category<>("Iqtisadiyyat"),
                new Author<>("Eli","Mireliyev"),
                LocalDate.of(2024,12,15));
        news.displayInfo();
    }
}
