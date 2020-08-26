package simple.algorithms.services;

public class CalculatePositiveFloatDecimalPart {
    public CalculatePositiveFloatDecimalPart() {
    }

    public float calculation(float choice) {
        long intPartChoice = (long) choice;
        return choice - intPartChoice;
    }
}
