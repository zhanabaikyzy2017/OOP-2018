package fourth;

import first.Point;

import java.util.Iterator;

public class Test implements Rollable {
    Point x,y;
    Test(Point x, Point y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean Roll() {
        return true;
    }

    @Override
    public void moveTo(Point a, Point b) {
        this.x =a;
        this.y = b;
    }

}
