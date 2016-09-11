import java.util.Scanner;

/**
 * Created by scott_000 on 9/10/2016.
 */
public class TestStopWatch {
    public static void main(String[] args) {

        //Create stopwatch
        StopWatch stopWatch1 = new StopWatch();

        //Pull startTimer method
        stopWatch1.startTimer();

        //Prompt user to end timer
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to end timer: ");
        int x = input.nextInt();

        //Pull stopTimer method and print elapsed time.
        stopWatch1.stopTimer();
        System.out.println("The elapsed time is: " + stopWatch1.getElapsedTime() + " milliseconds.");



    }
}
