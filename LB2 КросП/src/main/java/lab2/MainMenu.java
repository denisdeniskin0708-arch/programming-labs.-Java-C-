package lab2;

import java.util.Locale;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(Locale.ROOT);

            do {
                System.out.println("\n===== lab 2: Variant 10 =====");
                System.out.println("1 - Task 1 (If x < 5, calculate x + 5)");
                System.out.println("2 - Task 2 (Difference between larger and smaller)");
                System.out.println("3 - Task 3 (Error code description, switch)");
                System.out.println("4 - Task 4 (Multiple of 3, ternary)");
                System.out.println("5 - Task 5 (Product of numbers from 1 to n, for)");
                System.out.println("6 - Task 6 (Input numbers until -1, while)");
                System.out.println("0 - Exit");

                int choice = ConsoleInput.readInt(scanner, "Enter task number: ");

                if (choice == 0) {
                    System.out.println("Program finished.");
                    break;
                }

                if (choice < 1 || choice > 6) {
                    System.out.println("Error: invalid menu option.");
                    continue;
                }

                switch (choice) {
                    case 1 -> Task1AddFive.run(scanner);
                    case 2 -> Task2DiffMaxMin.run(scanner);
                    case 3 -> Task3ErrorCode.run(scanner);
                    case 4 -> Task4MultipleOfThree.run(scanner);
                    case 5 -> Task5Product.run(scanner);
                    case 6 -> Task6InputUntilMinusOne.run(scanner);
                    default -> throw new IllegalStateException("Invalid choice");
                }
            } while (true);
        }
    }
}
