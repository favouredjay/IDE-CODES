package chapterFour;
import java.util.Scanner;
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = input.nextLine();

        int low = 0;
        int high = s.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
               isPalindrome = false;
            break;

        }

            if (isPalindrome) {
                System.out.println(s + " is a palindrome");
            }
            else System.out.println(s + " is not a palindrome");

    }
}
