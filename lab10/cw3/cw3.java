
class ApartmentComplex1 {
    public String complexName;
    public int peopleAmount;
    public double electricityPaycheck;
    public double waterPaycheck;

    ApartmentComplex1(String complexName, int peopleAmount, double electricityPaycheck, double waterPaycheck) {
        this.complexName = complexName;
        this.peopleAmount = peopleAmount;
        this.electricityPaycheck = electricityPaycheck;
        this.waterPaycheck = waterPaycheck;
    }

    void showData() {
        System.out.println("\nApartment complex name: " + complexName + "\namount of people: " + peopleAmount
                + "\npaycheck for electricity: " + electricityPaycheck + "\npaycheck for water: " + waterPaycheck);
    }
}

class ApartmentComplex2 extends ApartmentComplex1 {
    ApartmentComplex2() {
        super("Zoliborz West", 135, 12000.0, 14700.0);
    }

    void showInfo() {
        System.out.println("\nApartment complex name: " + complexName + "\namount of people: " + peopleAmount
                + "\npaycheck for electricity: " + electricityPaycheck + "\npaycheck for water: " + waterPaycheck);
    }
}

public class cw3 {
    public static void main(String[] args) {
        ApartmentComplex1 apartmets1 = new ApartmentComplex1("Zoliborz East", 230, 20000, 21500);
        apartmets1.showData();

        ApartmentComplex2 apaetments2 = new ApartmentComplex2();
        apaetments2.showInfo();
    }
}
