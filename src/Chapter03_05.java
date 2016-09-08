import java.util.Scanner;

/**
 * Created by scott_000 on 9/7/2016.
 */
public class Chapter03_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int s = input.nextInt();
        String dayOfWeek = new String();

        if (s == 0)
            dayOfWeek = "Sunday";
            //System.out.println()
        else if (s == 1)
            dayOfWeek = "Monday";
        else if (s == 2)
            dayOfWeek = "Tuesday";
        else if (s == 3)
            dayOfWeek = "Wednesday";
        else if (s == 4)
            dayOfWeek = "Thursday";
        else if (s == 5)
            dayOfWeek = "Friday";
        else if (s == 6)
            dayOfWeek = "Saturday";


        //Get elapsed days from user
        //Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of days elapsed since today: ");
        int n = input.nextInt();
        String elapsedDays = new String();

        n = n + s;

        if (n == 0)
            elapsedDays = "Sunday";
        else if (n == 1)
            elapsedDays = "Monday";
        else if (n == 2)
            elapsedDays = "Tuesday";
        else if (n == 3)
            elapsedDays = "Wednesday";
        else if (n == 4)
            elapsedDays = "Thursday";
        else if (n == 5)
            elapsedDays = "Friday";
        else if (n == 6)
            elapsedDays = "Saturday";

        System.out.println("Today is " + dayOfWeek + " and the future day is " + elapsedDays);




    }
}
