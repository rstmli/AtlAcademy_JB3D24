package generictask;

public class GenericClass <K, V>{
    private K name;
    private V age;

    public GenericClass(K name, V age) {
        this.age = age;
        this.name = name;
    }

    public K getName() {
        return name;
    }

    public V getAge() {
        return age;
    }
    public void displayInfo(){
        System.out.println(name + " " + age);
    }
}
