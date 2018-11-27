package first;

import java.util.Date;

public class Test {
    public static void main(String args[]){
        Cylinder c = new Cylinder(5,4);
        System.out.println(c.Show());
        Cube cc = new Cube(4);
        System.out.println(cc.Show());
        Sphere s = new Sphere(3);
        System.out.println(s.Show());
        Point p = new Point(2,2);
        System.out.println(p.Show());
        Date d = new Date();
        System.out.print(d);
    }
}
