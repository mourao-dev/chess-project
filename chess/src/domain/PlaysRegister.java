package domain;

import java.util.HashMap;
import java.util.Stack;

public class PlaysRegister {
    private String row;
    private String column;

    final int[] rows = { 1, 2, 3, 4, 5, 6, 7, 8 };
    final HashMap<Integer, String> columns = new HashMap<>() {
        {
            put(0, "H");
            put(1, "G");
            put(2, "F");
            put(3, "E");
            put(4, "D");
            put(5, "C");
            put(6, "B");
            put(7, "A");
        }
    };

    private Stack<PlaysRegister> playerHistory = new Stack<>();

    public PlaysRegister(String row, String column) {
        this.row = row;
        this.column = column;
    }

    public void addPlay(Position position) {
        PlaysRegister play = new PlaysRegister(String.valueOf((position.getRow() + 1)),
                columns.get(position.getColumn()));
        playerHistory.push(play);
    }

    public String getRow() {
        return row;
    }

    public String getColumn() {
        return column;
    }

}
