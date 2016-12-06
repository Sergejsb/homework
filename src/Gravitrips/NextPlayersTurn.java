package Gravitrips;

/**
 * Created by Serjoga on 06/12/2016.
 */

public class NextPlayersTurn {

    public Player nextPlayerTurn(Player currentPlayer, Player player1, Player player2) {
        if (currentPlayer == player1)
            return player2;
        if (currentPlayer == player2)
            return player1;
        return null;
    }
}

