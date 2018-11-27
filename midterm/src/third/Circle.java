package third;

public class Circle extends Shape {
    double radius;
    public Circle(){}
    public Circle(double r){
        this.radius = r;
    }
    public Circle(double r,String color,boolean filled){
        super(color, filled);
        this.radius = r;
    }

    public double getRadius(){return this.radius;}
    public void setRadius(double r){this.radius = r;}

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        Circle c = (Circle) obj;
        if(!(c instanceof Circle)){
            return false;
        }
        return super.equals(obj) && (this.radius == c.radius);
    }
}
