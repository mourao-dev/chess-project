package domain.pieces;

import domain.Piece;
import domain.Position;
import domain.enums.Color;
import domain.enums.Notation;
import domain.pieces.strategies.PawnMoveStrategy;

public class Pawn extends Piece {
    public Pawn(Color color, Position position) {
        super(color, position, Notation.PAWN, new PawnMoveStrategy());
    }

    int numberOfPlays = 0;

    public int getNumberOfPlays() {
        return numberOfPlays;
    }

    public void incrementNumberOfPlays() {
        numberOfPlays++;
    }

}
