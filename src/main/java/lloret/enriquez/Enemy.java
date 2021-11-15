package lloret.enriquez;

public class Enemy extends Sprite {
    protected static boolean actualDirection;
    protected static boolean actualDown;

    public Enemy(String type, int x, int y) {
        super(type, x, y, "N", true, false, true);
        actualDirection = true;
        actualDown = false;
    }

    public Enemy(String type, int x, int y, String figure) {
        super(type, x, y, figure, true, false, true);
        actualDirection = true;
        actualDown = false;
    }

    @Override
    public boolean update(Sprite[][] world) {
        if(y + 1 < world[x].length && !actualDown && actualDirection && !collision(world[x][y+1])) {
            move(world, 0,1);
        } else if (y - 1 > 0 && !actualDown && !collision(world[x][y-1])) {
            move(world, 0,-1);
        }
        else {
            actualDirection = actualDirection ? false : true;
        }
        if(actualDown) {
            if (x + 1 < world.length && !collision(world[x+1][y])) {
                move(world, 1,0);
            } else {
                return false;
            }
        }
        return true;
    }

    public void move(Sprite[][] world, int x, int y) {
        int auxX = this.x;
        int auxY = this.y;
        this.x += x;
        this.y += y;
        world[this.x][ this.y] = this;
        world[auxX][auxY] = new Sprite("space", auxX, auxY);
    }
}
