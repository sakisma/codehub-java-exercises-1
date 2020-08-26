package simple.algorithms;

import simple.algorithms.services.CalculateFactorial;
import simple.algorithms.services.CalculateHarmonicNumber;
import simple.algorithms.services.CalculatePositiveFloatDecimalPart;
import simple.algorithms.services.CountLongNumber;

import java.util.Scanner;

public class Ui {
    public void run() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to simple algorithms exercise. Please choose which program you'd like to run.");
            System.out.println("1. Calculate Factorial");
            System.out.println("2. Harmonic number calculation");
            System.out.println("3. Count digits for a long number");
            System.out.println("4. Print decimal part for a positive float number");
            int choice = Integer.parseInt(scanner.nextLine());
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
        CalculateFactorial calculateFactorial = new CalculateFactorial();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose the number that you want calculated");
        int chooseNumber = Integer.parseInt(scanner.nextLine());
        if (chooseNumber > 17)
            System.out.println("I cannot calculate that high");
        else {
            System.out.println("The factorial of " + chooseNumber + " is " + calculateFactorial.calculation(chooseNumber));
            System.out.println("Is number prime: " + calculateFactorial.isPrimeNumber(calculateFactorial.calculation(chooseNumber)));
        }
    }

    private void harmonicCalculation() {
        CalculateHarmonicNumber calculateHarmonicNumber = new CalculateHarmonicNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose the number that you want calculated");
        int chooseNumber = Integer.parseInt(scanner.nextLine());
        if (chooseNumber > 0)
            System.out.println("The harmonic number of " + chooseNumber + " is " + calculateHarmonicNumber.calculation(chooseNumber));
        else
            System.out.println("Your entry is invalid.");
    }

    private void countLongNumber() {
        CountLongNumber countLongNumber = new CountLongNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a long number.");
        long chooseNumber = Long.parseLong(scanner.nextLine());
        System.out.println("The number " + chooseNumber + " has " + countLongNumber.calculation(chooseNumber) + " digits");
    }

    private void calculateDecimalPart() {
        CalculatePositiveFloatDecimalPart calculatePositiveFloatDecimalPart = new CalculatePositiveFloatDecimalPart();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a float number");
        float chooseNumber = Float.parseFloat(scanner.nextLine());
        System.out.println("The decimals for " + chooseNumber + " are " + calculatePositiveFloatDecimalPart.calculation(chooseNumber));
    }

    //Method that prompts user to rerun the program
    private boolean reRun() {
        System.out.println("Do you want to re-run the program? (Y/n)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return !response.equals("n");
    }
}
