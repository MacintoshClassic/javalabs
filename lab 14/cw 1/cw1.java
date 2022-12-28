import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cw1 extends JFrame implements ActionListener {
    JTextField input;
    JTextField input2;
    JTextField input3;
    JButton btn = new JButton("Count");
    JLabel result;

    public cw1() {
        super("Mediana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setLocation(300, 300);
        setLayout(new FlowLayout());
        input = new JTextField(15);
        add(input);

        input2 = new JTextField(15);
        add(input2);

        input3 = new JTextField(15);
        add(input3);

        add(new JLabel("="));
        result = new JLabel(" ");
        add(result);
        add(btn);
        btn.addActionListener((ActionListener) this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            String num = input.getText();
            String num2 = input2.getText();
            String num3 = input3.getText();

            int n = Integer.parseInt(num);
            int n2 = Integer.parseInt(num2);
            int n3 = Integer.parseInt(num3);

            int m = (n + n2 + n3) / 3;
            String w = String.valueOf(m);
            result.setText(w);
        }
    }
}