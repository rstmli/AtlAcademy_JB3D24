package task;

public class Main {
    public static void main(String[] args) {


        int witdh = 20;
        for(int i = 1;i<witdh;i++){
            for(int space = 1;space<= witdh - i;space++){
                System.out.print(" ");
            }
            for(int star = 1;star<=i*2-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
