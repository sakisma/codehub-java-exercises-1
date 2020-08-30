package arraysCollections.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DuplicateFind {
    private final List<Integer> mainList = new ArrayList<>();
    private final Random random = new Random();

    public String getDuplicates() {
        for (int i = 0; i < 25; i++) {
            mainList.add(random.nextInt(10));
        }

        List<Integer> nonDuplicateList = mainList.stream()
                .filter(e -> Collections.frequency(mainList, e) == 1)
                .collect(Collectors.toList());

        return "The starting list is " + mainList + " and the list without duplicates is " + nonDuplicateList;
    }

}
