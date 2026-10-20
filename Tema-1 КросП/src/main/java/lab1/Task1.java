package lab1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x;

        while (true) {
            System.out.print("Enter x: ");
            if (scan.hasNextDouble()) {
                x = scan.nextDouble();
                if (x + 2 >= 0) {
                    break;
                }
                System.out.println("Error: x + 2 must be >= 0.");
            } else {
                System.out.println("Error: enter a real number.");
                scan.next();
            }
        }

        double y = Math.sqrt(x + 2);
        System.out.printf("Result y = %.4f%n", y);
        scan.close();
    }
}
