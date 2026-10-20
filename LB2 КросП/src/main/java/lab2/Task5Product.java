package lab2;

import java.util.Scanner;

public class Task5Product {
    public static void run(Scanner scanner) {
        int n = ConsoleInput.readInt(scanner, "Enter n (1..20): ");

        if (n < 1 || n > 20) {
            System.out.println("Error: n must be in range 1..20 (for n > 20 long overflow occurs, and start is 1).");
            return;
        }

        long product = 1L;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }

        System.out.println("Product of numbers from 1 to " + n + " = " + product);
    }
}
