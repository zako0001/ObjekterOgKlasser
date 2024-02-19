public class BilletautomatDemo {
    public static void main(String[] args) {
        BilletAutomat automat = new BilletAutomat(50);
        automat.indbetal(40);
        automat.printBillet();
    }
}