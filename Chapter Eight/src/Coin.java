public class Coin {
    private int faceUp;

    public int flipCoin() {
        faceUp = (int) (Math.random() * 2);
        return faceUp;
    }

    public int showFace() {
        return faceUp;
    }

    public String toString() {
        if (faceUp == 0) {
            return "The coin is face up.";
        } else {
            return "The coin is face down.";
        }
    }
}
