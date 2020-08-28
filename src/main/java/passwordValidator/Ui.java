package passwordValidator;

import passwordValidator.services.Validator;

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

    private String isValid(String inputString) {
        Validator validator = new Validator();

        if (validator.passwordCriteria(inputString) > 2 && validator.isLongEnough(inputString)) {
            if ((validator.hasOneNumber(inputString) && validator.doesNotContainConsecutiveCharacters(inputString)) || (validator.hasOneSpecialCharacter(inputString) && validator.doesNotContainConsecutiveCharacters(inputString)))
                System.out.println("Password OK");
            if (validator.isLongEnough(inputString) && validator.doesNotContainConsecutiveCharacters(inputString))
                System.out.println("Strong Password");
            if (validator.passwordCriteria(inputString) == 6)
                System.out.println("Very Strong password");
            return "Password is valid";
        } else {
            return ("Invalid password. The requirements are:\n" +
                    "1. Password contains at least one uppercase character\n" +
                    "2. Password contains at least one lowercase character\n" +
                    "3. Contains at least one number\n" +
                    "4. Contains at least one special character (e.g., !, _ etc)\n" +
                    "5. Password length must be at least 8 characters long\n" +
                    "6. Cannot contain a sequence of 3 same characters (i.e.\n" +
                    "aaa) or a sequence of 3 consecutive characters (i.e abc)");
        }
    }

    private boolean reRun() {
        System.out.println("Do you want to re-run the program? (Y/n)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return !response.equals("n");
    }
}
