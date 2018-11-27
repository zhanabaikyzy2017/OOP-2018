package third;

import com.sun.javafx.font.directwrite.RECT;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle(){}
    public Rectangle(double w, double l){
        this.width = w;
        this.length = l;
    }
    public Rectangle(double w,double l, String color, boolean filled){
        super(color, filled);
        this.width = w;
        this.length = l;
    }

    public double getWidth() {return this.width; }
    public void setWidth(double w){this.width = w;}

    public double getLength(){return this.length;}
    public void setLength(double l){this.length = l;}

    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return 2*(this.width + this.length);
    }

    @Override
    public String toString() {
        return "The rectangle's width = " + this.width + " and length = " +this.length;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        Rectangle r = (Rectangle)obj;
        if(!(r instanceof Rectangle)) return false;
        return super.equals(obj) && (this.length == r.length) && (this.width == r.width);
    }
}
