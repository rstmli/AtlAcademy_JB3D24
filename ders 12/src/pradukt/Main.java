package pradukt;

public class Main {
    public static void main(String[] args) {
        Pracuct praduct = new Pracuct("cips",2.2,"sabun",1);
        Pracuct praduct1 = new Pracuct("Sabun",2.4,"maye",1);
        Pracuct prad = new Pracuct();
        System.out.println(praduct);
        var c = praduct.equals(praduct1);
//        System.out.println(prad.praductIdsCount());

    }
}
