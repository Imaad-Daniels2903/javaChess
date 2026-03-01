
import chess.Piece;

void main() {
    Piece pawn = new Piece('P');

    System.out.println(pawn.getColour());
    System.out.println(pawn.getType());

    pawn.promote();
    System.out.println(pawn.getType());

}
