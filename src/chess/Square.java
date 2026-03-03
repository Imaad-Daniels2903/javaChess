package chess;

import chess.Piece;

public class Square {
    Piece piece;
    public Boolean empty = true;
    String cords;

    public Square(String squareCords, Piece chessPiece) {
        this.piece = chessPiece;
        this.empty = false;
        this.cords = squareCords;
    }

    public Square(String squareCords) {
        this.piece = null;
        this.cords = squareCords;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void placePiece(Piece pieceBeingPlaced) {
        this.piece = pieceBeingPlaced;
    }

    public void emptySqaure() {
        this.piece = null;
        this.empty = true;
    }
}
