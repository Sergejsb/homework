package Gravitrips;


public class VictoryCheck {

    public boolean winner(Player currentPlayer, GameField gameField) {
        return (horizontallyCheck(currentPlayer, gameField) || verticallyCheck(currentPlayer, gameField)) || diagonallyCheck(currentPlayer, gameField);
    }

    public boolean horizontallyCheck(Player currentPlayer, GameField gameField) {
        for (int row = 0; row < gameField.getROWS(); row++) {
            if (playerWinHorizontally(currentPlayer, row, gameField)) {
                return true;
            }
        }
        return false;
    }

    public boolean playerWinHorizontally(Player currentPlayer, int row, GameField gameField) {
        int count = 0;
        for (int column = 0; column < gameField.getCOLUMNS(); column++) {
            if (gameField.getField()[row][column].equals(currentPlayer.getTurn().name() + " ")) {
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

    public boolean verticallyCheck(Player currentPlayer, GameField gameField) {
        for (int column = 0; column < gameField.getCOLUMNS(); column++) {
            if (playerWinVertically(currentPlayer, column, gameField)) {
                return true;
            }
        }
        return false;
    }

    public boolean playerWinVertically(Player currentPlayer, int column, GameField gameField) {
        int count = 0;
        for (int row = 0; row < gameField.getROWS(); row++) {
            if (gameField.getField()[row][column].equals(currentPlayer.getTurn().name() + " ")) {
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

    public boolean diagonallyCheck(Player currentPlayer, GameField gameField) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 4; column++) {
                if (diagonalRightToLeft(currentPlayer, row, column, gameField))
                    return true;
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int column = 6; column < 2; column--) {
                if (diagonalLeftToRight(currentPlayer, row, column, gameField))
                    return true;
            }
        }
        return false;
    }

    public boolean diagonalRightToLeft(Player currentPlayer, int row, int column, GameField gameField) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (gameField.getField()[row][column] == currentPlayer) {
                count++;
            }
            row++;
            column++;
        }
        return count == 4;
    }

    public boolean diagonalLeftToRight(Player currentPlayer, int row, int column, GameField gameField) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (gameField.getField()[row][column] == currentPlayer) {
                count++;
            }
            row++;
            column++;
        }
        return count == 4;
    }
}