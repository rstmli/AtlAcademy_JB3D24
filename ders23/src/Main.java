import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "Atl.txt";
        FileWriter writer = new FileWriter(filePath);
        FileReader reader = new FileReader(filePath);

        int data = 0;
        writer.write("Huseyn");
        writer.write(32);
        writer.write("Rustemli");

        writer.close();
        while((data = reader.read()) != -1){
            System.out.print((char)data);
        }












    }
}