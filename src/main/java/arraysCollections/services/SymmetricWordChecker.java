package arraysCollections.services;

import java.util.Scanner;

public class SymmetricWordChecker {
    public String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the string that you want to test:");
        String inputString = scanner.nextLine();
        StringBuilder reverseString = new StringBuilder(inputString);
        reverseString.reverse();

        if (inputString.equals(reverseString.toString())) {
            return "The string you put is " + inputString + " and " + reverseString + " is the reverse. They do match.";
        }
        else
            return "The string you put is " + inputString + " and " + reverseString + " is the reverse. They do not match.";
    }
}
