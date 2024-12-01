package Bankooptest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int max = Integer.MIN_VALUE;
        int i = 0;
        for(i = 0;i< arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        for(i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print(arr[max]);
    }
}
