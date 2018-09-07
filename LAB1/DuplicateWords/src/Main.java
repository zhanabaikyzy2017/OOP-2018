import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String s;
        ArrayList<String> strings = new ArrayList<>();
        String[] words;
        boolean sameWords = false;
        for (int i = 0; i <= n; i++){
            s = scan.nextLine();

            words = s.split(" ");

            for(int j = 0; j < words.length; j++){
                if(strings.isEmpty())
                    strings.add(words[j]);
                else{
                    for(String test : strings){
                        if(test.toLowerCase() == words[j].toLowerCase()){
                            sameWords = true;
                            break;
                        }
                    }
                    if(!sameWords) strings.add(words[j]);
                }

            }
            for(String output : strings){
                System.out.print(output + " ");
            }
            System.out.println();
            strings.clear();
            sameWords = false;
        }

    }
}
