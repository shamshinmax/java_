package dz;
 
public class program {
 
    public static void main(String[] args) {
        int[] array = input.get_line();
        output.write(pow(array[0], array[1]));
    

}
    

public static int pow(int value, int pow) {
    int sum = value;
    for (int i = 1; i < pow; i++) {
        sum = sum * value;
    }
    return sum;
}
}

