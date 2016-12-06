package Gravitrips;

/**
 * Created by Serjoga on 06/12/2016.
 */

public class GameField {
    final static int COLUMNS = 7;
    final static int ROWS = 6;
    final static String POINTS = ". ";
    final static Object[][] field = new Object[ROWS][COLUMNS];

    public void fillFieldWithPoints() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                field[i][j] = POINTS;
            }
        }
    }

    public void showFilledField() {
        String numberToPress = "1 " + "2 " + "3 " + "4 " + "5 " + "6 " + "7 ";
        System.out.print(numberToPress);
        System.out.println(" ");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }

    }

}
