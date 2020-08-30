package arraysCollections.services;

import java.util.*;

public class SortInDescOrder {
    Scanner scanner = new Scanner(System.in);

    List<Integer> sortedArray = new ArrayList();

    public void sorter() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Number " + (i + 1) + " out of 10");
            sortedArray.add(Integer.parseInt(scanner.nextLine()));
        }
        Collections.sort(sortedArray, Collections.reverseOrder());

        System.out.println("The list you created is\n" + sortedArray);
        sortedArray.removeAll(sortedArray);

    }

}
