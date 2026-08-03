import domain.Board;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Chess");

        Board board = new Board();
        board.createBoard();
        board.printBoard();
        board.initializePieces();
        board.printBoardWithPieces();
        
    }
}
