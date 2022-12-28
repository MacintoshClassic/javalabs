
class CosmeticsBags {
    String item1;
    String item2;
    String item3;

    // constructor 1
    CosmeticsBags(String newItem1, String newItem2) {
        item1 = newItem1;
        item2 = newItem2;
    }

    // constructor 2
    CosmeticsBags(String newItem3) {
        item3 = newItem3;
    }

    // method 1
    public static void insideBag1() {
        System.out.println("\nHere is what inside the 1st cosmetics bag:");
    }

    // method 2
    public static void insideBag2() {
        System.out.println("\nHere is what inside the 2nd cosmetics bag:");
    }
}

public class cw5 {
    public static void main(String[] args) {

        // setting parameters for constructor 1
        CosmeticsBags cb = new CosmeticsBags("Scissors", "Lipstick");

        // method 1
        cb.insideBag1();

        // showing the output from constructor 1
        System.out.println(cb.item1);
        System.out.println(cb.item2);

        // setting parameters for constructor 2
        CosmeticsBags cb2 = new CosmeticsBags("Mirror");

        // method 2
        cb2.insideBag2();

        // showing the output from constructor 2
        System.out.println(cb2.item3);
    }
}
