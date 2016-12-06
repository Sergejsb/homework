package Gravitrips;

/**
 * Created by Serjoga on 06/12/2016.
 */

public class VictoryCheck {

    public boolean winner(Player currentPlayer) {
        return (horizontallyCheck(currentPlayer) || verticallyCheck(currentPlayer)) || diagonallyCheck(currentPlayer);
    }

    public boolean horizontallyCheck(Player currentPlayer) {
        for (int row = 0; row < GameField.ROWS; row++) {
            if (playerWinHorizontally(currentPlayer, row)) {
                return true;
            }
        }
        return false;
    }

    public boolean playerWinHorizontally(Player currentPlayer, int row) {
        int count = 0;
        for (int column = 0; column < GameField.COLUMNS; column++) {
            if (GameField.field[row][column].equals(currentPlayer.getTurn().name() + " ")) {
                count++;
            } else {
                count = 0;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    public boolean verticallyCheck(Player currentPlayer) {
        for (int column = 0; column < GameField.COLUMNS; column++) {
            if (playerWinVertically(currentPlayer, column)) {
                return true;
            }
        }
        return false;
    }

    public boolean playerWinVertically(Player currentPlayer, int column) {
        int count = 0;
        for (int row = 0; row < GameField.ROWS; row++) {
            if (GameField.field[row][column].equals(currentPlayer.getTurn().name() + " ")) {
                count++;
            } else {
                count = 0;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    public boolean diagonallyCheck(Player currentPlayer) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 4; column++) {
                if (diagonalRightToLeft(currentPlayer, row, column))
                    return true;
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int column = 6; column < 2; column--) {
                if (diagonalLeftToRight(currentPlayer, row, column))
                    return true;
            }
        }
        return false;
    }

    public boolean diagonalRightToLeft(Player currentPlayer, int row, int column) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (GameField.field[row][column] == currentPlayer) {
                count++;
            }
            row++;
            column++;
        }
        if (count == 4) {
            return true;
        }
        return false;
    }

    public boolean diagonalLeftToRight(Player currentPlayer, int row, int column) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (GameField.field[row][column] == currentPlayer) {
                count++;
            }
            row++;
            column++;
        }
        if (count == 4) {
            return true;
        }
        return false;
    }
}