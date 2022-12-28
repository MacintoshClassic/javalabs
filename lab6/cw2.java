class Clothes{
    String item_1 = "pants";
    String item_2 = "t-shirt";
    String brand = "Nike";
    double item_1_price = 45.50;
    double item_2_price = 12.50;

    void method(){
        System.out.println("SOLD OUT :(");
        System.out.println();
    }
}

public class cw2 {
    public static void main(String[] args) {
        Clothes a = new Clothes();
        Clothes b = new Clothes();

        System.out.println("Item: "+a.item_1+
        "\nBrand: "+a.brand+
        "\nPrice"+a.item_1_price);
        a.method();

        System.out.println("Item: "+b.item_2+
        "\nBrand: "+b.brand+
        "\nPrice"+b.item_2_price);
        b.method();
    }
}
