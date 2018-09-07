import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int a,b ;
        b = 0;
        a = s.nextInt();

        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                b++;
            }
        }

        System.out.print(b);
    }
}
