package tetris;

public class Piece {
    private int x;
    private int y;
    private int [][]shape;
    private String color;
    private String[] colors = {"#0341ae", "#ffd500", "#72cb3b"};

    Piece(int x, int y, int j, int i){
        this.x = x;
        this.y = y;

        switch (j){ // 1 representa espaço ocupado por peça e 0 espaço livre
            case 0: shape = new int[][]{{1, 1, 0}, {0, 1, 1}};
            case 1: shape = new int[][]{{0, 0, 0, 1}, {1, 1, 1, 1}};
            case 2: shape = new int[][]{{1, 1}, {1, 1}};
            case 3: shape = new int[][]{{0, 1, 1}, {1, 1, 0}};
            case 4: shape = new int[][]{{1, 1, 1, 1}};
            case 5: shape = new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1}};
            case 6: shape = new int[][]{{0, 1, 0}, {1, 1, 1}};
        }
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


