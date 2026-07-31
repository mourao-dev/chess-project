package domain;

import domain.enums.Color;

public class Square {

    private Position position;
    private Piece piece;
    private final Color color;


    public Square(int row, int column, Piece piece, Color color) {
        this.position.setRow(row);
        this.position.setColumn(column);
        this.piece = piece;
        this.color = color;
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
