package Gravitrips;

/**
 * Created by Serjoga on 06/12/2016.
 */
public class Game {
    GameField gameField = new GameField();

    public void announceWinner(Player player) {
        gameField.showFilledField();
        System.out.println("The " + player + " has won!");
    }

}
