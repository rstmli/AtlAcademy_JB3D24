public class Human {
    private String name;       // İnsan adı
    private String surname;    // İnsan soyadı
    private int year;          // Doğum ili
    private Pet pet;           // İnsanla əlaqəli ev heyvanı
    private Human mother;      // Ananı saxlayır
    private Human father;      // Atanı saxlayır

    // Constructor: İnsan obyektini yaratmaq üçün istifadə edilir
    public Human(String name, String surname, int year, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    // Constructor (yalnız ev heyvanı ilə): Bu constructor-da yalnız ev heyvanı təyin edilir
    public Human(String name, String surname, int year, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.pet = pet;
    }

    // Getter metodları: İnsan obyektinin atributlarını əldə etmək üçün istifadə edilir
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    // Setter metodları: İnsan obyektinin atributlarını təyin etmək üçün istifadə edilir
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    // toString metodu: İnsan obyektinin məlumatlarını oxunaqlı şəkildə çap etmək üçün istifadə edilir
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", pet=" + (pet != null ? pet.getNickname() : "No pet") +
                ", mother=" + (mother != null ? mother.getName() : "No mother") +
                ", father=" + (father != null ? father.getName() : "No father") +
                '}';
    }
}
