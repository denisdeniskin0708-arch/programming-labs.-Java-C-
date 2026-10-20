package lab2;

import java.util.Scanner;

public class ConsoleInput {
    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            scanner.next();
            System.out.println("Error: enter integer value.");
        }
    }

    public static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (Double.isFinite(value)) {
                    return value;
                }
                System.out.println("Error: enter a finite real number.");
                continue;
            }
            scanner.next();
            System.out.println("Error: enter real number.");
        }
    }
}
