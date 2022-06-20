package dz;


import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;


public class output {
    public static void write(int result){
        try {
        FileWriter writer = new FileWriter("output.txt", false);
        writer.write(Integer.toString(result));
        writer.close();
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
    
        }
    }
}
    
