package Arrayslist;

import javax.security.sasl.SaslClient;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        for(int i = 0;i<5;i++){
            arr.add(scanner.nextLine());

        }

        String enuzunELement = "";
        int maxLength = 0;

        for(String e : arr){
            if(e.length()>maxLength){
                maxLength = e.length();
                enuzunELement = e;
            }

        }
        System.out.println("en uzun element: " + enuzunELement + " uzunlugu "  + maxLength);

    }



}
