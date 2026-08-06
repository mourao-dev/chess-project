package domain;

import domain.enums.Color;
import domain.enums.Notation;

public abstract class Piece {

    protected final Color color;
    protected final Notation notation;
    protected Position position;    
    public Piece(Color color, Position position, Notation notation) {
        this.color = color;
        this.position = position;
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

    public String getPieceNotation(){
        return notation.getNotation();
    }

    public abstract boolean canMove(Position goal);

    public void moveTo(Position goal){
        if (canMove(goal)){
        this.position = goal;
        }
    }
}
