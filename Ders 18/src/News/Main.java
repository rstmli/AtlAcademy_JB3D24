package News;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        News<String ,Category, Author> news = new News<String, Category, Author>("Goycayda telebe 700 bal topladi",
                new Category<>("Tehsil"),
                new Author("Huseyn","Rustemli"),
                LocalDate.of(2024,1,12));
        news.displayInfo();
    }
}
