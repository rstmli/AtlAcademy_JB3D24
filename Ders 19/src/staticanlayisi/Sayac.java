package staticanlayisi;

public class Sayac {
    static int say = 0;
    Sayac(){
        say++;
    }
    public static void goster(){
        System.out.println("Obyektlerin sayi: " + say);
    }
}
