package newstask2;

public class Category <T>{
    private T name;

    public Category(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

}
