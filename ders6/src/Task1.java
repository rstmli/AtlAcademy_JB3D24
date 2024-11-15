import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("ilk ədədi daxil edin: ");
        int start = scanner.nextInt();
        System.out.print("ikinci ədədi daxil edin: ");
        int end = scanner.nextInt();
        int i = 0;

        var tek = 0;
        var cut = 0;

        int tekcem = 0;
        int cutcem = 0;

        if(start>end){
            int c = start;
            start = end;
            end = c;
        }

        for(i = start + 1;i<end;i++){
            if(i%2!=0) {
                tek++;
                tekcem = i+tekcem;
            } else if (i%2==0) {
                cut++;
                cutcem = cutcem+i;
            }
        }
        System.out.println("tek ədədlərin sayi: " + tek);
        System.out.println("cüt ədədlərin sayi: " + cut);
        System.out.println("tek ədədlərin cəmi: " + tekcem);
        System.out.println("cüt ədədlərin cəmi: " + cutcem);
    }
}
