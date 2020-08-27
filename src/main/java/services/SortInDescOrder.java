package services;

import java.util.*;

public class SortInDescOrder {

    public String sorter() {
        Scanner scanner = new Scanner(System.in);
        List myList = new ArrayList();
        List sortedArray = new ArrayList();

        for(int i = 0; i < 10; i++) {
            System.out.println("Number " + (i + 1) + " out of 10");
            myList.add(Integer.parseInt(scanner.nextLine()));
        }

        Collections.sort(myList, Collections.reverseOrder());

        return("The list you created is " + myList);

    }

}
