import java.util.Scanner;

/**
 * Created by scott_000 on 9/11/2016.
 */
public class TestQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation1 = new QuadraticEquation();

        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter variable for 'a': ");
        double a = numbers.nextInt();
        System.out.println("Enter variable for 'b' ");
        double b = numbers.nextInt();
        System.out.println("Enter variable for 'c': ");
        double c = numbers.nextInt();


        quadraticEquation1.getA(a);
        quadraticEquation1.getB(b);
        quadraticEquation1.getC(c);
        quadraticEquation1.getDiscriminant(a, b, c);
        quadraticEquation1.getRoot1();
        quadraticEquation1.getRoot2();


        //FIX WHAT IT PRINTS OUT!!!!
        if (quadraticEquation1.discriminant > 0) {
            quadraticEquation1.getRoot1();
            quadraticEquation1.getRoot2();
            System.out.println("Root 1: " + quadraticEquation1.root1);
            System.out.println("Root 2: " + quadraticEquation1.root2);
        }else if (quadraticEquation1.discriminant < 0) {
            System.out.println("The equation has no roots.");
        }else if (quadraticEquation1.discriminant == 0) {
            System.out.println("Root 1: " + quadraticEquation1.root1);

        }


    }


}

