package homework;
//10. Write a program to input any number and check if it Armstrong number or not

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, originalNumber, remainder, result = 0;
        System.out.println("Enter the number: ");
        number = inp.nextInt();
        String s = String.valueOf(number);
        int length = s.length();
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, length);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number + " is not an Armstrong number");
    }

}

