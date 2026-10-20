package lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a;

        while (true) {
            System.out.print("Enter a: ");
            if (scan.hasNextDouble()) {
                a = scan.nextDouble();
                break;
            }
            System.out.println("Error: enter a real number.");
            scan.next();
        }

        double a2 = a * a;
        double a4 = a2 * a2;
        double a8 = a4 * a4;
        double a9 = a8 * a;

        System.out.printf("a^9 = %.4f%n", a9);
        scan.close();
    }
}
