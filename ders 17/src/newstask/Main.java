package newstask;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        News<String,String, String> news = new News<>(new Category<>("Iqtisadiyyat"),"İqtisadi artım", new Author<>("Əli", "Əliyev"),LocalDate.of(2024, 12, 15));
        news.displayInfo();
    }
}
