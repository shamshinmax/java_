package java3;

import java.util.Scanner;


public class in_out_put {
    
    public static int get_num() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        scanner.close();
        return result;
        
    }
    public static int triangle_num(int num){
        int Tnum = (num+1)*num/2;
        return Tnum;
    }
    
}
