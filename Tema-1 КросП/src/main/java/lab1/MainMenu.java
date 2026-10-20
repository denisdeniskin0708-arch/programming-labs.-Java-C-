package lab1;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== LAB 1: Variant 10 ===");
            System.out.println("1 - Task 1");
            System.out.println("2 - Task 2");
            System.out.println("3 - Task 3");
            System.out.println("4 - Task 4");
            System.out.println("5 - Task 5");
            System.out.println("6 - Task 6");
            System.out.println("0 - Exit");
            System.out.print("Enter task number: ");

            while (!scan.hasNextInt()) {
                System.out.println("Error: enter an integer number.");
                scan.next();
                System.out.print("Enter task number: ");
            }
            choice = scan.nextInt();

            switch (choice) {
                case 1 -> Task1.main(args);
                case 2 -> Task2.main(args);
                case 3 -> Task3.main(args);
                case 4 -> Task4.main(args);
                case 5 -> Task5.main(args);
                case 0 -> System.out.println("Program finished.");
                default -> System.out.println("Error: unknown menu option.");
            }
        } while (choice != 0);

        scan.close();
    }
}
