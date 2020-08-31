package arraysCollections.services;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class CustomStackWithMethods {
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    public Stack<Integer> initializeStack() {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 10; i++) {
            stack.push(random.nextInt(10));
        }
        return stack;
    }

    public void pushToStack(Stack<Integer> stack) {
        System.out.println("Provide an integer to push to stack");
        int integerToPush = scanner.nextInt();
        stack.push(integerToPush);
        System.out.println("You pushed " + integerToPush + " to the example stack. The stack now is\n" + stack);
    }

    public void popFromStack(Stack<Integer> stack) {
        System.out.println("The stack.pop() returns the element on the top of the stack, removing it in the process" +
                " See it for yourself\n " + stack.pop() + "\n" + stack);
    }

    public void peekAtStack(Stack<Integer> stack) {
        System.out.println("The stack.peek() returns the element on the top of the stack, but does not remove it." +
                "See it for yourself. \n" + stack.peek() + "\n" + stack);
    }
}
