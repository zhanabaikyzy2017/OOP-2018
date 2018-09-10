import  java.util.Scanner;
class  Data{
    private static double sum=0;
    private static double max;
    private static int mnt=0;
    Data(){}
    public void setdata(double num){
        if(mnt==0){
            this.max = num;
        }else{
            if(num>max){
                this.max = num;
            }
        }
        this.mnt = ++mnt;
        sum+=num;

    }
    public int getMnt(){
        return mnt;
    }
    public double getSum(){
        return sum;
    }
    public double getMax(){
        return max;
    }
}
class Analyzer{
    public static String compute(Data d){
        double av = d.getSum()/d.getMnt();
        double max = d.getMax();
        String res ="Average: " + av + "\n" + "Max: "+ max;
        return res;
    }
}

class Problem3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Data d1 = new Data();
        while(true){
            String snum = scan.next();
            if(snum.equals("Q")){
                System.out.println(Analyzer.compute(d1));
                break;
            }else {
                double num = Double.parseDouble(snum);
                d1.setdata(num);
            }
        }

    }
}
