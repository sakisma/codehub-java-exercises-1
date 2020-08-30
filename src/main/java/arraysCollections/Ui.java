package arraysCollections;

import arraysCollections.services.*;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Ui {
    Scanner scanner;
    PrimeNumberCheck primeNumberCheck = new PrimeNumberCheck();
    DuplicateFind duplicateFind = new DuplicateFind();
    SortInDescOrder sortInDescOrder = new SortInDescOrder();
    StackStringReverse stackStringReverse = new StackStringReverse();
    SymmetricWordChecker symmetricWordChecker = new SymmetricWordChecker();
    CustomStackWithMethods customStackWithMethods = new CustomStackWithMethods();
    Stack<Integer> exampleStack = customStackWithMethods.initializeStack();

    public Ui() {
    }

    public void run() {

        do {
            System.out.println("Welcome to arrays and collections exercise. " +
                    "Please choose which program you'd like to run.\n" +
                    "1. List of prime numbers from another list\n" +
                    "2. List of duplicates in a list\n" +
                    "3. List sorted in descending order\n" +
                    "4. String reverse using stack\n" +
                    "5. Symmetric word checker\n" +
                    "6. Stack Example");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    primeNumber(primeNumberCheck.initialList());
                    break;
                case 2:
                    findDuplicateList();
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
                    stackImplementation();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (reRun());
    }

    private void primeNumber(List<Integer> exampleList) {
       primeNumberCheck.checkPrime(exampleList);
    }

    private void findDuplicateList() {
        System.out.println(duplicateFind.getDuplicates());
    }

    private void descSortList() {
       sortInDescOrder.sorter();
    }

    private void stringRevWithStack() {
        System.out.println("Please insert a string of your choice.");
        String initialString = new Scanner(System.in).nextLine();
        System.out.println("You wrote " + initialString + " and the reverse of that is "
                + stackStringReverse.reverseString(initialString));
    }

    private void inverseStringCheck() {
        System.out.println(symmetricWordChecker.input());
    }

    private void stackImplementation() {
        System.out.println("Welcome to stack example. I will initialize the example stack with 10 random integers." +
                "\nYou may select which out of 3 main functions you want to run.\n" +
                "Current selections are:\n" +
                "1: Push to stack.\n" +
                "2: Pop from stack.\n" +
                "3: Peek at stack.\n" +
                "4: Show the entire stack.");
        int choice = new Scanner(System.in).nextInt();

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
        String response = new Scanner(System.in).nextLine();

        return !response.equals("n");
    }
}
