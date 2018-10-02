package fifth;

public class Queen extends Piece {
    private Position a,b;
    Queen(Position a, Position b){
        this.a =a;
        this.b = b;
    }

    @Override
    public boolean IsLegalMove(Position a, Position b) {
        if(a.x == b.x || a.y == b.y||a.x+a.y == b.x+b.y || Math.abs(a.x-a.y) == Math.abs(b.x-b.y)){
            return true;
        }
        return false;
    }

}
