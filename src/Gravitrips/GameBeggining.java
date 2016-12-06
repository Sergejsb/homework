package Gravitrips;

/**
 * Created by Serjoga on 06/12/2016.
 */

public class GameBeggining {
    private final static GameBeggining gameBeggiding = new GameBeggining();
    private final Player player1 = new HumanPlayer(Turn.H);
    private final Player player2 = new ComputerPlayer(Turn.C);
    private Player currentPlayer = player2;
    private static GameField gameField = new GameField();
    private NextPlayersTurn nextPlayerTurn = new NextPlayersTurn();
    private VictoryCheck victoryCheck = new VictoryCheck();
    private final Game gameCreate = new Game();

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    private void startGame() {
        InputNumber inPutNumber = new InputNumber();
        do {
            gameField.showFilledField();
            currentPlayer = nextPlayerTurn.nextPlayerTurn(currentPlayer, player1, player2);
            System.out.println("\n" + "It's " + currentPlayer + " turn!");
            inPutNumber.saveUserInput(currentPlayer, currentPlayer.makeMove());
        } while (!victoryCheck.winner(currentPlayer));
        if (victoryCheck.winner(currentPlayer)) {
            gameCreate.announceWinner(currentPlayer);
        } else {
            System.out.println("Nobody won! It's draw.");
        }
    }

    public static void main(String[] args) {
        gameField.fillFieldWithPoints();
        gameBeggiding.startGame();
    }

}
