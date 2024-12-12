package task;

public class Main {
    public static void main(String[] args) {

        int setirSayi = 4;
//        for(int i = 1;i<=setirSayi;i++){
//            for (int space = 1;space <= setirSayi - i;space++){
//                System.out.print(" ");
//            }
//            for(int star = 1;star <= i*2-1;star++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int i = 1;i<setirSayi;i++){
            for(int space = 1;space<= setirSayi - i;space++){
                System.out.print(" ");
            }
            for(int star = 1; star<= i*2-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
