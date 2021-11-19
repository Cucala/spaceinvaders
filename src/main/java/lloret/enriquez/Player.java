package lloret.enriquez;

public class Player extends Sprite {
    private String playerName;


    public Player(int x, int y, String figure, boolean canDoHorizontalMove, boolean canDoUpMove, boolean canDoDownMove) {
        super("player", x, y, figure, canDoHorizontalMove, canDoUpMove, canDoDownMove);
    }

    @Override
    public boolean update(Sprite[][] world) {
        return true;
    }

    public void move(Sprite[][] world) {

    }
}
