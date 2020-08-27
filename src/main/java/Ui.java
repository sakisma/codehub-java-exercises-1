import services.DuplicateFind;
import services.PrimeNumberList;
import services.SortInDescOrder;

import java.util.ArrayList;
import java.util.List;

public class Ui {
    public Ui() {
    }

    public void run() {
//        PrimeNumberList primeNumberList = new PrimeNumberList();
//        DuplicateFind duplicateFind = new DuplicateFind();
//        System.out.println(primeNumberList.primaryList());
//        System.out.println(duplicateFind.getDuplicates());
        SortInDescOrder sortInDescOrder = new SortInDescOrder();
        System.out.println(sortInDescOrder.sorter());
    }
}
