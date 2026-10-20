package lab1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = getDoubleInput(scan, "Enter vector x: ");
        double y = getDoubleInput(scan, "Enter vector y: ");
        double z = getDoubleInput(scan, "Enter vector z: ");

        double length = Math.sqrt(x * x + y * y + z * z);
        System.out.printf("Vector length = %.4f%n", length);
        scan.close();
    }

    private static double getDoubleInput(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scan.hasNextDouble()) {
                return scan.nextDouble();
            }
            System.out.println("Error: enter a real number.");
            scan.next();
        }
    }
}