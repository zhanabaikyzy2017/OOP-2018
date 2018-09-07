import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a,b ,c ,d;

            a = s.nextInt();

            for(int i = 2; i <= a; i++){
                if(a % i == 0){
                    System.out.print(i);
                    break;
                }
            }
    }
}
