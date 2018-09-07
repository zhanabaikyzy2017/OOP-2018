import java.util.Scanner;

public class Main {
    public static boolean Is_Power(int x){

        if(x == 0){
            return false;
        }
        while(x!= 1){
            if(x%2 !=0){
                return false;
            }
            x = x/2;
        }
        return true;

    }

    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.print(Is_Power(x));



    }
}
