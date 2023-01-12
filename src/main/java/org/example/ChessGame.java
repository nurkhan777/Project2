package org.example;

public class ChessGame {
    public void chessGaming(ChessPlayer chessPlayer1, ChessPlayer chessPlayer2) {
        if (chessPlayer1.getAvgStats() > chessPlayer2.getAvgStats()) {
            System.out.println(chessPlayer1.getName() + " winner!");
        }
        else if (chessPlayer1.getAvgStats() < chessPlayer2.getAvgStats()) {
            System.out.println(chessPlayer2.getName() + " winner!");
        }
        else {
            System.out.println("Draw!");
        }
    }
}
