package lloret.enriquez;

public class Board {
    private Sprite[][] world;
    private Player player;
    private static boolean direction = true;

    public Board() {
        world = new Sprite[10][20];
        createBoard();
    }

    private void createBoard() {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                if (i == 0 || i == world.length - 1) {
                    world[i][j] = new Sprite("board", i, j, "-");
                }
                else if (j == 0 || j == world[i].length - 1) {
                    world[i][j] = new Sprite("board",i, j, "|");
                }
                else {
                    if (i ==1 && j >= 9 && j <= 10) {
                        world[i][j] = addEnemies(2, i, j);
                    }
                    else if (i >= 2 && i <= 2 && j > 2 && j < world[i].length - 3 && j != 9 && j != 10) {
                        world[i][j] = addEnemies(1, i, j);
                    }
                    else if (i >= 3 && i <= 4 && j > 2 && j < world[i].length - 3 && j != 9 && j != 10) {
                        world[i][j] = addEnemies(0, i, j);
                    }
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

    public boolean update() {
        if(direction){
            for (int i = world.length - 2; i > 1; i--) {
                for (int j = world[i].length - 2; j > 1 ; j--) {
                    if(!world[i][j].update(world, direction)) {
                        return false;
                    }
                    if(j == 1) {
                        direction = direction ? false : true;
                    }
                }
            }
        }
        else {
            for (int i = 1; i < world.length - 2; i++) {
                for (int j = 1; j < world[i].length - 2 ; j++) {
                    if(!world[i][j].update(world, direction)) {
                        return false;
                    }
                    if(j == world[i].length - 2) {
                        direction = direction ? false : true;
                    }
                }
            }
        }
        return true;
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
