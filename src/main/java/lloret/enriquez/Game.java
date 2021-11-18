
package lloret.enriquez;

public class Game {
    private Board board;

    public Game() {
        board = new Board();
    }

    public boolean update() {
        if (!board.update()) {
            return false;
        }
        return true;
    }

    public void draw() {
        board.draw();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.draw();
        int cont = 10;
        while (game.update() && cont > 0) {
            game.draw();
            cont--;
        }
    }
}
