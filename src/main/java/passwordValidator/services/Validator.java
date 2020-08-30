package passwordValidator.services;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    public Validator() {
    }

    public boolean hasOneUppercase(String inputString) {
        return !inputString.equals(inputString.toUpperCase());
    }

    public boolean hasOneLowercase(String inputString) {
        return !inputString.equals(inputString.toLowerCase());
    }

    public boolean hasOneNumber(String inputString) {
        return inputString.matches(".*\\d.*");
    }

    public boolean hasOneSpecialCharacter(String inputString) {
        return inputString.matches(".*[!@#$%^&*].*");
    }

    public boolean isLongEnough(String inputString) {
        return inputString.length() >= 8;
    }

    public boolean doesNotContainConsecutiveCharacters(String inputString) {
        return !inputString.matches("(?i)(?:([a-z0-9])\\1{2,})*");
    }

    public int passwordCriteria(String inputString) {
        List<Integer> passwordStrength = new ArrayList<>();
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
