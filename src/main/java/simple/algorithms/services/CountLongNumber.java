package simple.algorithms.services;

public class CountLongNumber {
    public CountLongNumber() {
    }

    public int calculation(long choice) {
        int digits = 0;
        while (choice != 0) {
            choice = choice / 10;
            ++digits;
        }
        return digits;
    }
}
