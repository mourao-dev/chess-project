package test;

import org.junit.Assert;
import org.junit.Test;

import domain.Board;
import domain.Position;

public class BoardTest {
    @Test
    
    public void shouldReturnTrueForValidPosition(){
        Board board = new Board();
        Position position = new Position(0, 0);

        boolean result = board.isValidPosition(position);

        Assert.assertTrue(result);

    }

}
