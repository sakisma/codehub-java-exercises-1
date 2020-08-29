package simple.algorithms.services;

public class CalculateFactorial {

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
        boolean flag = false;

        for (int i = 2; i < number / 2; ++i) {
            if (number % i == 0)
                flag = true;
            break;
        }

        return !flag;
    }

}
