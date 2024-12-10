package newstask;

public class Author<U> {
    private U name;
    private U surname;

    public Author(U name, U surname) {
        this.name = name;
        this.surname = surname;
    }

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }

    public U getSurname() {
        return surname;
    }

    public void setSurname(U surname) {
        this.surname = surname;
    }
    public String fullName(){
        return getName() + " " + getSurname();
    }
}
