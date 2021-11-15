package lloret.enriquez;

public class Board {
    private Sprite[][] world;
    private Enemy[] enemies;
    private Bullet[] bullets;
    private Player player;

    public Board() {
        world = new Sprite[10][20];
        createBoard();
    }

    private void createBoard() {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                if (i == world.length-1) {
                    world[i][j] = new Sprite("board", i, j, "-");
                }
                else if (i == 0) {
                    world[i][j] = new Sprite("board",i, j, "-");
                } else if (j == 0) {
                    world[i][j] = new Sprite("board",i, j, "|");
                }
                else if (j == world[i].length-1) {
                    world[i][j] = new Sprite("board",i, j, "|");
                }
                else {
                    if (i ==1 && j >= 9 && j <= 10) {
                        world[i][j] = addEnemies(2, i, j);
                    }
                    /*else if (i >= 2 && i <= 2 && j > 2 && j < world[i].length - 3 && j != 9 && j != 10) {
                        world[i][j] = addEnemies(1, i, j);
                    }
                    else if (i >= 3 && i <= 4 && j > 2 && j < world[i].length - 3 && j != 9 && j != 10) {
                        world[i][j] = addEnemies(0, i, j);
                    }*/
                    else {
                        world[i][j] = new Sprite("space", i, j);
                    }
                }
            }
        }
    }

    private Sprite addEnemies(int type, int i , int j) {
        switch (type) {
            case 1:
                return new Enemy("powerful", i, j, "P");
            case 2:
                return new Enemy("boss", i, j, "B");
            default:
                return new Enemy("normal", i, j);
        }
    }

    public void update() {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                world[i][j].update(world);
            }
        }
    }

    public void draw() {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                world[i][j].draw();
            }
            System.out.println();
        }
    }
}
