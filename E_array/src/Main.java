import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
            if(( arr[i] > 0 &&  arr[i-1] > 0) || ( arr[i] < 0 &&  arr[i-1] < 0)){
                b++;
            }
        }
        if(b > 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
