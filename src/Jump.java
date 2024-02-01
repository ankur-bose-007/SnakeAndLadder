public class Jump {
    private final int initialPosition;
    private final int finalPosition;

    Jump(int initialPosition, int finalPosition){
        this.initialPosition = initialPosition;
        this.finalPosition = finalPosition;
    }

    public int getInitialPosition() {
        return initialPosition;
    }

    public int getFinalPosition() {
        return finalPosition;
    }
}
