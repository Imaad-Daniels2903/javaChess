package chess;

public class Piece {
    String colour;
    String type;

    public Piece(char notatedPiece) {
        setType(notatedPiece);
        setColour(notatedPiece);
    }

    private void setColour(char notatedPiece) {
        if (Character.isUpperCase(notatedPiece)){
            colour = "White";

        }else{
            colour = "Black";
        }
    }

    private void setType(char notatedPiece) {
        String setType = "";
        switch (Character.toLowerCase(notatedPiece)) {
            case 'p' -> setType = "Pawn";
            case 'r' -> setType = "Rook";
            case 'n' -> setType = "Knight";
            case 'b' -> setType = "Bishop";
            case 'q' -> setType = "Queen";
            case 'k' -> setType = "King";
        }
        type = setType;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public void promote() {
        if (type.compareTo("Pawn") == 0) {
            type = "Queen";
        }
    }
}
