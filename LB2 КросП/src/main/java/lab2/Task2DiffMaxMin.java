package lab2;

import java.util.Scanner;

public class Task2DiffMaxMin {
    public static void run(Scanner scanner) {
        double a = ConsoleInput.readDouble(scanner, "Enter first number (a): ");
        double b = ConsoleInput.readDouble(scanner, "Enter second number (b): ");

        double diff;
        if (a >= b) {
            diff = a - b;
        } else {
            diff = b - a;
        }

        System.out.println("Difference between larger and smaller = " + diff);
    }
}
