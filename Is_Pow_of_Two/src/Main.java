import java.util.*;

public class Main{
    public static boolean TRUE(String input){
        Stack <Character >stack = new Stack<Character> ();
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(c == '(')
                stack.push(c);
            else if (c == '{')
                stack.push(c);
            else if(c == '}')
                if(stack.empty()){
                    return false;
                }else if(stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            else if(c == ')'){
                if(stack.empty()){
                    return false;
                }else if(stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }
            return stack.empty();

        }
    }

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        String input;
        while(sc.hasNext()){
            input = sc.next();
            System.out.println(TRUE(input));
        }

    }
}
