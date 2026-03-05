package chess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import chess.Square;
import chess.Piece;

import javax.swing.*;


public class Board {
    public HashMap<String, Square> boardArray = new HashMap<>();
    public String turn;

    public void genBoard() {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};

        for (int i = 1; i < 9; i++) {
            for (String letter: letters) {
                String cords = Integer.toString(i) + letter;
                Square newSquare = new Square(cords);

                boardArray.put(cords, newSquare);
            }
        }
    }

     private void move(String piece, String cords) {
     }

     public void setBoard(String fenString) {
         String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};

        for (int i = 1; i < 9; i++) {
            for (String letter: letters) {
                Piece newPiece = new Piece();
                String key = Integer.toString(i) + letter;
                boardArray.get(key).setPiece();
            }
        }
     }

     private HashMap<String, String> fenHashMap(String fenString) {

     }
}
