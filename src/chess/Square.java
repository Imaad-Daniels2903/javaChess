package chess;

import chess.Piece;

public class Square {
    public Piece piece;
    public Boolean empty = true;
    public String cords;

    public Square(String squareCords, Piece chessPiece) {
        piece = chessPiece;
        empty = false;
        cords = squareCords;
    }

    public Square(String squareCords) {
        piece = null;
        cords = squareCords;
    }

    public void placePiece(Piece pieceBeingPlaced) {
        piece = pieceBeingPlaced;
    }

    public void emptySqaure() {
        piece = null;
        empty = true;
    }
}
