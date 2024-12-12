package News;

public class Category <U>{
    private U categoryName;

    public Category(U categoryName) {
        this.categoryName = categoryName;
    }

    public U getCategoryName() {
        return categoryName;
    }
}
