package lab2;

import java.util.Scanner;

public class Task6InputUntilMinusOne {
    public static void run(Scanner scanner) {
        System.out.println("Enter integers (-1 to stop):");
        while (true) {
            int value = ConsoleInput.readInt(scanner, "Enter number: ");
            if (value == -1) {
                System.out.println("Input finished.");
                break;
            }
            System.out.println("You entered: " + value);
        }
    }
}
