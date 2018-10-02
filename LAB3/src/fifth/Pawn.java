package fifth;

class Pawn extends Piece {
    private Position a,b;
    Pawn(Position a, Position b){
        this.a =a;
        this.b = b;
    }

    @Override
    public boolean IsLegalMove(Position a, Position b) {
        if(a.y == 1){
            if(b.y == a.y+1|| b.y == a.y+2)
                return true;
        }else{
            if(b.y == a.y +1){
                return true;
            }
        }
        return false;
    }

}
