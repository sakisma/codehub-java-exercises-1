package arraysCollections.services;

import java.util.Stack;

public class StackStringReverse {
    private final Stack<Character> stack = new Stack<>();

    public StackStringReverse() {
    }

    public String reverseString(String initialString) {
        if (initialString == null || initialString.equals("")) {
            return initialString;
        }

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
