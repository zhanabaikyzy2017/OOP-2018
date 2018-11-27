package second;

public class Rate {

    final private double serviceDiscountPremium = 0.2;
    final private double serviceDiscountGold = 0.15;
    final private double serviceDiscountSilver = 0.1;
    final private double productDiscountPremium = 0.1;
    final private double productDiscountGold = 0.1;
    final private double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String s){
        if(s == "Premium") {return serviceDiscountPremium;}
        if(s == "Gold"){return  serviceDiscountGold;}
        if(s == "Silver") {return serviceDiscountSilver;}
        return 1;
    }
    public double getProductDiscountRate(String s){
        if(s == "Premium") {return productDiscountPremium;}
        if(s == "Gold"){return  productDiscountGold;}
        if(s == "Silver") {return productDiscountSilver;}
        return 1;
    }
}
