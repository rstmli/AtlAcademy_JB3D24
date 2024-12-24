import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        var reader = new FileReader("atl3");
        int data;
        int count = 0;
        while((data = reader.read()) != -1){
            System.out.print((char) data);
            if(data == 10){
                count++;

            }
            if(count==2){
                System.out.println("************");
                count=0;
            }
        }
        reader.close();
    }
}