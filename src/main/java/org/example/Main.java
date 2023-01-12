package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sprinter sprinter1 = new Sprinter("Usein Bolt", 35, 73.5, 188.7, 45.5, 40);
        Sprinter sprinter2 = new Sprinter("Gvozd", 30, 80, 150, 41, 23);
        Sprinter sprinter3 = new Sprinter("Samorez", 25, 60, 177.1, 43.5, 31);

        ChessPlayer chessPlayer = new ChessPlayer("Magnus Karlsen", 32, 80, 178.4, 200, 2859);
        ChessPlayer chessPlayer2 = new ChessPlayer("Yan", 35, 65, 177, 200, 2777);

        System.out.println(sprinter1); //toString
        System.out.println(chessPlayer); //toString

        sprinter1.sayAboutMe(); //Interface method
        sprinter1.sayAboutMeAgain(); //Abstract method
        chessPlayer.sayAboutMe(); //Interface method
        chessPlayer.sayAboutMeAgain(); //Abstract method

        ChessGame game1 = new ChessGame(); //Chess game object
        game1.chessGaming(chessPlayer, chessPlayer2); //Gaming method

        Olimpiada run1 = new Olimpiada(); //Olimpiada object
        ArrayList<Sprinter> sprinters = new ArrayList<>(); //Array list object
        sprinters.add(sprinter1);
        sprinters.add(sprinter2);
        sprinters.add(sprinter3);
        run1.run(sprinters); //Run method
    }
}