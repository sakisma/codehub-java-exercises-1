package simple.algorithms;

public class CalculateFactorial {
    private int inputNumber;

    public CalculateFactorial() {
    }

    public int calculation (int inputNumber) {
        if (inputNumber == 0)
            return 1;
        else {
            int finalNumber = 1;
            for (int factorialLoopNumber = 1; factorialLoopNumber < inputNumber; factorialLoopNumber++) {
                finalNumber = finalNumber * factorialLoopNumber;
            }
            return finalNumber;
        }
    }

    public boolean isPrimeNumber (int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }
}
