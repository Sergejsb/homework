package Gravitrips;


import java.util.Random;

public class ComputerPlayer implements Player {
    private Turn turn;

    public ComputerPlayer(Turn turn) {

        this.turn = turn;
    }

    @Override
    public Turn getTurn() {

        return this.turn;
    }

    @Override
    public int makeMove() {
        Random random = new Random();
        int computerInput = random.nextInt(GameField.COLUMNS);
        System.out.println("Computer made his move." + "\n");
        return computerInput;
    }

    @Override
    public String toString() {

        return turn.name();
    }
}
