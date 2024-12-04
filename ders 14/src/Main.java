import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    elementInTheArray();
    sumAverage();
    alphabeticalOrder();
    reverseIntNumber();
    largeSmallElement();
    }
    // elementin icindeki eded
    public static void elementInTheArray() {
        int[] arrays = {1,2,3,4,5,6};
        int number = 14;
        boolean contains = containsNumber(arrays, number);
        if(contains){
            System.out.println("arrayin icinde " + number + " var");
        }
        else{
            System.out.println("arrayin icinde " + number + " yoxdu.");
        }
    }

    public static boolean containsNumber(int[] array, int number) {
        return Arrays.stream(array).anyMatch(x -> x == number);
    }
    // elementlerin cemi ve ededi ortasi
    public static void sumAverage(){
        int[] arr = {23,24,12,13};
        double sum = Arrays.stream(arr).sum();
        double average = sum / arr.length;
        System.out.println("ededlerin cemi: " + sum + " ededi ortasi: " + average);

    }
    // alfabetik sirayla siralanmasi
    public static void alphabeticalOrder(){
        String[] array = {"r","c","v","b","a","s"};
        System.out.print("arraydaki elementler: ");
        for(String arr:array){
            System.out.print(arr + ",");
        }
        Arrays.sort(array);
        int comma = array.length;
        System.out.print(" duzeldilmis elementler: ");
        for(String sort:array){
            comma--;
            System.out.print(sort);
            if(comma>0){
                System.out.print(",");
            }
        }
    }
    // elelementleri tersine cevirmek
    public static void reverseIntNumber(){
        int[] arr = {4, 2, 12, 200, 70};

        int[] reversedArr = new int[arr.length];
        System.out.println("");
        Arrays.setAll(reversedArr, i -> arr[arr.length - 1 - i]);
        for(int num : reversedArr){
            System.out.print(num + " ");
        }
    }
    // boyuk ve kicik element
    public static void largeSmallElement(){
        System.out.println("");
        int[] array = {50,30,70,20,10};
        int maxnum = Arrays.stream(array).max().getAsInt();
        int minnum = Arrays.stream(array).min().getAsInt();
        System.out.print("en boyuk element: " + maxnum + " en kicik element: " + minnum);
    }
}
