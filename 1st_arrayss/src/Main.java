import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr [];
        arr = new int [a];
        for(int i = 0; i < a; i++){
            int k = s.nextInt();
            arr[i] = k;
        }
        for(int i = 0; i < a; i++){
            if( i % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
