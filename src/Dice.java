public class Dice {
    private final int numberOfDice;
    Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public int roll(){
        int max = numberOfDice * 6, min = numberOfDice;
        return (int)((Math.random() * (max - min)) + min);
    }
}
