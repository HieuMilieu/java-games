package org.mayukh.games.boardgames;

/**
 * Created by mayukh42 on 4/26/2016.
 * https://github.com/mayukh42/java-games
 */
public class RunGame {

    public static void main(String[] args) {
        // playSnakesLadders();
        // playLudo();
        playMinesweeper();
    }

    private static void playMinesweeper () {
        Game game = new Minesweeper(6, 5);
        game.build();
        game.draw();
        game.play();
    }

    private static void playSnakesLadders () {
        Game game = new SnakesLadders();
        game.build();
        game.draw();
        game.play();
    }

    private static void playLudo () {
        Game game = new Ludo();
        game.build();
        game.draw();
        game.play();
    }
}
