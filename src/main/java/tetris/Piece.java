package tetris;

public class Piece {
    private int x;
    private int y;
    private int [][]shape;
    Piece(int x, int y, int [][]shape){
        this.x = x;
        this.y = y;
        this.shape = shape;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int[][] getShape() {
        return shape;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int width() {
        return this.shape.length;
    }
    public int height() {
        return this.shape[0].length;
    }
}

