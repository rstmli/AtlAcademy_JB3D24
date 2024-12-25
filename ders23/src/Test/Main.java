package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean isprime = true;

        for(int i = 2;i<=input/2;i++){
            if(input%i==0){
                isprime = false;
                break;
            }
        }
        if(isprime){
            System.out.println("bu eded sade ededdir");
        }else{
            System.out.println("bu eded murekkeb ededdir");
        }

    }



}
