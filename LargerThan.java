package chapterFour;

import java.util.Scanner;
public class LargerThan {

    public static void main(String[] args) {

        Scanner scam = new Scanner (System.in);
       int num = 0;
        int j;

        int max = 0;
        int min = 0;

//        int largestNumber = 0;
//        int smallestNumber = 0;
        for (j = 1; j <= 10; j++) {
            num = scam.nextInt();


        }
            if (max > num)
                num = max;


            if (min < num)
                num = min;


        System.out.println("Smallest Number:" + min);
        System.out.println("Largest Number:" + max);
    }

}
