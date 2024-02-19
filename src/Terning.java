import java.util.Random;

public class Terning {

    // Attributes
    final int MAX = 6;
    int faceValue;
    Random rnd;

    // Constructor
    public Terning() {
        rnd = new Random();
        roll();
    }

    // Method
    public void roll() {
        faceValue = rnd.nextInt(MAX) + 1;
    }
}