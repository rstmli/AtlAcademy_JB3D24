package buublesort;

public class Main {
    public static void main(String[] args) {
    int[] arr = {5,4,2,6,7,8,9,1,3};

    for(int i = 0;i<arr.length-1;i++){
        for(int j = 0;j<arr.length-i-1;j++){
            int temp = 0;
            if(arr[j]>arr[j+1]){
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    for(int i : arr){
        System.out.print(i);
    }

    }
}
