package FIleReaderAndFileWriter;

import java.io.*;
import java.util.ArrayList;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String filepath = "Oracle.txt";
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        String satir;
        var text2 = new ArrayList<String>();
        while((satir = reader.readLine()) != null){
//            text2 = satir.split(" ");
        }


    }
}
