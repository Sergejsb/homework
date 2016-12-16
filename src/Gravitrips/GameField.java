package Gravitrips;


public class GameField {
    private final int COLUMNS = 7;
    private final int ROWS = 6;
    private final String POINTS = ". ";
    private final Object[][] field = new Object[ROWS][COLUMNS];

    public int getCOLUMNS() {
        return COLUMNS;
    }

    public int getROWS() {
        return ROWS;
    }

    public String getPOINTS() {
        return POINTS;
    }

    public Object[][] getField() {
        return field;
    }

    public void fillFieldWithPoints() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                field[i][j] = POINTS;
            }
        }
    }

    public void showFilledField() {
        String numberToPress = "1 2 3 4 5 6 7";
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
