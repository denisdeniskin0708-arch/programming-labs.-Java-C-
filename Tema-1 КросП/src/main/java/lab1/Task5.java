package lab1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;

        while (true) {
            System.out.print("Enter integer N: ");
            if (scan.hasNextInt()) {
                N = scan.nextInt();
                break;
            }
            System.out.println("Error: enter an integer.");
            scan.next();
        }

        int count = 0;
        int temp = Math.abs(N);

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                if (temp % 10 == 0) {
                    count++;
                }
                temp /= 10;
            }
        }

        System.out.println("Number of zeros = " + count);
        scan.close();
    }
}
