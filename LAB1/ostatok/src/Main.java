import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a,b ,c ,d;

            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            d = s.nextInt();

            for(int i = a; i <= b; i++){
                if(i % d == c){
                    System.out.print(i + " ");
                }
            }
    }
}
