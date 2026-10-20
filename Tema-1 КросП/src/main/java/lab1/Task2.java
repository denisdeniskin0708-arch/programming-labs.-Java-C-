package lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a;

        while (true) {
            System.out.print("Enter side a: ");
            if (scan.hasNextDouble()) {
                a = scan.nextDouble();
                if (a > 0) {
                    break;
                }
                System.out.println("Error: side must be a positive number.");
            } else {
                System.out.println("Error: enter a real number.");
                scan.next();
            }
        }

        double area = (Math.sqrt(3) / 4.0) * a * a;
        System.out.printf("Equilateral triangle area = %.4f%n", area);
        scan.close();
    }
}
