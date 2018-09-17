import java.util.Scanner;

class Num{

    public String one(char s)
    {
        String res = "";
        switch(s){
            case '1':
                res = res + "one";
                break;
            case '2':
                res = res + "two";
                break;
            case '3':
                res = res + "three";
                break;
            case '4':
                res = res + "four";
                break;
            case '5':
                res = res + "five";
                break;
            case '6':
                res = res + "six";
                break;
            case '7':
                res = res + "seven";
                break;
            case '8':
                res = res + "eight";
                break;
            case '9':
                res = res + "nine";
                break;
            default:
                break;
        }
        return res;

    }
    public String second(String sn)
    {
        char sc = sn.charAt(sn.length()-1);
        char sx = sn.charAt(sn.length()-2);
        String res = "";
        if(sx == '1'){
            switch(sc) {
                case '0':
                    res = res + "ten";
                    break;
                case '1':
                    res = res + "eleven";
                    break;
                case '2':
                    res = res + "twelve";
                    break;
                case '3':
                    res = res + "thirteen";
                    break;
                case '4':
                    res = res + "fourteen";
                    break;
                case '5':
                    res = res + "fifteen";
                    break;
                case '6':
                    res = res + "sixteen";
                    break;
                case '7':
                    res = res + "seventeen";
                    break;
                case '8':
                    res = res + "eighteen";
                    break;
                case '9':
                    res = res + "nineteen";
                    break;
                default:
                    break;
            }
        }else{
            switch(sx){
                case '0':
                    res = res + " " + one(sc);
                    break;
                case '2':
                    res = res + " twenty " + one(sc);
                    break;
                case '3':
                    res = res + " thirty " + one(sc);
                    break;
                case '4':
                    res = res + " forty " + one(sc);
                    break;
                case '5':
                    res = res + " fifty " + one(sc);
                    break;
                case '6':
                    res = res + " sixty " + one(sc);
                    break;
                case '7':
                    res = res + " seventy " + one(sc);
                    break;
                case '8':
                    res = res + " eighty " + one(sc);
                    break;
                case '9':
                    res = res + " ninety " + one(sc);
                    break;
                default:
                    break;
            }

        }
        return res;
    }


    public String inWords(int n){
        String sn = "" + n;
        String res;
        String res1 = "";
        String res2 = "";
        String res3 = "";
        while(sn.length()!=5){
            sn = "=" + sn;
        }
        if(sn.charAt(0)!='='){
            String sy = sn.charAt(0) +""+ sn.charAt(1);
            res1 = res1 + "" + second(sy);
        }else{
            if(sn.charAt(1)!='='){
                res1 = res1 + "" + one(sn.charAt(1));
            }
        }
        if(sn.charAt(3)!='='){
            String sz = sn.charAt(3) +""+ sn.charAt(4);
            res3 = res3 + "" + second(sz);
        }else{
            if(sn.charAt(4)!='='){
                res3 = res3 + "" + one(sn.charAt(4));
            }
        }
        if(res1.equals("one")){

            res1 = res1 + " thousand ";
        }else{
            if(res1.length()!=0){
                res1 = res1 + " thousands ";
            }
        }
        if(sn.charAt(2)!='='){
            res2 = res2 + "" + one(sn.charAt(2));
            if(res2.equals("one")){
                res2 = res2 + " hundred ";
            }else{
                if(res2.length()!=0){
                    res2 = res2 + " hu7гndreds ";
                }
            }
        }
        res = res1 +""+  res2 + res3;
        return res;
    }
}
public class Problem6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Num num = new Num();
        System.out.println(num.inWords(n));
    }
}