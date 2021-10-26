package homework;

/**
 * 4. Write a class with the name Main. The class needs to have a main method.
 * TEST EXAMPLE
 * → TEST CODE: Write below code in main method
 * Carpet carpet = new Carpet(3.5);
 * Floor floor = new Floor(2.75, 4.0);
 * Calculator calculator = new Calculator(floor, carpet);
 * System.out.println("total= " + calculator.getTotalCost());
 * carpet = new Carpet(1.5);
 * floor = new Floor(5.4, 4.5);
 * calculator = new Calculator(floor, carpet);
 * System.out.println("total= " + calculator.getTotalCost());
 * → OUTPUT
 * total= 38.5
 * total= 36.45
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 4 classes.
 */
public class Pr17Main {

    public static void main(String[] args) {
        Pr17Carpet carpet = new Pr17Carpet(3.5);
        Pr17Floor floor = new Pr17Floor(2.75, 4.0);
        Pr17Calculator calculator = new Pr17Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Pr17Carpet(1.5);
        floor = new Pr17Floor(5.4, 4.5);
        calculator = new Pr17Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
