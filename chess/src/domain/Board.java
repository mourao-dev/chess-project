package domain;

import domain.enums.Color;
import domain.enums.Notation;

public class Board {

    private Square[][] squares;

    public Board() {
        this.squares = new Square[8][8];
    }

    public void createNullBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new Square(null, i, j, null);
            }
        }
    }

    public void createBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        squares[i][j] = new Square(Color.WHITE, i, j, null);
                    } else {
                        squares[i][j] = new Square(Color.BLACK, i, j, null);
                    }

                } else {
                    if (j % 2 == 0) {
                        squares[i][j] = new Square(Color.BLACK, i, j, null);
                    } else {
                        squares[i][j] = new Square(Color.WHITE, i, j, null);
                    }
                }
            }
        }
    }

    public void initializePieces() {
        squares[0][0].setPiece(new Piece(Color.BLACK, 0, 0, Notation.ROOK));
        squares[0][1].setPiece(new Piece(Color.BLACK, 0, 1, Notation.KNIGHT));
        squares[0][2].setPiece(new Piece(Color.BLACK, 0, 2, Notation.BISHOP));
        squares[0][3].setPiece(new Piece(Color.BLACK, 0, 3, Notation.QUEEN));
        squares[0][4].setPiece(new Piece(Color.BLACK, 0, 4, Notation.KING));
        squares[0][5].setPiece(new Piece(Color.BLACK, 0, 5, Notation.BISHOP));
        squares[0][6].setPiece(new Piece(Color.BLACK, 0, 6, Notation.KNIGHT));
        squares[0][7].setPiece(new Piece(Color.BLACK, 0, 7, Notation.ROOK));

        squares[7][0].setPiece(new Piece(Color.WHITE, 0, 0, Notation.ROOK));
        squares[7][1].setPiece(new Piece(Color.WHITE, 0, 1, Notation.KNIGHT));
        squares[7][2].setPiece(new Piece(Color.WHITE, 0, 2, Notation.BISHOP));
        squares[7][3].setPiece(new Piece(Color.WHITE, 0, 3, Notation.QUEEN));
        squares[7][4].setPiece(new Piece(Color.WHITE, 0, 4, Notation.KING));
        squares[7][5].setPiece(new Piece(Color.WHITE, 0, 5, Notation.BISHOP));
        squares[7][6].setPiece(new Piece(Color.WHITE, 0, 6, Notation.KNIGHT));
        squares[7][7].setPiece(new Piece(Color.WHITE, 0, 7, Notation.ROOK));

        for (int i = 0; i < 8; i++) {
            squares[1][i].setPiece(new Piece(Color.BLACK, 1, i, Notation.POWN));
            squares[6][i].setPiece(new Piece(Color.WHITE, 6, i, Notation.POWN));
        }
    }

    public Piece getPiece(Position position) {
        return squares[position.getColumn()][position.getRow()].piece;
    }

    public boolean isValidPosition(Position position) {
        if (position.getColumn() > 8 || position.getColumn() < 0 || position.getRow() > 8 || position.getRow() < 0) {
            return false;
        }

        return true;
    }

    public boolean positionHasPiece(Position position) {
        if (getPiece(position) == null) {
            return false;
        }
        return true;
    }

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void printBoardWithPieces() {

        for (int i = 0; i < 8; i++) {
            System.out.print("\n");
            for (int j = 0; j < 8; j++) {
                if (squares[i][j].piece == null)
                    System.err.print("[ ]");
                else {
                    if (squares[i][j].piece.getColor() == Color.BLACK) {
                        System.out.print(ANSI_YELLOW + "[" + squares[i][j].piece.getPieceNotation() + "]" + ANSI_RESET);
                    } else {
                        System.out.print("[" + squares[i][j].piece.getPieceNotation() + "]");
                    }
                }

            }
            System.out.print("\n");
        }

    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            System.out.print("\n");
            for (int j = 0; j < 8; j++) {
                if (squares[i][j].getColor() == Color.BLACK) {
                    System.out.print(ANSI_YELLOW + "[" + squares[i][j].getColor() + "]" + ANSI_RESET);
                } else {
                    System.out.print("[" + squares[i][j].getColor() + "]");
                }
            }

        }
        System.out.print("\n");
    }
}
