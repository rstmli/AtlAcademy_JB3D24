package pradukt;

import java.util.Objects;

public class Pracuct {
    private int id;
    private String name;
    private Double price;
    private String catagoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCatagoria() {
        return catagoria;
    }

    public void setCatagoria(String catagoria) {
        this.catagoria = catagoria;
    }


    public Pracuct(String name, Double price, String catagoria, int id) {
        this.name = name;
        this.price = price;
        this.catagoria = catagoria;
        this.id = id;
    }



    public Pracuct() {
    }

    @Override
    public String toString() {
        return "pracuct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", catagoria='" + catagoria + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pracuct pracuct = (Pracuct) o;
        return Objects.equals(id, pracuct.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, catagoria);
    }
}
