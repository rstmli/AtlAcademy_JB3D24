import javax.swing.text.StyledEditorKit;

public class Fruit {
    private String name;
    private String color;
    private String taste;
    private String climate;
    private String country;
    private Boolean eatable;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getTaste() {
        return taste;
    }

    public String getClimate() {
        return climate;
    }

    public String getCountry() {
        return country;
    }

    public Boolean getEatable() {
        return eatable;
    }

    //    public Fruit (){
//
//    }
    public Fruit(String name, String color, String taste, String climate, String country, Boolean eatable) {
        this.name = name;
        this.color = color;
        this.taste = taste;
        this.climate = climate;
        this.country = country;
        this.eatable = eatable;
    }


    public void info(){
        System.out.println(name + " " + color);
    }
}
