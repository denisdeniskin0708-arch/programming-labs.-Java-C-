package lab2;

import java.util.Scanner;

public class Task3ErrorCode {
    public static void run(Scanner scanner) {
        int code = ConsoleInput.readInt(scanner, "Enter error code (1-3): ");

        switch (code) {
            case 1 -> System.out.println("Error 1: File not found.");
            case 2 -> System.out.println("Error 2: Access denied.");
            case 3 -> System.out.println("Error 3: Connection timeout.");
            default -> System.out.println("Error: invalid error code. Allowed values are 1, 2, 3.");
        }
    }
}
