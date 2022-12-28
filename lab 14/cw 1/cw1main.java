import java.awt.EventQueue;

public class cw1main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cw1();
            }
        });
    }
}