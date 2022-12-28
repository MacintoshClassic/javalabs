import java.util.Random;

class Matrix {
    int width;
    int length;
    int arr[][] = new int[width][length];

    // constructor
    Matrix(int newWidth, int newLength) {
        width = newWidth;
        length = newLength;
    }

    // method
    void func() {
        Random los = new Random();
        arr = new int[width][length];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = los.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void multiply() {
        int res = arr[width - 1][length - 1] * 5;
        System.out.println(res);
    }

}

public class cw3 {
    public static void main(String[] args) {
        Matrix m = new Matrix(5, 5);

        m.func();
        m.multiply();
    }
}
