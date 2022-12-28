class Phonenumbers{
    long first_number = 122343765567901l;
    int second_number = 765567901;
    String first_number_country = "US";
    String second_number_country = "PL";
    String phone_type = "Mobile";

    void method(){
        System.out.println("CONNECTION . . . . . please wait");
        System.out.println();
    }
}

public class cw1 {
    public static void main(String[] args) {
        Phonenumbers a = new Phonenumbers();
        Phonenumbers b = new Phonenumbers();

        System.out.println("The phone: "+a.first_number+
        "\nThe country code: "+a.first_number_country+
        "\nThe phone type: "+a.phone_type);
        a.method();

        System.out.println("The phone: "+b.second_number+
        "\nThe country code: "+b.second_number_country+
        "\nThe phone type: "+b.phone_type);
        b.method();
    }
}
