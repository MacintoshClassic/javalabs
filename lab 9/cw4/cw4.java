
class Games {
    String gameTitle;
    int gameLevel;
    int missionNumber;
    int health;

    // constructor 1
    Games(String newgameTitle, int newgameLevel) {
        gameTitle = newgameTitle;
        gameLevel = newgameLevel;
    }

    // constructor 2
    Games(int newmissionNumber, int newHealth) {
        missionNumber = newmissionNumber;
        health = newHealth;
    }

    // method 1
    public static void show1and2() {
        System.out.println("\nGame title and your leve down below:");
    }

    // method 2
    public static void show3and4() {
        System.out.println("\nMission and your health down below:");
    }
}

public class cw4 {
    public static void main(String[] args) {

        // setting the name and game level for the constructor 1
        Games g = new Games("Doom", 12);

        // method 1
        g.show1and2();

        // showing the output from constructor 1
        System.out.println(g.gameTitle);
        System.out.println(g.gameLevel);

        // setting the name and game level for the constructor 2
        Games gs = new Games(23, 100);

        // method 2
        gs.show3and4();

        // showing the output from constructor 2
        System.out.println(gs.missionNumber);
        System.out.println(gs.health);
    }
}
