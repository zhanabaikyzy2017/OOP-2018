package second;

abstract class Shape {
    double radius;
    Shape(double r){
        radius = r;
    }

    abstract double diameter();
    abstract double volume();
    abstract double surfaceArea();
}
