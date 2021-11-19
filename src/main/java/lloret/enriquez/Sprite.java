package lloret.enriquez;

public class Sprite {
    protected boolean canDoHorizontalMove, canDoUpMove, canDoDownMove;
    protected String figure;
    protected int x, y;
    private String type;

    public Sprite(String type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.figure = " ";
        this.canDoHorizontalMove = false;
        this.canDoUpMove = false;
        this.canDoDownMove = false;
    }

    public Sprite(String type, int x, int y, String figure) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.figure = figure;
        this.canDoHorizontalMove = false;
        this.canDoUpMove = false;
        this.canDoDownMove = false;
    }

    public Sprite (String type, int x, int y, String figure, boolean canDoHorizontalMove, boolean canDoUpMove, boolean canDoDownMove) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.figure = figure;
        this.canDoHorizontalMove = canDoHorizontalMove;
        this.canDoUpMove = canDoUpMove;
        this.canDoDownMove = canDoDownMove;
    }

    public boolean collision(Sprite a) {
        return false;
    }

    public boolean update(Sprite[][] world) { return true; }

    public void draw() {
        System.out.print(figure);
    }

    public String getType() {
        return type;
    }

}
