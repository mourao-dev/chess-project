package domain;

import domain.enums.Color;

public class Square {

    private Position position;
    public Piece piece;
    private final Color color;


    public Square(Color color, int row, int column, Piece piece) {
        this.color = color;
        this.position = new Position(row, column);
        this.piece = piece;
    }

    public boolean isEmpty(){
        if (piece == null) return false;
        return true;
    }

    public Position getPosition() {
        return position;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Color getColor() {
        return color;
    }

}
