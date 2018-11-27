package first;

public class Cube extends abstractShape implements Shapes {
    double r;
    Cube(double r){
        this.r = r;
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(r,2);
    }

    @Override
    public double volume() {
        return Math.pow(r,3);
    }

    @Override
    public String Show() {
        return "Cube's volume: " + volume() +"\n"+"Cube's surface area: " + surfaceArea();
    }
}
