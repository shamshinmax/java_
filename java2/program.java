package java2;
public class program {
    public static void main(String[] args) {
        int a = 1;
        int b = 8;
        int k1 = 2;
        int k2 = 1;
        String answer = "";
        while (a < b){
            while (((a + k2)*k1) <= b){
                a = a + k2;
                answer += "k2";
            }
            if (a <= b){

                a = a * k1;
                System.out.println(a);
                answer += "k1";
            }
            if (a != b){
                a = a + k2;
                answer += "k2";
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
