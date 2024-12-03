import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        arr.add("Huseyn");
        arr.add("Ilkin");
        arr.add("Elnur");
        arr.remove(1);
        System.out.println(arr);
    }
}