import java.util.Scanner;

public class NumberHasili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int hasil = 1;
            var mesaj = "ədəd daxil edin";
            System.out.println(mesaj);
            int a = scanner.nextInt();
            if(a>0){
                for(int i = 1;i<=a;i++){
                    hasil = i*hasil;
                }
                System.out.println("Ədədin hasili: " + hasil);
            } else if (a==-1) {
                System.out.println("çıxıldı...");
                break;
            }else{
                System.out.println("Daxil etdiyiniz ədəd düzgün deyil!");
            }

        }
    }
}
