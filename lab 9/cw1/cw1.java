
class Calculator {
    double num1;
    double num2;

    // method +
    void plus() {
        System.out.println(num1 + num2);
    }

    // method -
    void minus() {
        System.out.println(num1 - num2);
    }

    // method /
    void deviding() {
        System.out.println(num1 / num2);
    }

    // method *
    void multiply() {
        System.out.println(num1 * num2);
    }

    // constructor
    Calculator(double newNum1, double newNum2) {
        num1 = newNum1;
        num2 = newNum2;
    }
}

public class cw1 {
    public static void main(String[] args) {

        // setting parameters for the constructor
        Calculator c = new Calculator(100.0, 200.0);

        // showing all of the methods
        c.plus();
        c.minus();
        c.deviding();
        c.multiply();
    }
}
