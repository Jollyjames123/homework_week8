package homework;
/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

import java.util.Scanner;

public class Pr12PrimeNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int number = inp.nextInt();
        inp.close();


        boolean value = false;
        if (number == 0 || number == 1) {
            System.out.println("This is not a prime number");
        } else {

            for (int i = 2; i <= number / 2; ++i) {
                // condition for non-prime number
                if (number % i == 0) {
                    value = true;
                    break;
                }
            }

            if (!value)
                System.out.println(number + " is a prime number.");
            else
                System.out.println(number + " is not a prime number.");

        }
    }

}
