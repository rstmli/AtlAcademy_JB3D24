package newstask2;

public class Author <T>{
    private T name;
    private T surname;

    public Author(T name, T surname) {
        this.name = name;
        this.surname = surname;
    }

    public T getName() {
        return name;
    }

    public T getSurname() {
        return surname;
    }
    public String getFullName(){
        return getName() + " " + getSurname();
    }
}
