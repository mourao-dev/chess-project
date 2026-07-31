package domain;

import domain.enums.Color;
import domain.enums.Notation;

public class Piece {

    private final Color color;
    private final Notation notation;
    private Position position;
    
    public Piece(Color color, int row, int column, Notation notation) {
        this.color = color;
        this.position = new Position(row, column);
        this.notation = notation;
    }

    public Color getColor() {
        return color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Notation getPieceName() {
        return notation;
    }

    public String getPieceNotation(){
        return notation.getNotation();
    }
}
