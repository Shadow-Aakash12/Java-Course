import Models.Game;

public class App {

    public static void main(String[] args) {
        

        Game game = new Game();

        game.gameName = "God of War";

        game.genre = "Hack & Slash, Action, Fantasy";

        game.setDevName("Santa Monica");

        game.releaseYear = 2000;

        game.price = 100;

        game.getProdNumber(97899);
    }
}