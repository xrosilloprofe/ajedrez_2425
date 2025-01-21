package es.ieslavereda;

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Cell {
    private Coordinate coordinate;
    private Board board;
    private Piece piece;
    private Color originalColor;
    private Color color;

    public Cell(Board board, Coordinate coordinate) {
        this.coordinate = coordinate;
        this.board = board;
        this.color = ((coordinate.getNumber()+(int)coordinate.getLetter())%2==0?Color.WHITE:Color.BLACK);
        this.originalColor=color;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
    public Board getBoard() {
        return board;
    }
    public Piece getPiece() {
        return piece;
    }
    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    public Color getColor() {
        return color;
    }

    public boolean isEmpty(){
        return (piece==null);
    }

    @Override
    public String toString(){
        if (isEmpty()){
            return colorize("   ",color.getColor());
        } else {
            return colorize(" ",color.getColor())+piece.toString()+colorize(" ",color.getColor());
        }
    }

    public enum Color {
        WHITE(Attribute.BACK_COLOR(180,180,180)),
        BLACK(Attribute.BACK_COLOR(100,100,100)),
        HIGHLIGHT_KILL_WHITE(Attribute.BACK_COLOR(180,0,0)),
        HIGHLIGHT_KILL_BLACK(Attribute.BACK_COLOR(130,0,0)),
        HIGHLIGHT_WHITE(Attribute.BACK_COLOR(180,180,0)),
        HIGHLIGHT_BLACK(Attribute.BACK_COLOR(130,130,0));

        private Attribute color;

        Color(Attribute color){
            this.color=color;
        }

        public Attribute getColor() {
            return color;
        }
    }
}
