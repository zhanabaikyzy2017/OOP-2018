import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int a,b ;
        b = 0;

        for(int i = 0; i < 100; i++){
            a = s.nextInt();
            b+=a;

        }

        System.out.print(b);
    }
}
