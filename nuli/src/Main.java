import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int a,b,sum;
        sum = 0;

        a = s.nextInt();
        for(int i = 0; i < a; i++ ){
            b = s.nextInt();
            if(b == 0){
                sum++;
            }

        }
        System.out.print(sum);
    }
}
