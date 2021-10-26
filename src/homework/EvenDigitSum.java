package homework;
/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

import java.util.Scanner;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {

        // declare variables
        int lastDigit = 0;
        int sumOfEvenDigit = 0;

        if (number < 0) {
            System.out.println("Invalid value as the entered number is negative");
            return -1;
        } else {
            // loop to repeat the process
            while (number != 0) {

                // find last digit
                lastDigit = number % 10;

                // check last digit even?
                if (lastDigit % 2 == 0) {  // add it to sum
                    sumOfEvenDigit = sumOfEvenDigit + lastDigit;
                }


                number /= 10;
            }

            // return sum value
            return sumOfEvenDigit;
        }
    }

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(123456789));

    }
}
