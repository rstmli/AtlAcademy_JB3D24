package News;

public class Author <V>{
    private V authorName;
    private V authorSurname;

    public Author(V authorName, V authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public V getAuthorName() {
        return authorName;
    }

    public V getAuthorSurname() {
        return authorSurname;
    }
    public String getFullName(){
        return getAuthorName() + " " + getAuthorSurname();
    }

}
