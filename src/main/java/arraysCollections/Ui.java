package arraysCollections;

import arraysCollections.services.DuplicateFind;
import arraysCollections.services.PrimeNumberList;
import arraysCollections.services.SortInDescOrder;
import arraysCollections.services.StackStringReverse;

import java.util.Scanner;

public class Ui {
    public Ui() {
    }

    public void run() {

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to arrays and collections exercise. Please choose which program you'd like to run.");
            System.out.println("1. List of prime numbers from another list");
            System.out.println("2. List of duplicates in a list");
            System.out.println("3. List sorted in descending order");
            System.out.println("4. String reverse using stack");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    primeNumber();
                    break;
                case 2:
                    findDuplicatelist();
                    break;
                case 3:
                    descSortList();
                    break;
                case 4:
                    stringRevWithStack();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (reRun());



    }

    private void primeNumber() {
        PrimeNumberList primeNumberList = new PrimeNumberList();
        System.out.println(primeNumberList.primaryList());
    }

    private void findDuplicatelist() {
        DuplicateFind duplicateFind = new DuplicateFind();
        System.out.println(duplicateFind.getDuplicates());
    }

    private void descSortList() {
        SortInDescOrder sortInDescOrder = new SortInDescOrder();
        System.out.println(sortInDescOrder.sorter());
    }

    private void stringRevWithStack() {
        Scanner scanner = new Scanner(System.in);
        StackStringReverse stackStringReverse = new StackStringReverse();
        System.out.println("Please insert a string of your choice.");
        String initialString = scanner.nextLine();
        System.out.println("You wrote " + initialString + " and the reverse of that is " + stackStringReverse.reverse(initialString));
    }

    //Method that prompts user to rerun the program
    private boolean reRun() {
        System.out.println("Do you want to re-run the program? (Y/n)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return !response.equals("n");
    }
}
