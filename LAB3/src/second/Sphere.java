package second;

class Sphere extends Shape{
    Sphere(double r){
        super(r);
    }

    public double diameter(){
        return radius*=2;
    }
    public double volume(){
        return 4/3*Math.PI*radius*radius*radius;
    }
    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
}
