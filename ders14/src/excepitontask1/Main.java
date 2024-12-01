package excepitontask1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int a = 5;
            int b = a/0;
//            throw new NullPointerException("Error");
            //            nul.length();

        }catch(Exception a){
            System.out.println(a.getMessage());

        }
    }

}
