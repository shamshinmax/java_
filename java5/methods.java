package java5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//1? + 3? = 45
public class methods {
    
    public static String input() {
        String line = null;
        try {

        File file = new File("java5/equtation.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        line = reader.readLine();
        reader.close();
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        
        return line;
    }
    public static Integer[] to_int(String equot) {
        Integer[] arrayOfInt = new Integer[6];
        String [] arrayOfString = equot.split(" ");
        arrayOfString[1] = arrayOfString[2];
        arrayOfString[2] = arrayOfString[4];
        for (int i = 0; i < 3; i++){
            System.out.println(arrayOfString[i]);
        }

        return arrayOfInt;
    }
}
            
        
             