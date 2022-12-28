
class NewYorkTimes {
    public int sold;
    public double date;
    public String topStory;

    NewYorkTimes(int sold, double date, String topStory) {
        this.sold = sold;
        this.date = date;
        this.topStory = topStory;
    }

    void data() {
        System.out.println(
                "\nNEW YORK TIMES \nThe amount of the sold copies: " + sold + "\nAccording to the date: " + date
                        + "\nThe top story: "
                        + topStory);
    }
}

class TheTimes extends NewYorkTimes {
    TheTimes() {
        super(312, 12.07, "Olympic games 2035");
    }

    void nextStep() {
        System.out.println(
                "\nTHE TIMES \nThe amount of the sold copies: " + sold + "\nAccording to the date: " + date
                        + "\nThe top story: "
                        + topStory);
    }
}

public class cw1 {
    public static void main(String[] args) {

        NewYorkTimes ns = new NewYorkTimes(317, 12.07, "The President election");

        TheTimes no = new TheTimes();

        ns.data();

        no.nextStep();
    }
}
