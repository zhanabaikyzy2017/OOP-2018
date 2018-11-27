package third;
public class Test2 {
    public static void main(String args[]){
        Circle c =new Circle(2,"red",true);
        Rectangle r = new Rectangle(2,3,"green",true);
        Rectangle r2 = new Rectangle(2,3,"green",true);
        Circle c2 = new Circle(3,"red",true);


        System.out.println(c.getArea());
        System.out.println(r.getArea());

        System.out.println();

        System.out.println(c.getPerimeter());
        System.out.println(r.getPerimeter());

        System.out.println();

        System.out.println(r.equals(r2));
        System.out.println(c.equals(c2));
    }

}
