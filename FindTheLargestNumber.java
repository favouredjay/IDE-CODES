package chapterFour;

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int values =0;
int largestUnit = 1;
System.out.println("Enter sales Person's unit");
        values = input.nextInt();
        for (int counter = 0; counter <= 10; counter++) {
            System.out.println("Enter sales Person's unit");
            values = input.nextInt();
            if (values > largestUnit)
                largestUnit = values;


        }
        System.out.println("Largest Unit is " + largestUnit);
        }
}
