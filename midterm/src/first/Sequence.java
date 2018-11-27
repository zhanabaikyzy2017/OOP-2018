package first;

import java.util.Scanner;

public class Sequence {
    private String name;
    Sequence(String name){
        this.name = name;
    }
    public boolean isPalindrome(){
        boolean ok = false;
        for(int i = 0; i < this.name.length()/2; i++){
            if(name.charAt(i) != name.charAt(name.length()-1-i)){
                ok = false;
                return false;
            }
            ok = true;
        }
        if(ok) return true;
        return false;
    }
    public boolean isSubString(Sequence s){
        if(this.name.contains(s.name)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Sequence ss = new Sequence(s);
        String s1 = scan.next();
        Sequence sw = new Sequence(s1);
        System.out.println(ss.isPalindrome());
        System.out.println(ss.isSubString(sw));
    }
}

