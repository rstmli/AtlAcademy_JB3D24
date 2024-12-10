package newstask;

public class Category <T> {
    private T categoryName;

    public Category(T categoryName) {
        this.categoryName = categoryName;
    }

    public T getCategoryName() {
        return categoryName;
    }
}
