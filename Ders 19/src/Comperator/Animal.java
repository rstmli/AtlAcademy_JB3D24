package Comperator;

public class Animal {
    private String name;
    private Integer height;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Animal(String name, Integer height) {
        this.name = name;
        this.height = height;
    }
}
