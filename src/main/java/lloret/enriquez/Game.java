package lloret.enriquez;

public class Game {
    private Board board;

    public Game() {
        board = new Board();
    }

    public void update() {
        board.update();
    }

    public void draw() {
        board.draw();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.update();
        game.draw();
    }
}
