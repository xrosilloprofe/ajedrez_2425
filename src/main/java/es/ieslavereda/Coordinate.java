package es.ieslavereda;

public class Coordinate {
    private char letter;
    private int number;

    public Coordinate(char letter, int number) {
        this.letter = Character.toUpperCase(letter);
        this.number = number;
    }

    public char getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

    //    up() : Obtiene la coordenada superior
    public Coordinate up(){
        return new Coordinate(letter,number-1);
    }
    //    down() : Obtiene la coordenada inferior
    public Coordinate down(){
        return new Coordinate(letter,number+1);
    }
    //    left() : Obtiene la coordenada a la izquierda
    public Coordinate left(){
        return new Coordinate((char)((int)letter-1),number);
    }
    //    right() : Obtiene la coordenada a la derecha
    public Coordinate right(){
        return new Coordinate((char)((int)letter+1),number);
    }
    //    diagonalUpLeft() : Obtiene la coodenada superior izquierda
    public Coordinate diagonalUpLeft(){
        return this.up().left();
    }
    //    diagonalUpRight() : Obtiene la coodenada superior derecha
    public Coordinate diagonalUpRight(){
        return this.up().right();
    }
    //    diagonalDownLeft() : Obtiene la coodenada inferior izquierda
    public Coordinate diagonalDownLeft(){
        return this.down().left();
    }
    //    diagonalDownRight() : Obtiene la coodenada inferior derecha
    public Coordinate diagonalDownRight(){
        return this.down().right();
    }

    @Override
    public String toString() {
        return "(" + letter + "," + number + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Coordinate)) return false;
        Coordinate c = (Coordinate) obj;
        return c.letter == letter && c.number == number;
    }
}