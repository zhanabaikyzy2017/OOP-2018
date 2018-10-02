package fifth;

class Bishop extends Piece {
    private Position a,b;
    Bishop(Position a, Position b){
        this.a =a;
        this.b = b;
    }

    @Override
    public boolean IsLegalMove(Position a, Position b) {
        if(a.x+a.y == b.x+b.y || Math.abs(a.x-a.y) == Math.abs(b.x-b.y)){
            return true;
        }
        return false;
    }

}
