package tasktest10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String qirmizi = "\u001B[31m";
        System.out.println(qirmizi);
//        int i = 0;
//        do {
//            i++;
//            System.out.println(i);
//        }while (i<3);
//
//
//
//        Integer x = 126;
//        Integer y = 126;
//        System.out.println(x == y);
//        int[] nums = {1, 2, 3};


//        for (int i = 0; i < nums.length; i++){
//            if(nums[i]==2){
//                break;
//            }
//            System.out.println(nums[i] + " ");
//        }



//        int i = 0;
//        while (i<5) {
//            System.out.println(i);
//        }

//        int x = 10;
//        String result = (x>5) ? "Greater" : "Smaller";
//        System.out.println(result);
//        int[] arr = {1,2,3,4};
//
//        for(int i: arr){
//            if(i%2==0) continue;
//            System.out.println(i+ " ");
//        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a>b && a >c){
            System.out.println(a);
        }else if(b > a && b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }

    }
}
