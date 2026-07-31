import domain.Board;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Chess");

        //creating board

        Board board = new Board();
        board.setInitialBoard();
        board.printBoard();
        
    }
}
