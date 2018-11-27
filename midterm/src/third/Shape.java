package third;

abstract class Shape {
    String color;
    boolean filled;
    Shape(){}
    Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){return this.color;}
    public void setColor(String color){this.color = color;}

    public boolean isFilled(){return filled;}
    public void setFilled(boolean f){this.filled = f;}

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        Shape shape = (Shape) obj;
        if(!(obj instanceof Shape)){
            return false;
        }
        return (this.color == shape.color)&& (this.filled == shape.filled);
    }
}
