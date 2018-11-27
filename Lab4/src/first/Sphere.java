package first;

public class Sphere extends abstractShape implements  Shapes{
    double r;
    Sphere(double e){
        this.r = e;
    }

    @Override
    public double volume() {
        return 4/3* Math.PI* Math.pow(this.r,3);
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(this.r,2);
    }

    @Override
    public String Show() {
        return "Sphere's volume: " + volume()+"\nSphere's surface area:"+surfaceArea();
    }
}
