package third;

public class Square extends Rectangle {
    Square(){}
    Square(double side){
        super(side,side);
    }
    Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){return this.getLength();}
    public void setSide(double side){setLength(side);
    width = side;}

    @Override
    public void setWidth(double w) {
        setSide(w);
    }

    @Override
    public void setLength(double l) {
        setSide(l);
    }

    @Override
    public String toString() {
        return "Square's side : " +length;
    }
}
