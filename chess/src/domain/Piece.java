package domain;

import domain.enums.Color;
import domain.enums.Notation;
import domain.pieces.strategies.MoveStrategy;

public abstract class Piece {

    protected final Color color;
    protected final Notation notation;
    protected Position position;
    protected MoveStrategy moveStrategy;
    
    public Piece(Color color, Position position, Notation notation, MoveStrategy moveStrategy) {
        this.color = color;
        this.position = position;
        this.notation = notation;
        this.moveStrategy = moveStrategy;
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

    public void moveTo(Position goal) {
        if (moveStrategy.canMove(goal)) {
            this.position = goal;
        }
    }
}
