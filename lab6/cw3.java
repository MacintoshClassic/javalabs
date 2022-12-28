
class Movies{
    String movie_a = "Fast and furious";
    String movie_b = "Shrek";
    int movie_a_part = 9;
    int movie_b_part = 2;
    double price_in_the_cinema_for_both = 43.77;

    void method(){
        System.out.println("You have already watched this movie!");
        System.out.println();
    }
}

public class cw3 {
    public static void main(String[] args) {
        Movies a = new Movies();
        Movies b = new Movies();

        System.out.println("Movie name: "+a.movie_a+
        "\nPart: "+a.movie_a_part+
        "\nSummary price along with the movie "+b.movie_b+
        " = "+a.price_in_the_cinema_for_both);
        a.method();
        
        System.out.println("Movie name: "+b.movie_b+
        "\nPart: "+b.movie_b_part+
        "\nSummary price along with the movie "+a.movie_a+
        " = "+b.price_in_the_cinema_for_both);
        b.method();

    }
}