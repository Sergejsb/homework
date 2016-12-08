package Gravitrips;


import java.util.Scanner;

public class InputNumber {

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public void saveUserInput(Player currentPlayer, int column) {
        for (int i = GameField.ROWS - 1; i >= 0; i--) {
            if (GameField.field[i][column] == GameField.POINTS) {
                GameField.field[i][column] = currentPlayer + " ";
                break;
            }
        }
    }
}


