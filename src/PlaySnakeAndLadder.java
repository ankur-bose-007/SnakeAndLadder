import java.util.ArrayList;
import java.util.List;

public class PlaySnakeAndLadder {
    public static void main(String[] args) {
        Player player1 = new Player("Ankit");
        Player player2 = new Player("Rahul");
        Player player3 = new Player("Vinit");
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        List<Jump> snakes = new ArrayList<>();
        Jump snake1 = new Jump(65, 4);
        Jump snake2 = new Jump(89, 17);
        Jump snake3 = new Jump(91, 33);
        Jump snake4 = new Jump(70, 25);
        Jump snake5 = new Jump(97, 47);

        snakes.add(snake1);
        snakes.add(snake2);
        snakes.add(snake3);
        snakes.add(snake4);
        snakes.add(snake5);

        List<Jump> ladders = new ArrayList<>();
        Jump ladder1 = new Jump(5, 40);
        Jump ladder2 = new Jump(19, 64);
        Jump ladder3 = new Jump(31, 76);
        Jump ladder4 = new Jump(42, 53);
        Jump ladder5 = new Jump(77, 98);

        ladders.add(ladder1);
        ladders.add(ladder2);
        ladders.add(ladder3);
        ladders.add(ladder4);
        ladders.add(ladder5);


        Board board = new Board(players, 100, snakes, ladders, 2);
        board.startGame();
    }
}