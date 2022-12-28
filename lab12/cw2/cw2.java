abstract class Exchange {
}

class Kantor extends Exchange {
    public static void to_usd(double pln, double cad, double eur) {
        System.out.println(pln + " pln to usd = " + "$" + pln * 0.23);
        System.out.println(cad + " cad to usd = " + "$" + pln * 0.79);
        System.out.println(eur + " eur to usd = " + "$" + pln * 1.03);
    }

    public static void operation(double pln, double cad, double eur) {
        double zloty = pln;
        double canadian_dollar = cad;
        double euro = eur;
        System.out.println("\nYour another given amounts of money have been saved:\n"
                + zloty + " zl, " + canadian_dollar + " cad, " + euro + " eur");
    }
}

public class cw2 {
    public static void main(String[] args) {
        Kantor k = new Kantor();
        k.to_usd(1, 1, 1);
        k.operation(1, 1, 1);
    }
}
