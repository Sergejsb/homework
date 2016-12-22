package Gravitrips;


public class Field {
    private final int COLUMNS = 7;
    private final int ROWS = 6;
    private final String POINTS = ". ";
    private final String[][] gameField = new String[ROWS][COLUMNS];

    public int getCOLUMNS() {
        return COLUMNS;
    }

    public void fillFieldWithPoints() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                gameField[i][j] = POINTS;
            }
        }
    }

    public void showFilledField() {
        String numberToPress = "1 2 3 4 5 6 7";
        System.out.print(numberToPress);
        System.out.println(" ");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(gameField[i][j]);
            }
            System.out.println();
        }

    }

    public void put(Player currentPlayer, int column) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (gameField[i][column].equals(POINTS)) {
                gameField[i][column] = currentPlayer.getTurn().name() + " ";
                break;
            }
        }
    }

    public boolean winner(Player currentPlayer) {
        return (horizontallyCheck(currentPlayer) || verticallyCheck(currentPlayer)) || diagonallyCheck(currentPlayer);
    }

    public boolean horizontallyCheck(Player currentPlayer) {
        for (int row = 0; row < ROWS; row++) {
            if (playerWinHorizontally(currentPlayer, row)) {
                return true;
            }
        }
        return false;
    }

    public boolean playerWinHorizontally(Player currentPlayer, int row) {
        int count = 0;
        for (int column = 0; column < COLUMNS; column++) {
            if (gameField[row][column].equals(currentPlayer.getTurn().name() + " ")) {
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
        for (int column = 0; column < COLUMNS; column++) {
            if (playerWinVertically(currentPlayer, column)) {
                return true;
            }
        }
        return false;
    }

    public boolean playerWinVertically(Player currentPlayer, int column) {
        int count = 0;
        for (int row = 0; row < ROWS; row++) {
            if (gameField[row][column].equals(currentPlayer.getTurn().name() + " ")) {
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
            for (int column = 6; column > 2; column--) {
                if (diagonalRightToLeftDown(currentPlayer, row, column))
                    return true;
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 4; column++) {
                if (diagonalLeftToRightDown(currentPlayer, row, column))
                    return true;
            }
        }
        return false;
    }

    public boolean diagonalLeftToRightDown(Player currentPlayer, int row, int column) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (gameField[row][column].equals(currentPlayer.getTurn().name() + " ")) {
                count++;
                row++;
                column++;
            }
        }
        return count == 4;
    }

    public boolean diagonalRightToLeftDown(Player currentPlayer, int row, int column) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (gameField[row][column].equals(currentPlayer.getTurn().name() + " ")) {
                count++;
                row++;
                column--;
            }
        }
        return count == 4;
    }
}
