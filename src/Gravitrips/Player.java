package Gravitrips;


public abstract class Player {

    abstract Turn getTurn();

    abstract int makeMove(Field gameField);
}

