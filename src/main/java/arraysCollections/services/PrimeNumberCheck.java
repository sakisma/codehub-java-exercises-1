package arraysCollections.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrimeNumberCheck {
    String response;

    public PrimeNumberCheck() {
    }

    public List<Integer> initialList() {
        List<Integer> exampleList = new ArrayList<>();
        do {
            System.out.println("Add an integer to stack");
            int integerToAdd = new Scanner(System.in).nextInt();
            exampleList.add(integerToAdd);
            System.out.println("Do you want to add another integer?(Y/n)");
            response = new Scanner(System.in).nextLine();
        } while (!response.equals("n"));

        return exampleList;
    }

    public boolean isPrime(int numberToCheck) {
        for (int i = 2; i < (int)Math.sqrt(numberToCheck); i++)
            if (numberToCheck % i == 0)
                return false;

        return true;
    }

    public void checkPrime(List<Integer> stackToCheck) {
        for (int numberToCheck : stackToCheck) {
            System.out.println(isPrime(numberToCheck));
        }
    }
}


