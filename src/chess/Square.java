package chess;

import chess.Piece;

public class Square {
    Piece piece;
    Boolean empty = true;
    int[] cords;

    public Square(Piece chessPiece, int[] squareCords) {
        piece = chessPiece;
        empty = false;
        cords = squareCords;
    }

    public Square(int[] squareCords) {
        piece = null;
        cords = squareCords;
    }

}
