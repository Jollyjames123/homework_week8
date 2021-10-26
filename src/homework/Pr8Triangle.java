package homework;
/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class Pr8Triangle {

    public static void main(String[] args) {

        int row = 5;


        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}