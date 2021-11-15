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
        if(a.getType().compareTo("board") == 0){
            return true;
        }
        else if(a.getType().compareTo("powerful") == 0) {
            return true;
        }
        else if(a.getType().compareTo("normal") == 0) {
            return true;
        }
        else if(a.getType().compareTo("boss") == 0) {
            return true;
        }
        else if(a.getType().compareTo("space") == 0) {
            return false;
        }
        else if(a.getType().compareTo("player") == 0) {
            return false;
        }

        return false;
    }

    public boolean update(Sprite[][] world) {
        return false;
    }

    public void draw() {
        System.out.print(figure);
    }

    public String getType() {
        return type;
    }

}
