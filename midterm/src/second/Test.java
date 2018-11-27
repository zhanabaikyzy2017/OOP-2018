package second;

import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        customer c = new customer("Assem");
        Visit v = new Visit(c,"12.02");
        Rate r = new Rate();
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();//products
        int y = scan.nextInt();//services
        String s = scan.next();//membership
        /*if(s.isEmpty()){
            c.setMember(false);
        }else{
            c.setMemberType(s);
            c.setMember(true);
        }*/
        v.setProductExpense(200);
        v.setServiseExpense(300);

        customer cc = v.getCustomer();
        if(cc.isMember()){
            if(cc.getMemberType() == "Premium"){
                v.setServiseExpense(y*v.getServiceExpands()*r.getServiceDiscountRate("Premium"));
                v.setProductExpense(x*v.getProductExpands()*r.getProductDiscountRate("Premium"));
            }
            if(cc.getMemberType() == "Gold"){
                v.setServiseExpense(y*v.getServiceExpands()*r.getServiceDiscountRate("Gold"));
                v.setProductExpense(x*v.getProductExpands()*r.getProductDiscountRate("Gold"));
            }
            if(cc.getMemberType() == "Silver"){
                v.setServiseExpense(y*v.getServiceExpands()*r.getServiceDiscountRate("Silver"));
                v.setProductExpense(x*v.getProductExpands()*r.getProductDiscountRate("Silver"));
            }
        }
        System.out.println(v.getTotalExpense());
    }
}
