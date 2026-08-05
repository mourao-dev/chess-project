package domain.pieces.strategies;

import domain.Position;

public interface MoveStrategy {
    public boolean canMove(Position goal);
}
