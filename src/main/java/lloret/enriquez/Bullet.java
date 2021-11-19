package lloret.enriquez;

public class Bullet extends Sprite {
    public Bullet(int x , int y) {
        super("bullet", x, y,"^",false,true,false);
    }

    @Override
    public boolean update(Sprite[][] world) {
        return true;
    }

    public void move(Sprite[][] world) {
        if(x > 0) {
            world[x-1][y] = this;
        }
    }
}
