/**
 * Created by scott_000 on 9/7/2016.
 */
public class Chapter03_04 {
    public static void main(String[] args) {
        int intMonth;

        //generate random number between 1 and 12

        intMonth = (int)(Math.random() * 12);
        intMonth = intMonth + 1;

        System.out.println(intMonth);

        if (intMonth == 1)
            System.out.println("The month is January.");
        else if (intMonth == 2)
            System.out.println("The month is February.");
        else if (intMonth == 3)
            System.out.println("The month is March.");
        else if (intMonth == 4)
            System.out.println("The month is April.");
        else if (intMonth == 5)
            System.out.println("The month is May.");
        else if (intMonth == 6)
            System.out.println("The month is June.");
        else if (intMonth == 7)
            System.out.println("The month is July.");
        else if (intMonth == 8)
            System.out.println("The month is August.");
        else if (intMonth == 9)
            System.out.println("The month is September.");
        else if (intMonth == 10)
            System.out.println("The month is October.");
        else if (intMonth == 11)
            System.out.println("The month is November.");
        else if (intMonth == 12)
           System.out.println("The month is December.");



    }
}


