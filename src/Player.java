public class Player {

    private static int idCounter = 1;
    private final int id;

    private final String name;

    private int currentPosition;

    public Player(String name){
        idCounter+=1;
        id = idCounter;

        this.name = name;
        this.currentPosition = 0;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

}
