public class Family {
    private Human mother;  // Ananı saxlayır
    private Human father;  // Atanı saxlayır
    private Human child;   // Uşağı saxlayır
    private Pet familyPet; // Ailənin ev heyvanını saxlayır

    // Constructor: Ailə üzvlərini təyin edir
    public Family(Human mother, Human father, Human child, Pet familyPet) {
        this.mother = mother;
        this.father = father;
        this.child = child;
        this.familyPet = familyPet;
    }

    // Getter və Setter metodları
    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getChild() {
        return child;
    }

    public void setChild(Human child) {
        this.child = child;
    }

    public Pet getFamilyPet() {
        return familyPet;
    }

    public void setFamilyPet(Pet familyPet) {
        this.familyPet = familyPet;
    }

    // Ailənin məlumatlarını ekrana çap etmək üçün toString metodu
    @Override
    public String toString() {
        return "Family{" +
                "mother=" + (mother != null ? mother.getName() : "No mother") +
                ", father=" + (father != null ? father.getName() : "No father") +
                ", child=" + (child != null ? child.getName() : "No child") +
                ", familyPet=" + (familyPet != null ? familyPet.getNickname() : "No pet") +
                '}';
    }
}
