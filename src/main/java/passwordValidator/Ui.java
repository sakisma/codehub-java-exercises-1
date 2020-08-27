package passwordValidator;

import java.util.Scanner;

public class Ui {
    public void run() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the password validator. Please insert your password and we'll tell you if it is valid");
            String inputString = scanner.nextLine();
            System.out.println(isValid(inputString));
        } while (reRun());
    }

    private boolean isValid(String inputString) {
        System.out.println("WIP just don't put your passwords everywhere");
        return true;
    }

    private boolean reRun() {
        System.out.println("Do you want to re-run the program? (Y/n)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return !response.equals("n");
    }
}
