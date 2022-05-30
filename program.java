import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class program {
 
    public static void main(String[] args) {
        int numA = 0;
        int numB = 0;
        int result = 0;
        try {

            File file = new File("input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            String [] arr = line.split(" ");
            char c = arr[0].charAt(0);
            if (c == 'a'){
                numA = Integer.parseInt(arr[1]);
            }
            else {
                numB = Integer.parseInt(arr[1]);
            }
            while (line != null) {
                
                String [] arr2 = line.split(" ");
                c = arr2[0].charAt(0);
                if (c == 'a'){
                    numA = Integer.parseInt(arr2[1]);
                }
                else {
                    numB = Integer.parseInt(arr2[1]);
                }
                line = reader.readLine();
            }
            result = pow(numA, numB);
            FileWriter writer = new FileWriter("output.txt", false);
            System.out.println(result);
            
            writer.write(Integer.toString(result));
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
}
    
    
}
public static int pow(int value, int pow) {
    int sum = value;
    for (int i = 1; i < pow; i++) {
        sum = sum * value;
    }
    return sum;
 }
}

