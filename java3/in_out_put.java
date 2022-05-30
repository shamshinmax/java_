package java3;

import java.util.Scanner;


public class in_out_put {
    public static int get_num() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
     }
    public static int triangle_num(int num){
        int Tnum = (num+1)*num/2;
        return Tnum;
    }
}
