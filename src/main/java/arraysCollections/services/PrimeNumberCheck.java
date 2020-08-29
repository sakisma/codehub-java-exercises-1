package arraysCollections.services;

import java.util.Scanner;

public class PrimeNumberCheck {
    public PrimeNumberCheck() {
    }

    public String find() {
        Scanner scanner = new Scanner(System.in);
        int checkIfNumberPrime = scanner.nextInt();
        boolean flag = false;

        System.out.println("Insert a number to check if it is prime");
        for (int i = 2; i < checkIfNumberPrime / 2; ++i) {
            if (checkIfNumberPrime % i == 0)
                flag = true;
            break;
        }

        if (!flag)
            return checkIfNumberPrime + " is a prime number.";
        else
            return checkIfNumberPrime + " is not a prime number.";
    }
}
