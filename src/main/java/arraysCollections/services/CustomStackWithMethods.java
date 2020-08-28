package arraysCollections.services;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class CustomStackWithMethods {
    Random random = new Random();

    public Stack initializeStack(Stack stack) {
        for(int i = 0; i < 10; i++) {
            stack.push(random.nextInt(10));
        }

        return stack;
    }

    public Stack pushToStack(Stack stack) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide an integer to push to stack");
        int integerToPush = scanner.nextInt();
        stack.push(integerToPush);
        System.out.println("You pushed " + integerToPush + " to the example stack. The stack now is\n" + stack);

        return stack;
    }

    public Stack popFromStack(Stack stack) {
        System.out.println("The stack.pop() returns the element on the top of the stack, removing it in the process" +
                " See it for yourself\n " + stack.pop() + "\n" + stack);

        return stack;
    }

    public Stack peekAtStack(Stack stack) {
        System.out.println("The stack.peek() returns the element on the top of the stack, but does not remove it." +
                "See it for yourself. \n" + stack.peek() + "\n" + stack);

        return stack;
    }
}
