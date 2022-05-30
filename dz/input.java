package dz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class input {
    public static int[] get_line() {
        int [] array = new int[2];
        String[] arr1 = new String[1];
        String[] arr2 = new String[1];
        try {

            File file = new File("C:/Users/Макс/Desktop/JAVA/dz/input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            arr1 = line.split(" ");
            while (line != null){
                arr2 = line.split(" ");
                line = reader.readLine();
                
            }
            List<String> list1 = new ArrayList<>(Arrays.asList(arr1));
            if (list1.contains("a")){
                 array[0] = Integer.parseInt(arr1[1]);
                 array[1] = Integer.parseInt(arr2[1]);
            } else {
                array[0] = Integer.parseInt(arr2[1]);
                array[1] = Integer.parseInt(arr1[1]);
            }
        reader.close();
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return array;
    }
}