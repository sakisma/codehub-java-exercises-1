package arraysCollections.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DuplicateFind {

    public String getDuplicates() {
        List mainList = new ArrayList();
        List nonDuplicateList = new ArrayList();
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            mainList.add(random.nextInt(10));
        }

        nonDuplicateList = (List) mainList.stream().filter(e -> Collections.frequency(mainList, e) == 1).collect(Collectors.toList());

        return "The starting list is " + mainList + " and the list without duplicates is " + nonDuplicateList;
    }

}
