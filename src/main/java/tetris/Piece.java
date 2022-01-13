package tetris;

public class Piece {
    private int x;
    private int y;
    private int [][]shape;
    private String color;
    private String azul = "#0341ae";
    private String amarelo = "#ffd500";
    private String verde = "#72cb3b";
    private String[] colors = {"#0341ae", "#ffd500", "#72cb3b"};
    public enum Colors{
        azul, amarelo, verde;
    }
    Piece(int x, int y, int [][]shape, int i){
        this.x = x;
        this.y = y;
        this.shape = shape;
        this.color = colors[i];
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

