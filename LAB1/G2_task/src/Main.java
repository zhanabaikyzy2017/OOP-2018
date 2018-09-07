import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.next();
        String [] ss = str.split(" ");
        for(int i = 0; i < ss.length; i++){
            if(ss[i] == "{" ){
                s.push("{");
            }
            if(ss[i] == "("){
                s.push("(");
            }
            if(ss[i] == "}" && s.capacity()!= 0){
               if(s.peek() =="{" ){
                   s.pop();
               }
            }if(ss[i] == ")" && s.capacity() != 0) {
                if (s.peek() == "(") {
                    s.pop();
                }
            }
        }

    }
}
