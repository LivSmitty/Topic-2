import java.util.Scanner;

/**
 * Created by scott_000 on 9/9/2016.
 */
public class Chapter03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Get weight and price on package 1
        System.out.println("Enter weight and price for Package 1: ");
        int packageOneWeight = input.nextInt();
        int packageOnePrice = input.nextInt();

        //Get weight and price on package 2
        System.out.println("Enter weight and price for Package 2: ");
        int packageTwoWeight = input.nextInt();
        int packageTwoPrice = input.nextInt();

        //Determine better price
        int valuePackageOne = (packageOneWeight / packageOnePrice);
        int valuePackageTwo = (packageTwoWeight / packageTwoPrice);

        if (valuePackageOne > valuePackageTwo)
            System.out.println("Package 2 has a better price.");
        else if (valuePackageOne < valuePackageTwo)
            System.out.println("Package 1 has a better price.");
        else  //(valuePackageOne == valuePackageTwo);
            System.out.println("Package 1 and 2 have the same price.");


    }
}
