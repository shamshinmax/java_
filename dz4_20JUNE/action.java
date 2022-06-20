package dz4_20JUNE;


import java.util.Scanner;
// import com.opencsv.CSVReader;
// import com.opencsv.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class action {
    public static void imp(){
        
        System.out.println("What do you want to import?(write 'name surname telephone')");
        String txt = input();
            try {
            FileWriter writer = new FileWriter("dz4_20JUNE/log.txt", true);
            // CSVWriter csvwriter = new CSVWriter(writer);
            // csvwriter.writeNext(txt.split(","));
            String[] arr = txt.split(" ");
            int num = arr.length;
            if (num == 3){
                writer.write(String.format("Name: %s Surname: %s Telephone: %s \n", arr[0], arr[1], arr[2]));
                System.out.println("Import...");
            } else {
                System.out.println("Incorrect input");
            }
            writer.close();
            // csvwriter.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
    

    public static String exp(){
        System.out.println("What do you want to export?(write some info name, surname or telephone)");
        // System.out.println("Write 'all' to get all");
        String info = input();
        String line = "";
        try {
            File file = new File("dz4_20JUNE/log.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            while (line.contains(info) == false){
                line = reader.readLine();
                if (line == null){
                    break;
                }
            } 
            reader.close();   
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        System.out.println("Export...");
        if (line != null)
            if (line.contains(info)){
                return line;
            } else {
                return "No data";
        } else {
            return "Справочник пуст";
        }


        
        
    }
    
    public static boolean end(){
        System.out.println("Ending...");
        return false;
    }
    public static void start(){

        System.out.println("--Телефонный справочник--");
        System.out.println("|Write 'imp' to import ");
        System.out.println("|Write 'exp' to export ");
        System.out.println("|Write 'end' to exit ");
    }
    public static String input(){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        String result = scanner.nextLine();
        
        return result;
        
    }
}  