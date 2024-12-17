package binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int find = 17;
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        boolean found = false;
        for(;start <= end;count ++){
            int mid = (start + end) / 2;
            if(find==arr[mid]){
                System.out.println("element tapildi: " + arr[mid]);
                found = true;
                break;
            } else if (find>arr[mid]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        if(!found){
            System.out.println("Element tapilmadi!");
        }
        System.out.println("dovr sayi: " + count);










//        while(start<=end) {
//            count++;
//            int mid = (start + end) / 2;
//            if(find==arr[mid]){
//                System.out.println("Element tapildi: " + arr[mid]);
//                found = true;
//                break;
//            }else if (find > arr[mid]){
//                start = mid + 1;
//            }else{
//                end = mid -1;
//            }
//        }
//        if(!found){
//            System.out.println("Element tapilmadi!!");
//        }
//        System.out.println("dovr sayi: " + count);



    }


}
