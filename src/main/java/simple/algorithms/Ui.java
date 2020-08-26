package simple.algorithms;

import java.util.Scanner;

public class Ui {
    public void run() {
        //      Declare all classes
        CalculateFactorial calculateFactorial = new CalculateFactorial();

        //      Text For Command Line Input
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please choose which simple algorithm you want to run:");
            System.out.println("1. Factorial Calculation");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Please choose the number that you want calculated");
                    int chooseNumber = Integer.parseInt(scanner.nextLine());
                    if (chooseNumber > 17)
                        System.out.println("I cannot calculate that high");
                    else
                        System.out.println(calculateFactorial.calculation(chooseNumber));
                    break;
                default:
                    System.out.println("Invalid number. Please choose again.");
                    break;
            }
        } while (reRun());
        return;
    }

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
