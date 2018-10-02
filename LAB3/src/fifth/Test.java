package fifth;

public class Test {
    public static void main(String args[]){
        Rook r = new Rook(new Position(1,2),new Position(1,4));
        System.out.println(r.IsLegalMove(new Position(1,2),new Position(1,4)));
    }

}
