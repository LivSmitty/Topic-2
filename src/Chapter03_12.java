import java.util.Scanner;

/**
 * Created by scott_000 on 9/7/2016.
 */
public class Chapter03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 3 digit number: ");
        String s = input.nextLine();

        int low = 0;

        int high = s.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
            isPalindrome = false;
            break;

        }
        low++;
        high--;

    }
        if (isPalindrome)
            System.out.println(s +" is palindrome");
        else
                System.out.println(s +" is not a palindrome");
    }
}
