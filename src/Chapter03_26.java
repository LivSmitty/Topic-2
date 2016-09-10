import java.util.Scanner;

/**
 * Created by scott_000 on 9/9/2016.
 */
public class Chapter03_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        //find answers
        boolean answerOne = (number % 5 == 0 && number % 6 == 0);
        boolean answerTwo = (number % 5 == 0 || number % 6 == 0);
        boolean answerThree = (number % 5 == 0 ^ number % 6 == 0);

       //print answers
        System.out.println("Is "+ number + " divisible by 5 and 6? " + answerOne);
        System.out.println("Is " + number + " divisible by 5 or 6? " + answerTwo);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + answerThree);

    }
}
