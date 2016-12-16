package Gravitrips;


public interface Player {

    Turn getTurn();

    int makeMove(GameField gameField);
}

