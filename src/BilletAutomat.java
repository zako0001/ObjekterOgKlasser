public class BilletAutomat {

    // Attributes
    private int pris;
    private int saldo;
    private int total;

    // Constructor
    public BilletAutomat(int billetpris) {
        pris = billetpris;
        saldo = 0;
        total = 0;
    }

    // Getters
    public int getPris() {
        return pris;
    }
    public int getSaldo() {
        return saldo;
    }

    // Incrementer method
    public void indbetal(int kroner) {
        if (kroner > 0) {
            saldo += kroner;
        }
        else {
            System.out.println("Indsæt positivt beløb.");
        }
    }

    // Other methods
    public void printBillet() {
        if (saldo >= pris) {
            total += saldo;
            saldo = 0;
            // Billetten "printes" herunder
            System.out.println("########################");
            System.out.println("### Linje F(antasi) ###");
            System.out.println("########################");
            System.out.println("## Billet: " + pris + " kr. ##");
            System.out.println();
        }
        else {
            System.out.println("Indsæt venligst manglende " + (pris - saldo) + " kr. før billet kan printes.");
        }
    }
}
