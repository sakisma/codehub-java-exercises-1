package arraysCollections.services;

import java.util.Stack;

public class StackStringReverse {

    public static String reverse(String initialString) {
        if (initialString == null || initialString.equals("")) {
            return initialString;
        }

        Stack<Character> stack = new Stack<Character>();
        char[] character = initialString.toCharArray();

        for (int characterToPush = 0; characterToPush < initialString.length(); characterToPush++) {
            stack.push(character[characterToPush]);
        }

        int characterToPop = 0;

        while (!stack.isEmpty()) {
            character[characterToPop++] = stack.pop();
        }

        return String.copyValueOf(character);
    }

}
