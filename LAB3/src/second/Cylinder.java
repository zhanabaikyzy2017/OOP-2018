package second;

class Cylinder extends Shape{
    private double high;
    Cylinder(double r,double h){
        super(r);
        high = h;
    }
    public double diameter(){
        return radius*=2;
    }
    public double volume(){
        return Math.PI*radius*radius*high;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius;
    }
}
