package fifth;

class Knight extends Piece{
    private Position a,b;
    Knight(Position a, Position b){
        this.a =a;
        this.b = b;
    }

    @Override
    public boolean IsLegalMove(Position a, Position b) {
        if((Math.abs(b.x - a.x) == 2 && Math.abs(a.y - b.y ) == 1 )||(Math.abs(b.x - a.x) == 1 && Math.abs(a.y - b.y ) ==2 ) ){
            return true;
        }
        return false;
    }

}
