package News;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<News> arr = new ArrayList<>();

        News<String ,Category, Author> news1 = new News<String, Category, Author>("Javada Genericler",
                new Category<>("Programing"),
                new Author("Mushfig","Manafli"),
                LocalDate.of(2024,1,12));




        arr.add(news1);

        for(News e:arr){
            e.displayInfo();
            System.out.println("---------------------------------------------");
        }
    }
}
