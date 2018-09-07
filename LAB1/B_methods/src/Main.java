import java.util.Scanner;

public class Main {

    public static double POWER(double a, int b){
        double power = 1;
        for(int i = 0; i <b; i++){
            power*=a;
        }
        return power;


    }
    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int b;
        double a;
        a = s.nextDouble();
        b = s.nextInt();
        double pow = POWER(a,b);

        System.out.print(pow);

    }
}
