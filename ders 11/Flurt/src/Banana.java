public class Banana extends Fruit{
    public Banana(String name, String color, String taste, String climate, String country, Boolean eatable) {
        super(name, color, taste, climate, country, eatable);
    }

    public void printCountry(){
        System.out.println(getCountry());
    }

}
