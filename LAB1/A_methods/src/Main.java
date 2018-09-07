import java.util.Scanner;

public class Main {
    public static int MIN(int a, int b, int c, int d){
        int min = a;
        if(a <= b && a <= c && a <= d){
            min = a;
        }
        if(b <= a && b <= c && b <= d){
            min = b;
        }
        if( c <= a && c <= b && c <= d ){
            min = c;
        }
        if( d <= a && d <= b && d <= c){
            min = d;
        }
        return min;
    }


    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int a,b ,c ,d;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();

        int min = MIN(a,b,c,d);

        System.out.print(min);

    }
}
