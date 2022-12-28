class Cookie{
    String name;
    double weight;
    String components;

    void method(){
        System.out.println("Name: "+name+
        "\nWeight: "+weight+"\nComponents: "+
        components+"\n");
    }
}

public class cw5 {
    public static void main(String[] args) {
        Cookie a = new Cookie();

        a.name = "Oat bars";
        a.weight = 0.23;
        a.components = "dough, oat, milk, butter";
        a.method();

        Cookie b = new Cookie();
        b.name = "Chocolate night";
        b.weight = 0.31;
        b.components = "dough, chocolate, milk, peanut butter";
        b.method();
    }
}