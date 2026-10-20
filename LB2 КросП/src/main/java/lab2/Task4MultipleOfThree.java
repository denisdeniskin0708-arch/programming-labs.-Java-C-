package lab2;

import java.util.Scanner;

public class Task4MultipleOfThree {
    public static void run(Scanner scanner) {
        int n = ConsoleInput.readInt(scanner, "Enter integer n: ");
        String result = (n % 3 == 0) ? "multiple of 3" : "not multiple";
        System.out.println("Result: " + result);
    }
}
