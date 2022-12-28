
class RossmanDE {
    public int income;
    public int amountOfShops;
    public String topSellingItem;

    RossmanDE(int income, int amountOfShops, String topSellingItem) {
        this.income = income;
        this.amountOfShops = amountOfShops;
        this.topSellingItem = topSellingItem;
    }

    void showInfo() {
        System.out.println("\nROSSMAN GERMANY" + "\nannual income = " + income + "\namount of shops = " + amountOfShops
                + "\ntop selling item = " + topSellingItem);
    }
}

class RossmanPL extends RossmanDE {

    RossmanPL() {
        super(100000000, 434, "Shower Gel Palmolive");
    }

    void showData() {
        System.out.println("\nROSSMAN POLAND" + "\nannual income = " + income + "\namount of shops = " + amountOfShops
                + "\ntop selling item = " + topSellingItem);
    }
}

public class cw2 {
    public static void main(String[] args) {
        RossmanDE rDE = new RossmanDE(300000000, 735, "Shampoo Syoss");
        rDE.showInfo();

        RossmanPL rPL = new RossmanPL();
        rPL.showData();
    }
}
