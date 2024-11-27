package task3;

public class Main {
    public static void main(String[] args) {
//    Season[] season = Season.values();

    for(Season season:Season.values()){
        System.out.println(season.getFormatInfo());
    }

    }
}
