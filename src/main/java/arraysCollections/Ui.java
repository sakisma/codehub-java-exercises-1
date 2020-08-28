package arraysCollections;

import arraysCollections.services.*;

import java.util.Scanner;
import java.util.Stack;

public class Ui {
    public Ui() {
    }


    public void run() {
        Stack exampleStack = new Stack();
        CustomStackWithMethods customStackWithMethods = new CustomStackWithMethods();
        customStackWithMethods.initializeStack(exampleStack);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to arrays and collections exercise. " +
                    "Please choose which program you'd like to run.");
            System.out.println("1. List of prime numbers from another list");
            System.out.println("2. List of duplicates in a list");
            System.out.println("3. List sorted in descending order");
            System.out.println("4. String reverse using stack");
            System.out.println("5. Symmetric word checker");
            System.out.println("6. Stack Example");
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
                case 5:
                    inverseStringCheck();
                    break;
                case 6:
                    stackImplementation(exampleStack);
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
        System.out.println("You wrote " + initialString + " and the reverse of that is "
                + stackStringReverse.reverse(initialString));
    }

    private void inverseStringCheck() {
        SymmetricWordChecker symmetricWordChecker = new SymmetricWordChecker();
        System.out.println(symmetricWordChecker.input());
    }

    private void stackImplementation(Stack exampleStack) {
        CustomStackWithMethods customStackWithMethods = new CustomStackWithMethods();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to stack example. I will initialize the example stack with 10 random integers." +
                "\nYou may select which out of 3 main functions you want to run.");
        System.out.println("Current selections are:");
        System.out.println("1: Push to stack.");
        System.out.println("2: Pop from stack.");
        System.out.println("3: Peek at stack.");
        System.out.println("4: Show the entire stack.");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                customStackWithMethods.pushToStack(exampleStack);
                break;
            case 2:
                customStackWithMethods.popFromStack(exampleStack);
                break;
            case 3:
                customStackWithMethods.peekAtStack(exampleStack);
                break;
            case 4:
                System.out.println(exampleStack);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    //Method that prompts user to rerun the program
    private boolean reRun() {
        System.out.println("Do you want to re-run the program? (Y/n)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return !response.equals("n");
    }
}
