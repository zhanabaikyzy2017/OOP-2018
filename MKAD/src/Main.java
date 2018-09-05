import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v,t;
        v = s.nextInt();
        t = s.nextInt();
        if(v > 0){
            System.out.print((v*t) % 109);
        }if(v<0){
            System.out.print((109 + ((v*t) % 109)) % 109 );

        }if (v == 0){
            System.out.print(0);
        }
    }
}
