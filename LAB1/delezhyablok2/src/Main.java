import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        a = s.nextInt();
        b = s.nextInt();

        System.out.print(b%a);
    }
}
