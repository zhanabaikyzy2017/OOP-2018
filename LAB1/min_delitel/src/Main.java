import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int a,b;
        b = 2;
        a = s.nextInt();
        if( a == b){
            System.out.print(b);
        }
        while(b != a ){
            if(a%b == 0){
                System.out.print(b);
                break;
            }
            b++;
            if( a == b){
                System.out.print(b);
            }

        }

    }
}
