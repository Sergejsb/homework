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
    public int makeMove(GameField gameField) {
        Random random = new Random();
        int computerInput = random.nextInt(gameField.getCOLUMNS());
        System.out.println("Computer made his move.");
        return computerInput;
    }

    @Override
    public String toString() {

        return turn.name();
    }
}
