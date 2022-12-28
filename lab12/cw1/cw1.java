
abstract class Passenger {
}

class Passenger_1 extends Passenger {
    public void show_info(String name, String surname, String country_to_visit, double ticket_price) {
        System.out.println("Info:\n" + "Name: " + name + "\nSurname: " + surname + "\nTicket price: " +
                ticket_price + "\nCountry to visit: " + country_to_visit + "\n");
    }

    public void add_trip(String country) {
        System.out.println("Your trip to " + country + " has beed added\n");
    }

    public void reserve_trip(String country) {
        System.out.println("Your trip to " + country + " has been reserved\n");
    }
}

public class cw1 {
    public static void main(String[] args) {
        Passenger_1 p1 = new Passenger_1();
        p1.show_info("Alex", "Vance", "Belgium", 350.0);
        p1.add_trip("Italy");
        p1.reserve_trip("Israel");
    }
}