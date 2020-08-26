package simple.algorithms.services;

public class CalculateHarmonicNumber {

    public CalculateHarmonicNumber() {
    }

    public float calculation(int choice) {
        float harmonicNumber = 1;

        for (int harmonicIndex = 2; harmonicIndex <= choice; harmonicIndex++) {
            harmonicNumber += (float) 1 / harmonicIndex;
        }
        return harmonicNumber;
    }
}
