package Gravitrips;


public class HumanPlayer implements Player {
    private Turn turn;


    @Override
    public Turn getTurn() {

        return turn;
    }

    public HumanPlayer(Turn turn) {
        this.turn = turn;
    }

    @Override
    public int makeMove() {
        InputNumber inputNumber = new InputNumber();
        int input;
        while (true) {

            input = inputNumber.getUserInput();
            if ((input <= 0) || (input > GameField.COLUMNS + 1)) {
                System.out.println("The input number is incorrect. Try again!");
            } else {
                System.out.println("The player H made his move.");
                return input - 1;
            }
        }
    }

    @Override
    public String toString() {

        return turn.name();
    }
}

