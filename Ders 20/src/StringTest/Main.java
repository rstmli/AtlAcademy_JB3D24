package StringTest;

import com.sun.java.accessibility.util.Translator;

import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    static int[] a = new int[5];
    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        String str1 = "Qırat";
        arrayschap();




    }
    public static void arrayschap(){
        for(int i = 0;i< a.length;i++){
            a[i] = scanner.nextInt();
        }

        System.out.println(Arrays.stream(a));
        for(int a : a){
            System.out.println(a);
        }
    }

}
