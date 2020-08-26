package simple.algorithms;

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

        return;
    }

    // Method that outputs the UI of the factorial calculation
    private void factorial () {
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

    private void harmonicCalculation () {
        System.out.println("I'm here");
    }

    private void countLongNumber () {
        System.out.println("I came here as well");
    }

    private void calculateDecimalPart () {
        System.out.println("Ola gucci");
    }

    //Method that prompts user to rerun the program
    private boolean reRun() {
        System.out.println("Do you want to re-run the program? (Y/n)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        if (response.equals("n"))
            return false;
        else
            return true;
    }
}
