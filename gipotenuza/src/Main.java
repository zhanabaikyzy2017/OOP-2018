import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a,b,c;
        a = s.nextInt();
        b = s.nextInt();
        c = Math.sqrt(a*a + b*b);

        System.out.println(c);
    }
}
