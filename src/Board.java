import java.util.*;

public class Board {
    private final Queue<Player> players;
    private final int size;
    private final Map<Integer, Integer> snakesAndLadders;

    private final Dice dice;

    public Board(List<Player> players, int size, List<Jump> snakes, List<Jump> ladders, int sizeOfDice) {
        this.players = new LinkedList<>(players);
        this.size = size;
        this.snakesAndLadders = new HashMap<>();
        for(Jump snake: snakes)
            snakesAndLadders.put(snake.getInitialPosition(), snake.getFinalPosition());
        for(Jump ladder: ladders)
            snakesAndLadders.put(ladder.getInitialPosition(), ladder.getFinalPosition());
        this.dice = new Dice(sizeOfDice);
    }

    public void startGame(){
        System.out.println("Game has started");

        while(players.size() > 1){
            Player player = players.poll();

            System.out.println(player + " rolling dice");

            int nextPosition = dice.roll() + player.getCurrentPosition();

            if(nextPosition == this.size)
                System.out.println(player + " has won");
            else if(nextPosition > this.size)
                this.players.offer(player);
            else {
                if(snakesAndLadders.containsKey(nextPosition)){
                    if(snakesAndLadders.get(nextPosition) > nextPosition)
                        System.out.println(player + " got a ladder");
                    else
                        System.out.println(player + " was bitten by a snake");
                    nextPosition = snakesAndLadders.get(nextPosition);
                }

                player.setCurrentPosition(nextPosition);
                this.players.offer(player);
            }
        }
    }
}
