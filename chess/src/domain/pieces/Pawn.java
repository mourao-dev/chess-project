package domain.pieces;

import domain.Board;
import domain.Piece;
import domain.Position;
import domain.enums.Color;
import domain.enums.Notation;

public class Pawn extends Piece {
    public Pawn(Color color, Position position, Board board) {
        super(color, position, Notation.PAWN, board);
    }

    int numberOfPlays = 0;
    int squaresMoves = 0;

    public int getNumberOfPlays() {
        return numberOfPlays;
    }

    public void incrementNumberOfPlays() {
        numberOfPlays++;
    }

    @Override
    public boolean canMove(Position goal) {
        if (color.getColor() == Color.BLACK.getColor()) {
            if (numberOfPlays == 0) {
                if (squaresMoves == 1) {
                    if (position.getColumn() == goal.getColumn() && position.getRow() + 1 == goal.getRow()
                            && board.getSquares()[goal.getRow()][goal.getColumn()].isEmpty()) {
                        return true;
                    }
                } 
                if (squaresMoves == 2) {
                    if (position.getColumn() == goal.getColumn() && position.getRow() + 2 == goal.getRow()
                            && board.getSquares()[goal.getRow()][goal.getColumn()].isEmpty()
                            && board.getSquares()[goal.getRow() - 1][goal.getColumn()].isEmpty()) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

}
