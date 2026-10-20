package lab2;

import java.util.Scanner;

public class Task1AddFive {
    public static void run(Scanner scanner) {
        double x = ConsoleInput.readDouble(scanner, "Enter x: ");
        if (x < 5) {
            double y = x + 5;
            System.out.println("y = " + y);
        } else {
            System.out.println("Condition x < 5 is not satisfied.");
        }
    }
}