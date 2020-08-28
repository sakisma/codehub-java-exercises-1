package passwordValidator.services;

import java.util.ArrayList;

public class Validator {

    public boolean hasOneUppercase(String inputString) {
        if (!inputString.equals(inputString.toUpperCase()))
            return true;
        else
            return false;
    }

    public boolean hasOneLowercase(String inputString) {
        if (!inputString.equals(inputString.toLowerCase()))
            return true;
        else
            return false;
    }

    public boolean hasOneNumber(String inputString) {
        if (inputString.matches(".*\\d.*"))
            return true;
        else
            return false;
    }

    public boolean hasOneSpecialCharacter(String inputString) {
        if (inputString.matches(".*[!@#$%^&*].*"))
            return true;
        else
            return false;
    }

    public boolean isLongEnough(String inputString) {
        if (inputString.length() >= 8)
            return true;
        else
            return false;
    }

    public boolean doesNotContainConsecutiveCharacters(String inputString) {
        if (!inputString.matches("(?i)(?:([a-z0-9])\\1{2,})*"))
            return true;
        else
            return false;
    }

    public int passwordCriteria(String inputString) {
        ArrayList<Integer> passwordStrength = new ArrayList<Integer>();
        int strength = 0;

        passwordStrength.add(hasOneUppercase(inputString) ? 1 : 0);
        passwordStrength.add(hasOneLowercase(inputString) ? 1 : 0);
        passwordStrength.add(hasOneNumber(inputString) ? 1 : 0);
        passwordStrength.add(hasOneSpecialCharacter(inputString) ? 1 : 0);
        passwordStrength.add(isLongEnough(inputString) ? 1 : 0);
        passwordStrength.add(doesNotContainConsecutiveCharacters(inputString) ? 1 : 0);

        for (Integer index : passwordStrength) {
            if (index == 1) {
                strength++;
            }
        }

        return strength;
    }

}
