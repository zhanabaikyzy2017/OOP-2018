import java.util.Scanner;

public class Main {
    public static boolean Xor(int a, int b){
        boolean res = true;
        if(a == b){
            res = false;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a,b;
        a = s.nextInt();
        b = s.nextInt();
        boolean res = Xor(a,b);
        if(res == true){
            System.out.print(1);

        }else{
            System.out.print(0);

        }




    }
}
