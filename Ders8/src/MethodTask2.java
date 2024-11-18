import java.util.Scanner;

public class MethodTask2 {
    public String reverse(String a){
        String b = "";
        for(int i = a.length() - 1; i>=0;i-- ) {
            b += a.charAt(i);
            if(i==0){
                break;
            }
        }
        return b;
    }


    public static void main(String[] args) {
        MethodTask2 convert = new MethodTask2();
        Scanner scanner = new Scanner(System.in);
        System.out.print("tərs çevriləcək mətni daxil edin: ");
        String text = scanner.next();
        System.out.println("daxil edildi: " + text + " tərsi: " + convert.reverse(text));
    }
}
