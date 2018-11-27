package first;

public class Point extends abstractShape implements Shapes {
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String Show() {
        return "Point hasn't got volume and surface area";
    }

    @Override
    public double volume(){
        return 0;
    }

    @Override
    public double surfaceArea() {
        return 0;
    }
}
