
class car {
    public String brand;
}

public class cw1 {
    public static void main (String[] args) {

        ClasaGeneric<car> c = new ClasaGeneric<car>(new car());
        ClasaGeneric<Integer> i = new ClasaGeneric<Integer>(2022);
        ClasaGeneric<String> s = new ClasaGeneric<String>("Garage");

        System.out.println("ClasaGeneric Car: " + c.returnElement());
        System.out.println("ClasaGeneric Integer: " + i.returnElement());
        System.out.println("ClasaGeneric String: " + s.returnElement());

    }

}
