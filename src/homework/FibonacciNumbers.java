package homework;
//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, i, digitCount;

        System.out.println("Enter the counter for the sequence: ");
        digitCount = inp.nextInt();
        System.out.print(n1 + " " + n2);//printing 0 and 1
        for (i = 3; i <= digitCount; ++i)//loop starts from 3 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
