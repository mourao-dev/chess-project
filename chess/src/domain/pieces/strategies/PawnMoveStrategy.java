package domain.pieces.strategies;

import domain.Position;

public class PawnMoveStrategy implements MoveStrategy {

    @Override
    public boolean canMove(Position goal){
        //pawn move
        return true;
    }

}
