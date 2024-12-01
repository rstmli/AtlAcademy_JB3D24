package stringMethodApp;

import java.util.Scanner;
public class Main {
    public static void length(){
        System.out.println("\u001B[32m" + "Stringin uzunlugunu qaytarir" + "\u001B[0m");
    }
    public static void charAt(){
        System.out.println("\u001B[32m" + "Mueyyen indexdeki sayiyi qaytarir" + "\u001B[0m");
    }
    public void toUpperCase(){
        System.out.println("\u001B[32m" + "Butun herfleri boyuk herflere cevirir" + "\u001B[0m");
    }
    public  void wellComeMain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\u001B[32m" + "Programimiza xos gelmisiniz" + "\u001B[0m");
        String choice = scanner.next();
        if(choice.equalsIgnoreCase("touppercase") || choice.equalsIgnoreCase("uppercase")){
            toUpperCase();
        } else if (choice.equalsIgnoreCase("case")) {
            toUpperCase();
        } else if (choice.equalsIgnoreCase("hamisi")) {
            if(choice=="hamisi"){
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = new Main();
        System.out.println("\u001B[36m" + "Probrama xosgelmisiniz");
        System.out.print("\u001B[31m" + "keyi daxil edin: " + "\u001B[36m");
        String[] keys = {"AtlAcademy","huseyn","veexgaan","12345"};
        String key = scanner.next();
        a.login(keys,key);

    }
    public String login(String[] keys,String key) {
        for (int i = 0; i < keys.length; i++) {
            if (key.equalsIgnoreCase(keys[i])) {
                wellComeMain();
                break;
            }
        }
        return "System.out.println(\"Database de bele bir sifre tapilmadi.);";
    }

}
