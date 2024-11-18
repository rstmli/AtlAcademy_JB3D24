import java.util.Scanner;

public class MethodTask1 {

    public int quvvet (int a,int b){
        int result = 1;
        int stop = 0;
        for(int i = 0; i<b;i++){
            result = result * a;
            stop++;
            if(stop>b){
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MethodTask1 myMethod = new MethodTask1();

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        var result = myMethod.quvvet(firstNumber,secondNumber);

        System.out.println(firstNumber + " Ədədinin " + secondNumber + " qüvvəti: " + result);


    }

}


