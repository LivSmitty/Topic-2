import java.util.Scanner;

/**
 * Created by scott_000 on 9/8/2016.
 */
public class Chapter03_17 {
    public static void main(String[] args) {
        //prompt user choice
        Scanner input = new Scanner(System.in);
        System.out.print("scissors(0), rock (1), paper(2): ");
        int userChoice = input.nextInt();

        //get user choice
        int computerChoice = (int) (Math.random() * 3);
        //System.out.println("The computer chose " + computerChoice);


        //determine winner

        if (userChoice == 0) {//user chose scissors
            if (computerChoice == 0)
                System.out.println("The computer is scissors. You are scissors too. It is a draw.");
            else if (computerChoice == 1)
                System.out.println("The computer is rock. You are scissors. You lost.");
            else if (computerChoice == 2)
                System.out.println("The computer is paper. You are rock. You won.");
        }
        if (userChoice == 1) { //If user chose rock
            if (computerChoice == 0)
                System.out.println("The computer is scissors. You are rock. You won.");
            else if (computerChoice == 1)
                System.out.println("The computer is rock. You are rock too. It is a draw.");
            else if (computerChoice == 2)
                System.out.println("The computer is paper. You are rock. You lost.");
        }
        if (userChoice == 2) { //If user chose paper
            if (computerChoice == 0)
                System.out.println("The computer is scissors. You are paper. You lost.");
            else if (computerChoice == 1)
                System.out.println("The computer is rock. You are paper. You won.");
            else if (computerChoice == 2)
                System.out.println("The computer is paper. You are paper too. It is a draw.");
        }
    }
}