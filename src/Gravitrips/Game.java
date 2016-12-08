package Gravitrips;


public class Game {

    private Player player1;
    private Player player2;
    private Player currentPlayer;


    public void announceWinner(Player player) {
        GameField gameField = new GameField();
        gameField.showFilledField();
        System.out.println("The " + player + " has won!");
    }

    public Player nextPlayerTurn(Player currentPlayer, Player player1, Player player2) {
        if (currentPlayer == player1)
            return player2;
        if (currentPlayer == player2)
            return player1;
        return null;
    }

    public void startGame() {
        InputNumber inPutNumber = new InputNumber();
        GameField gameField = new GameField();
        VictoryCheck victoryCheck = new VictoryCheck();
        chooseOpponent();
        final Game gameCreate = new Game();
        do {
            gameField.showFilledField();
            currentPlayer = nextPlayerTurn(currentPlayer, player1, player2);
            System.out.println("\n" + "It's " + currentPlayer + " turn!");
            inPutNumber.saveUserInput(currentPlayer, currentPlayer.makeMove());
        } while (!victoryCheck.winner(currentPlayer));
        if (victoryCheck.winner(currentPlayer)) {
            gameCreate.announceWinner(currentPlayer);
        } else {
            System.out.println("Nobody won! It's draw.");
        }
    }

    private void chooseOpponent() {
        InputNumber input = new InputNumber();
        boolean condition = true;
        int result = 0;
        while (condition) {
            System.out.println("Choose an opponent\n" + "Enter 1 for human player\n" + "Enter 2 for computer player");
            result = input.getUserInput();
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
