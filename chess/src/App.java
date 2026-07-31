import domain.Board;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Chess");

        Board board = new Board();
        board.createBoard();
        board.initializePieces();
        board.printBoard();
        
    }
}
