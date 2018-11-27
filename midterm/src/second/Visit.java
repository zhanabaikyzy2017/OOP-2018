package second;

public class Visit{
    private customer customer;
    private String data;
    private double serviseExpense;
    private double productExpense;

    public Visit(customer c, String data){
        this.customer = c;
        this.data = data;
    }
    public customer getCustomer(){return this.customer;}
    public double getServiceExpands(){
        if(customer.isMember()){
            double r = this.serviseExpense - this.serviseExpense * Rate.getServiceDiscountRate(customer.getMemberType())
        }
        return this.serviseExpense;
    }
    public void setServiseExpense(double d){this.serviseExpense = d;}

    public double getProductExpands(){return this.productExpense;}
    public void setProductExpense(double d){this.productExpense= d;}

    public double getTotalExpense(){return this.serviseExpense + this.productExpense;}


    @Override
    public String toString() {
        return customer.getName() + data+ getServiceExpands() + getProductExpands() +"";
    }






}
