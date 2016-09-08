import java.util.Scanner;

/**
 * Created by scott_000 on 9/6/2016.
 */
public class Chapter3_3_2 {
    public static void main(String[] args) {
        //Enter 2 numbers. Prompt user for answer.
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

        //Enter 3 numbers. Prompt user for answer.
        number1 = (int)(System.currentTimeMillis() % 10);
        number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() % 10);

        Scanner input2 = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "?");
        int answer2 = input.nextInt();

        System.out.print(number1 + " + " + number2 + " + " + number3 + " = " + answer2 + " is " + (number1 + number2 + number3 == answer2));



    }

}
