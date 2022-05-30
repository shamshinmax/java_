package java2;
public class program2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        int k1 = 2;
        int k2 = 1;
        String answer = "";
        while (a < b){
            if ((a*k1) > b){
                a = a + k2;
                answer = answer + "k2";
            }
            else{
                a = a * k1;
                answer = answer + "k1";
            }

        }
        if (a != b){
            System.out.println("Это невозможно");
        }
        else{
            System.out.println(answer);
        }

    }
    
}