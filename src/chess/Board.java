package chess;

import java.util.ArrayList;
import java.util.HashMap;

import chess.Piece;

public class Board {
    ArrayList<ArrayList<Piece>> squares;
    ArrayList<Piece> captured;
    HashMap<String, String> moveLog;
}
