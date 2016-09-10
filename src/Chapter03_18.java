import java.util.Scanner;

/**
 * Created by scott_000 on 9/9/2016.
 */
public class Chapter03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter package weight: ");
        double weight = input.nextInt();
        double shippingCost = 0;

        //Determine shipping cost
        if (weight <= 1)
            shippingCost = 3.5;
            //System.out.println("The cost to ship is " + shippingCost);
        else if (weight <= 3)
            shippingCost = 5.5;
            //System.out.println("The cost to ship is " + shippingCost);
        else if (weight <= 10)
            shippingCost = 8.5;
            //System.out.println("The cost to ship is " + shippingCost);
        else if (weight <= 20)
            shippingCost = 10.5;


        //Print shipping cost
        if (weight > 50)
                System.out.println("The package cannot be shipped.");
        else
            System.out.println("The cost to ship is: " + shippingCost);



    }
}
