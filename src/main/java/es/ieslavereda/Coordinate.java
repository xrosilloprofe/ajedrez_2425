package es.ieslavereda;

public class Coordinate {

    private char letter;
    private int number;

    public Coordinate(char letter, int number) {
        this.letter = Character.toUpperCase(letter);
        this.number = number;
    }

    public Coordinate up() {
        return new Coordinate(letter, number - 1);
    }

    public Coordinate down() {
        return new Coordinate(letter, number + 1);
    }

    public Coordinate left() {
        return new Coordinate((char) (letter - 1), number);
    }

    public Coordinate right() {
        return new Coordinate((char) (letter + 1), number);
    }

    public char getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;

        if(! (obj instanceof Coordinate)) return false;

        Coordinate c = (Coordinate) obj;
        return c.letter==this.letter && c.number==this.number;
    }

    @Override
    public String toString() {
        return "(" + letter + "," + number + ")";
    }
}
