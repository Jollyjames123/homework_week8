package homework;
/**
 * 15. Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

import java.util.Scanner;

public class Pr15Triangle {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of rows : ");
        int n = in.nextInt();
        in.close();

        for (int i = 0; i < n; i++) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
