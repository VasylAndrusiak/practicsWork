package sample;
import java.lang.Math;
import java.util.Scanner;

public class Model {
    Scanner scan = new Scanner(System.in);
    private int g = 3, a = 11;
    private double r = 4.21, q = 89.52;
    private double y = Math.pow((6 + a), 1 / 3);
    private double x = scan.nextDouble();;   // argument;
    private double d = r * 2;
    private double v = ((double) ((double) x * g) + a);
    public double getD() {
        return d;
    }

    public int getG() {
        return g;
    }

    public int getA() {
        return g;
    }

    public double getR() {
        return r;
    }

    public double getQ() {
        return q;
    }

    public double getV() {
        return v;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
