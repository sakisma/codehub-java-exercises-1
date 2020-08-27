package arraysCollections.services;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberList {
    public PrimeNumberList() {
    }

    public String primaryList() {
        List listAllIntegers = new ArrayList();
        List primeNumberList = new ArrayList();

        for(int i = 0; i < 25; i++) {
            listAllIntegers.add(i);
            if (i % 2 == 0)
                primeNumberList.add(i);
        }
        return "The starting list is " + listAllIntegers + "\nand the prime number list is " + primeNumberList;
    }
}
