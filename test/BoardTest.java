package test;

import org.junit.Assert;
import org.junit.Test;

import domain.Board;
import domain.Piece;
import domain.Position;
import domain.enums.Color;
import domain.enums.Notation;

public class BoardTest {
    @Test

    public void shouldReturnTrueForValidPosition() {
        Board board = new Board();
        Position position = new Position(0, 0);

        boolean result = board.isValidPosition(position);

        Assert.assertTrue(result);

    }

    @Test
    public void shouldReturnFalseForPositionBiggerThanBoard() {
        Board board = new Board();
        Position position = new Position(1, 9);
        boolean result = board.isValidPosition(position);

        Assert.assertFalse(result);

    }

    @Test
    public void shouldReturnFalseForNegativeRow() {
        Board board = new Board();
        Position position = new Position(-1, 0);
        boolean result = board.isValidPosition(position);

        Assert.assertFalse(result);

    }

    @Test
    public void shouldReturnFalseForNegativeColumn() {
        Board board = new Board();
        Position position = new Position(5, -2);
        boolean result = board.isValidPosition(position);

        Assert.assertFalse(result);

    }

    @Test
    public void shouldReturnTrueForExisistingPiece(){
        Board board = new Board();
        board.createBoard();
        Piece piece = new Piece(Color.BLACK, 0, 0, Notation.ROOK);
        board.addPiece(piece);

        boolean result = board.positionHasPiece(piece.getPosition());

        Assert.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForSquareWithoutPiece(){
        Board board = new Board();
        Position position = new Position(0, 1);
        board.createBoard();

        boolean result = board.positionHasPiece(position);

        Assert.assertFalse(result);
    }
}
