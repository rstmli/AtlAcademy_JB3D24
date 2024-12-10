package generictask;

public class Main {
    public static void main(String[] args) {
        GenericClass<String,Integer> genericClass = new GenericClass<>("Java",100);
        genericClass.displayInfo();
    }
}
