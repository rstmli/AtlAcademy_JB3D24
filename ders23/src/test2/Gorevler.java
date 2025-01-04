package test2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

public class Gorevler {
    public static void main(String[] args) {
        Map<Integer, String> mission = new HashMap<>();

        mission.put(1, " 30 dakika yürüyüş yap.");
        mission.put(2, " Sabah kahvaltısını sağlıklı yap.");
        mission.put(3, " Çamaşırları yıka.");
        mission.put(5, " E-posta kutusunu temizle.");

        LocalDate a = LocalDate.now();
        String date = a.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy"));

        System.out.println(date + " tarihinin gorevleri");
        for(String entry : mission.values()){
            System.out.println(entry);
        }
        String as = mission.remove(5);
        System.out.println("yapilmis gorev\n" + as);

        System.out.println("\nGuncellenmis gorevler...");
        for(String entry : mission.values()){
            System.out.println(entry);
        }



    }
}
