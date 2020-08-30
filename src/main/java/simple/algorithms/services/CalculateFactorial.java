package simple.algorithms.services;

public class CalculateFactorial {

    public CalculateFactorial() {
    }

    public int calculation (int inputNumber) {
        int factorial = 1;
        for (int i = 2; i <= inputNumber; i++) {
            factorial = factorial * i;
        }

        return factorial;
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
