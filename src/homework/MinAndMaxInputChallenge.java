package homework;
/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean isMax = false;
        boolean isMin = false;

        while (true) {
            System.out.println("Enter the number");
            if (in.hasNextInt()) {
                int input = in.nextInt();
                if (input > max || !isMax) {
                    max = input;
                    isMax = true;
                }
                if (input < min || !isMin) {
                    min = input;
                    isMin = true;
                }
            } else {
                System.out.println("Minimum Number = " + min);
                System.out.println("Maximum Number = " + max);
                break;
            }
        }
        in.close();
    }

}

