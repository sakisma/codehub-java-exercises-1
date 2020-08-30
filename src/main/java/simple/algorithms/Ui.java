package simple.algorithms;

import simple.algorithms.services.CalculateFactorial;
import simple.algorithms.services.CalculateHarmonicNumber;
import simple.algorithms.services.CalculatePositiveFloatDecimalPart;
import simple.algorithms.services.CountLongNumber;

import java.util.Scanner;

public class Ui {
    Scanner scanner;
    CalculateFactorial calculateFactorial = new CalculateFactorial();
    CalculateHarmonicNumber calculateHarmonicNumber = new CalculateHarmonicNumber();
    CountLongNumber countLongNumber = new CountLongNumber();
    CalculatePositiveFloatDecimalPart calculatePositiveFloatDecimalPart = new CalculatePositiveFloatDecimalPart();

    public void run() {
        do {
            System.out.println("Welcome to simple algorithms exercise. Please choose which program you'd like to run.\n" +
                    "1. Calculate Factorial\n" +
                    "2. Harmonic number calculation\n" +
                    "3. Count digits for a long number\n" +
                    "4. Print decimal part for a positive float number\n");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    factorial();
                    break;
                case 2:
                    harmonicCalculation();
                    break;
                case 3:
                    countLongNumber();
                    break;
                case 4:
                    calculateDecimalPart();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (reRun());
    }

    // Method that outputs the UI of the factorial calculation
    private void factorial() {
        System.out.println("Please choose the number that you want calculated");
        int chooseNumber = new Scanner(System.in).nextInt();

        // Check for integer overflow on user input

        if (chooseNumber > 17)
            System.out.println("I cannot calculate that high");
        else {
            System.out.println("The factorial of " + chooseNumber + " is " +
                    calculateFactorial.calculation(chooseNumber) +
                    "\nIs number prime: "
                    + calculateFactorial.isPrimeNumber(calculateFactorial.calculation(chooseNumber)));
        }
    }

    private void harmonicCalculation() {
        System.out.println("Please choose the number that you want calculated");
        int chooseNumber = new Scanner(System.in).nextInt();
        if (chooseNumber > 0)
            System.out.println("The harmonic number of " + chooseNumber + " is "
                    + calculateHarmonicNumber.calculation(chooseNumber));
        else
            System.out.println("Your entry is invalid.");
    }

    private void countLongNumber() {
        System.out.println("Please insert a long number.");
        long chooseNumber = new Scanner(System.in).nextLong();
        System.out.println("The number " + chooseNumber + " has "
                + countLongNumber.calculation(chooseNumber) + " digits");
    }

    private void calculateDecimalPart() {
        System.out.println("Please insert a float number");
        float chooseNumber = new Scanner(System.in).nextFloat();
        System.out.println("The decimals for " + chooseNumber
                + " are " + calculatePositiveFloatDecimalPart.calculation(chooseNumber));
    }

    //Method that prompts user to rerun the program
    private boolean reRun() {
        System.out.println("Do you want to re-run the program? (Y/n)");
        String response = new Scanner(System.in).nextLine();

        return !response.equals("n");
    }
}
