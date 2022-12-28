class Painting{
    String title;
    String author;
    int year;
    String technique;
    double price;

    void method(){
        System.out.println("Title: "+title+
        "\nAuthor: "+author+"\nYear: "+
        year+"\nTechnique: "+technique+"\nPrice: "+price+"\n");
    }
}

public class cw6 {
    public static void main(String[] args) {
        Painting a = new Painting();
        a.title = "Mona Lisa";
        a.author = "Leonardo Da Vinci";
        a.year = 1519;
        a.technique = "sfumato";
        a.price = 1000000;
        a.method();

        Painting b = new Painting();
        b.title = "Girl with a Pearl Earring";
        b.author = "Johannes Vermeer";
        b.year = 1665;
        b.technique = "camera obscura";
        b.price = 7700000;
        b.method();
    }
}