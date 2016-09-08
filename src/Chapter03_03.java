import java.util.Scanner;

/**
 * Created by scott_000 on 9/6/2016.
 */
public class Chapter03_03 {
        public static void main(String[] args) {
            Scanner numbers = new Scanner(System.in);
            //Gather information from user
            System.out.print("Enter six numbers: ");
            int aa = numbers.nextInt();
            int bb = numbers.nextInt();
            int cc = numbers.nextInt();
            int dd = numbers.nextInt();
            int ee = numbers.nextInt();
            int ff = numbers.nextInt();

            //Solve for x
            int xx = ((ee * dd) - (bb * ff)) / ((aa * dd) - (bb * cc));
            System.out.print("X = " + xx);

            //Solve for y
            int yy = ((aa * ff) - (ee * cc)) / ((aa * dd) - (bb * cc));
            System.out.println("\nY = " + yy);




           // System.out.print("You chose: " + aa + bb + cc + dd + ee + ff);


        }


}
