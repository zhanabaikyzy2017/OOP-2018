import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                int a = s.nextInt();
                int b = 0;
                int arr [];
                arr = new int [a];
                for(int i = 0; i < a; i++){
                    int k = s.nextInt();
                    arr[i] = k;
                }
                for(int i = 1; i < a; i++){
                    if( arr[i] > arr[i-1]){
                        b++;
                    }
                }
                System.out.print(b);
            }
        }


