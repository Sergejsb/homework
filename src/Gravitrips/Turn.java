package Gravitrips;

/**
 * Created by Serjoga on 06/12/2016.
 */

public enum Turn {

    H("H"), C("C");
    private String symbol;

    private Turn(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

}

