package first;

public class Cylinder extends abstractShape implements Shapes{
    double r;
    double h;
    Cylinder(double r,double h){
        this.r = r;
        this.h = h;
    }

    @Override
    public double volume() {
        return Math.PI * this.r * this.r * this.h;
    }

    @Override
    public double surfaceArea() {
        return 2*Math.PI*this.r*this.r + 2 * Math.PI *this.r * this.h;
    }

    @Override
    public String Show() {
        return "Cylinder's volume: " + volume() + "\n" + "Cylinder's surface Area: "+ surfaceArea();
    }
}
