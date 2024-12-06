package gpttask;

public class Book {
    private String title;
    private String yazar;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book(String title, String yazar, String isbn) {
        this.title = title;
        this.yazar = yazar;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return title + " " + " yazari" + yazar + " ISBN nomresi: "+ isbn;
    }
}

