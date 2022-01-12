package tetris;

public class Player {
    private int level;
    private int score;
    private int emptyLines;

    public Player(int level, int score){
        this.level = level;
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

}
