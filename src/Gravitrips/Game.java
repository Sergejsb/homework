package Gravitrips;


public class Game {

    final int PLAYER_ONE = 1;
    final int PLAYER_TWO = 2;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Field field = new Field();


    public void switchPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public void startGame() {
        chooseOpponent();
        field.fillFieldWithPoints();
        do {
            field.showFilledField();
            switchPlayer();
            System.out.println("It's " + currentPlayer + " turn!");
            field.put(currentPlayer, currentPlayer.makeMove(field));
        } while (!field.winner(currentPlayer));
        if (field.winner(currentPlayer)) {
            field.showFilledField();
            System.out.println("The " + currentPlayer + " has won!");
        } else {
            System.out.println("Nobody won! It's draw.");
        }
    }

    private void chooseOpponent() {
        UserMoveNumber userMove = new UserMoveNumber();
        boolean condition = true;
        int result = 0;
        while (condition) {
            System.out.println("Choose an opponent:\n" + "Enter 1 for human player\n" + "Enter 2 for computer player");
            result = userMove.getUserInput();
            if (result == PLAYER_ONE || result == PLAYER_TWO) {
                condition = false;
            } else {
                System.out.println("Wrong input. Can be 1 or 2");
            }
        }
        if (result == PLAYER_ONE) {
            player1 = new HumanPlayer(Turn.X);
            player2 = new HumanPlayer(Turn.O);
            currentPlayer = player2;
        } else {
            player1 = new HumanPlayer(Turn.X);
            player2 = new ComputerPlayer(Turn.C);
            currentPlayer = player2;
        }
    }
}
