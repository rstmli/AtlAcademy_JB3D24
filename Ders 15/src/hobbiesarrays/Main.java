package hobbiesarrays;
public class Main {
    public static void main(String[] args) {
        String a = "Salam.";
        boolean b = a.endsWith(".");
        if(!b) {
            System.out.println(a + ".");
        }else{
            System.out.println(a);
        }
    }
}
