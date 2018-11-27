package fifth;

public class MinMax {
    int [] values;
    MinMax(int [] values){
        this.values = values;
    }
    static class Solve{
        int min,max;

        @Override
        public String toString() {
            return "min:" + min + "\nmax:"+ max;
        }
    }
    Solve MaxMin(int []values){
        Solve s = new Solve();
         s.max = values[0];
         s.min = values[0];
        for(int i = 1; i < values.length-1; i++) {
            if (values[i] < s.min) {
                s.min = values[i];
            }
            if (values[i] > s.max) {
                s.max = values[i];
            }
        }
        return s;
    }

    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        MinMax m = new MinMax(a);
        System.out.println(m.MaxMin(a));
    }
}
