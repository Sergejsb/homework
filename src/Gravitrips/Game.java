package Gravitrips;


public class Game {

    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private GameField gameField = new GameField();


    public void announceWinner() {

        System.out.println("The " + currentPlayer + " has won!");
    }

    public Player nextPlayerTurn() {
        if (currentPlayer == player1)
            return player2;
        if (currentPlayer == player2)
            return player1;
        return null;
    }

    public void startGame() {
        UserMoveNumber userMove = new UserMoveNumber();
        VictoryCheck victoryCheck = new VictoryCheck();
        chooseOpponent();
        gameField.fillFieldWithPoints();
        do {
            gameField.showFilledField();
            currentPlayer = nextPlayerTurn();
            System.out.println("\n" + "It's " + currentPlayer + " turn!");
            userMove.saveUserInput(currentPlayer, currentPlayer.makeMove(gameField), gameField);
        } while (!victoryCheck.winner(currentPlayer, gameField));
        if (victoryCheck.winner(currentPlayer, gameField)) {
            gameField.showFilledField();
            announceWinner();
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
            if (result == 1 || result == 2) {
                condition = false;
            } else {
                System.out.println("Wrong input. Can be 1 or 2");
            }
        }
        if(result == 1) {
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
