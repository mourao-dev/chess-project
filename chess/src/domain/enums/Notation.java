package domain.enums;

 public enum Notation{
        POWN("P"),
        ROOK("R"),
        KNIGHT("N"),
        BISHOP("B"),
        KING("K"),
        QUEEN("Q");
        
        public String getNotation(){
            return notation;
        }
        public final String notation;

        private Notation(String pieceNotation) {
           notation = pieceNotation;
        }
    }
