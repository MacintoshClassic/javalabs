
class Basketball {

    String team1name;
    String team2name;

    int team1points;
    int team2points;

    // constructor 1
    Basketball(String newteam1name, String newteam2name) {
        team1name = newteam1name;
        team2name = newteam2name;
    }

    // constructor 2
    Basketball(int newteam1points, int newteam2points) {
        team1points = newteam1points;
        team2points = newteam2points;
    }

    // method 1
    public static void teams() {
        System.out.println("\nThe teams:");
    }

    // method 2
    public static void points() {
        System.out.println("\n 1st teams' point VS the 2nd teams' point:");
    }
}

public class cw6 {
    public static void main(String[] args) {

        // setting parameters for constructor 1
        Basketball t = new Basketball("Chiacago Bulls", "Lakers");

        // method 1
        t.teams();

        // showing the output from constructor 1
        System.out.println(t.team1name);
        System.out.println(t.team2name);

        // setting parameters for constructor 2
        Basketball p = new Basketball(10, 12);

        // method 2
        p.points();

        // showing the output from constructor 2
        System.out.println(p.team1points);
        System.out.println(p.team2points);
    }
}
