package Gravitrips;


import java.util.Scanner;

public class UserMoveNumber {

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public void saveUserInput(Player currentPlayer, int column, GameField gameField) {
        for (int i = gameField.getROWS() - 1; i >= 0; i--) {
            if (gameField.getField()[i][column] == gameField.getPOINTS()) {
                gameField.getField()[i][column] = currentPlayer + " ";
                break;
            }
        }
    }
}


