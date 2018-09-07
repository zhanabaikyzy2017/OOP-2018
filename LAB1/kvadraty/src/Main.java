import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int cnt = 0;
         for(int i = 1; i < Math.sqrt(n); i++){
             if(n % i == 0)
                 cnt++;
         }
          cnt *= 2;
          if(n % Math.sqrt(n) == 0) cnt += 1;
          System.out.println(cnt);
    }
}
