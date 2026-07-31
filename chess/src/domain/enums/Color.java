package domain.enums;

public enum Color{
        WHITE("white"),
        BLACK("black");

        public String getColor() {
            return color;
        }

        private final String color;

        private Color(String pieceColor) {
            color = pieceColor;
        }

    }
