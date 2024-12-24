import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        for(int i = 2;i <=a;i++){
            if(i%a == 0){
                b++;
            }

        }
        if(a>2){
            System.out.println("murekkebdir");
        }else{
            System.out.println("sadedir");
        }

    }

}
