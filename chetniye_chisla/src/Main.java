import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);

        int k = s.nextInt();
        int m = s.nextInt();

        for(int i = k; i <= m; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
