package fifth;

class Rook extends Piece{
    private Position a,b;
    Rook(Position a, Position b){
        this.a =a;
        this.b = b;
    }

    @Override
    public boolean IsLegalMove(Position a, Position b) {
        if(a.x == b.x || a.y == b.y){
            return true;
        }
        return false;
    }

}
