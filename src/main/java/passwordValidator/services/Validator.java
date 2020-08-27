package passwordValidator.services;

import java.util.ArrayList;

public class Validator {

    public boolean hasOneUppercase(String inputString) {
        return true;
    }

    public boolean hasOneLowercase(String inputString) {
        return true;
    }

    public boolean hasOneNumber(String inputString) {
        return true;
    }

    public boolean hasOneSpecialCharacter(String inputString) {
        return false;
    }

    public boolean isLongEnough(String inputString) {
        return false;
    }

    public boolean doesNotContainConsecutiveCharacters(String inputString) {
        return true;
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

        for(Integer index: passwordStrength) {
            if (index == 1) {
                strength++;
            }
        }

        return strength;
    }

}
