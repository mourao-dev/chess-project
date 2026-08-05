package domain.enums;

 public enum Notation{
        PAWN("P"),
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
