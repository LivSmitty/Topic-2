import java.util.Scanner;

/**
 * Created by scott_000 on 9/11/2016.
 */
public class QuadraticEquation {
    double a = 0;
    double b = 0;
    double c = 0;
    double discriminant;
    double root1;
    double root2;
    //public boolean isPositive = false;


    QuadraticEquation(){

    }

    public double getA(double a) {
        a = a;
        return a;

    }

    public double getB(double b) {
        b = b;
        return b;
    }

    public double getC(double c) {
        c = c;
        return c;
    }

    double getDiscriminant(double a, double b, double c) {
        discriminant = ((b * b) - 4 * (a * c));
        return discriminant;

    }

    double getRoot1() {
        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            return root1;
        } else {
            return 0;
        }
    }

    double getRoot2() {
        if (discriminant > 0) {
            root2 = (-b - Math.sqrt( b*b - 4*a*c ) )/ (2*a);
            return root2;
        }else{
            return 0;
        }
    }

}
