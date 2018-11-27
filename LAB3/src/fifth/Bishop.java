package fifth;

class Bishop extends Piece {
    public Position a;
    Bishop(Position a){
        this.a =a;
    }

    @Override
    public boolean IsLegalMove(Position a, Position b) {
        if(a.x+a.y == b.x+b.y || Math.abs(a.x-a.y) == Math.abs(b.x-b.y)){
            return true;
        }
        return false;
    }

}
