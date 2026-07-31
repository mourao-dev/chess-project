package domain;

import domain.enums.Color;
import domain.enums.Notation;

public class Board {
    private static final int HEIGHT = 8;
    private static final int WIDTH = 8;

    private Piece[][] pieces;

    public Board() {
        this.pieces = new Piece[HEIGHT][WIDTH];
    }

    public void setInitialBoard() {
        pieces[0][0] = new Piece(Color.BLACK, 0, 0, Notation.ROOK);
        pieces[0][1] = new Piece(Color.BLACK,0, 1,Notation.KNIGHT);
        pieces[0][2] = new Piece(Color.BLACK,0, 2,Notation.BISHOP);
        pieces[0][3] = new Piece(Color.BLACK,0, 3,Notation.QUEEN);
        pieces[0][4] = new Piece(Color.BLACK,0, 4,Notation.KING);
        pieces[0][5] = new Piece(Color.BLACK,0, 5,Notation.BISHOP);
        pieces[0][6] = new Piece(Color.BLACK,0, 6,Notation.KNIGHT);
        pieces[0][7] = new Piece(Color.BLACK, 0, 7, Notation.ROOK);

        pieces[7][0] = new Piece(Color.WHITE, 0, 0, Notation.ROOK);
        pieces[7][1] = new Piece(Color.WHITE,0, 1,Notation.KNIGHT);
        pieces[7][2] = new Piece(Color.WHITE,0, 2,Notation.BISHOP);
        pieces[7][3] = new Piece(Color.WHITE,0, 3,Notation.QUEEN);
        pieces[7][4] = new Piece(Color.WHITE,0, 4,Notation.KING);
        pieces[7][5] = new Piece(Color.WHITE,0, 5,Notation.BISHOP);
        pieces[7][6] = new Piece(Color.WHITE,0, 6,Notation.KNIGHT);
        pieces[7][7] = new Piece(Color.WHITE, 0, 7, Notation.ROOK);
    
        for (int i = 0; i < 8; i++) {
        pieces[1][i] = new Piece(Color.BLACK, 1, i, Notation.POWN);
        pieces[6][i] = new Piece(Color.WHITE, 6, i, Notation.POWN);
    }
}

    public Piece getPiece(Position position) {
        return pieces[position.getColumn()][position.getRow()];
    }

    public boolean isValidPosition(Position position){
        if (position.getColumn() > Board.HEIGHT || position.getColumn() < 0 || position.getRow() > Board.WIDTH || position.getRow() < 0){
            return false;
        }

        return true;
    }

    public boolean positionHasPiece(Position position){
        if (getPiece(position) == null){
            return false;
        }
        return true;
    }
    
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public void printBoard(){

        for (int i = 0; i < 8; i++){
            System.out.print("\n");
            for (int j = 0; j < 8; j++){
                if (pieces[i][j] == null) System.err.print("[ ]");
                else{
                    if (pieces[i][j].getColor() == Color.BLACK){
                    System.out.print(ANSI_YELLOW + "[" + pieces[i][j].getPieceNotation() + "]" + ANSI_RESET);       
                    }
                    else{
                        System.out.print("[" + pieces[i][j].getPieceNotation() + "]");
                    }
                }
                    
            }
            System.out.print("\n");
        }

    }
}


