package lloret.enriquez;

public class Enemy extends Sprite {
    protected static boolean actualDirection = true;
    protected static boolean actualDown = false;

    public Enemy(String type, int x, int y) {
        super(type, x, y, "N", true, false, true);
    }

    public Enemy(String type, int x, int y, String figure) {
        super(type, x, y, figure, true, false, true);
    }

    @Override
    public boolean update(Sprite[][] world) {
        if( actualDown || y-1 == 1 || y+1 == world[x].length - 2 ){
            moveDown(world);
        }
        else {
            if(actualDirection) {
                moveRight(world);
            }
            else {
                moveLeft(world);
            }
        }
        return true;
    }

    private void moveLeft(Sprite[][] world) {
        world[x][y-1] = this;
        world[x][y] = new Sprite("space", x, y);
        y--;
    }

    private void moveRight(Sprite[][] world) {
        world[x][y+1] = this;
        world[x][y] = new Sprite("space", x, y);
        y++;
    }

    private void moveDown(Sprite[][] world) {
        world[x+1][y] = this;
        world[x][y] = new Sprite("space", x, y);
        x++;
    }

}