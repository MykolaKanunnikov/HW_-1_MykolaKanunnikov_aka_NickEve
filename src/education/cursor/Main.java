package education.cursor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double x, y, a, w, e, b, X;
        x = 2;
        y = 4;
        a = 6;
        w = 8;
        e = 10;
        b = 12;
        X = 14;

        double result1 = x + y - a / 2 * (x + w);
        double result2 = a * (x + x) / y - a * 3;
        double result3 = a + b / x - y;
        double result4 = X - e / 2 % e + 1;

        double[] resultArray = new double[]{result1, result2, result3, result4};

        System.out.println(Arrays.toString(resultArray));


    }
}
