import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "Atl.txt";
        FileWriter writer = new FileWriter(filePath);
        FileReader reader = new FileReader(filePath);

        int data = 0;
        Scanner sc = new Scanner(System.in);
        writer.write(sc.next());
        writer.write(32);
        writer.write(sc.next());

        writer.close();
        while((data = reader.read()) != -1){
            System.out.print((char)data);
        }
        reader.close();












    }

}