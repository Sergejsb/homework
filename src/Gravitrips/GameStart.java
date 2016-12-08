package Gravitrips;


public class GameStart {

    public static void main(String[] args) {
        Game game = new Game();
        GameField gameField = new GameField();
        gameField.fillFieldWithPoints();
        game.startGame();
    }

}
