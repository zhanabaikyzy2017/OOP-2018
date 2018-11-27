package second;

public class Test extends Test2 implements Comparable,Cloneable,Showable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void test() {
        System.out.println("Test1");
    }

    @Override
    public void Show() {
        System.out.print("Show Test1");
    }
    public static void main(String args[]){
        Test t1 = new Test();
        t1.test();
        t1.Show();
        t1.justAbstract();
    }
}
