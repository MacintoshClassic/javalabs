
class Currency {
    double eur;
    double usd;
    double pln;

    // method 1 (usd to eur)
    void usd_to_eur() {
        System.out.println(usd / 1.06);
    }

    // metnod 2 (pln to usd)
    void pln_to_usd() {
        System.out.println(pln * 0.23);
    }

    // method 3 (eur to pln)
    void eur_to_pln() {
        System.out.println(eur * 4.65);
    }

    // constructor 1 (eur, usd)
    Currency(double newEUR, double newUSD) {
        eur = newEUR;
        usd = newUSD;
    }

    // constructor 2 (pln)
    Currency(double newPLN) {
        pln = newPLN;
    }
}

public class cw2 {
    public static void main(String[] args) {

        // setting the parameters for the constructor
        Currency eur_and_usd = new Currency(1, 1);
        Currency pln_1 = new Currency(1);

        // results of exchange
        eur_and_usd.usd_to_eur();
        pln_1.pln_to_usd();
        eur_and_usd.eur_to_pln();

    }
}
