import java.util.Scanner;
public class Problem_6{
    public static void func(int n){
        String ones[]={
                "","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"
        };
        String tens[]={
                "","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"
        };
        String hunds[]={
                "","one hundred","two hundred","three hundred","four hundred","five hundred","six hundred","seven hundred","eight hundered","nine hundred"
        };
        String thous[]={
                "","one thousands","two thousands","three thousands","four thousands","five thousands","six thousands","seven thousands","eight thousands","nine thousands"
        };
        String millions[]={
                "","one millions","two millions","three millions","four millions","five millions","six millions","seven millions","eight millions","nine millions"
        };
        if(n==0)
            System.out.println("-zero");
        if(n>0 && n<=19)
            System.out.println("-"+ones[n]);
        if(n>19 && n<100)
            System.out.println("-"+tens[n/10]+" "+ones[n%10]);
        if(n>=100 && n<1000)
            System.out.println("-"+hunds[n/100]+" "+"[and]"+" "+tens[(n%100)/10]+" "+ones[n%10]);
        if(n>=1000 && n<10000)
            System.out.println("-"+thous[n/1000]+" "+hunds[(n%1000)/100]+" "+"[and]"+" "+tens[(n%100)/10]+" "+ones[n%10]);
        if(n>=10000 && n<100000)
            System.out.println("-"+millions[n/10000]+" "+thous[(n%10000)/1000]+" "+hunds[(n%1000)/100]+" "+"[and]"+" "+tens[(n%100)/10]+" "+ones[n%10]);
        if(n<0 || n>99999)
            System.out.println("out of range!");
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        func(n);

    }

}