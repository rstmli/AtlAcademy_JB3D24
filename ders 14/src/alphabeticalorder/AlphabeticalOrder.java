package alphabeticalorder;

import java.util.Arrays;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        String[] array = {"r","c","v","b","a","s"};
        Arrays.sort(array);
        int comma = array.length;
        for(String sirala:array){
            comma--;
            System.out.print(sirala);
            if(comma>0){
                System.out.print(",");
            }
        }
    }

}
