package fifth;

class King extends Piece{
    private Position a,b;
    King(Position a, Position b){
        this.a =a;
        this.b = b;
    }

    @Override
    public boolean IsLegalMove(Position a, Position b) {
        if((b.x == a.x + 1 && a.y == b.y) ||(a.y == b.y && b.x ==a.x-1)||
                (a.x==b.x && b.y==a.y+1)||(a.x==b.x && b.y==a.y-1)){
            return true;
        }
        return false;
    }

}

