
import chess.Board;
import chess.Square;

void main() {
    Board chessBoard = new Board();
    chessBoard.genBoard();

    for (Map.Entry<String, Square> entry : chessBoard.boardArray.entrySet()) {
        System.out.println(entry.getValue().cords);
    }

}
