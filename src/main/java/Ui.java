import services.DuplicateFind;
import services.PrimeNumberList;

import java.util.ArrayList;
import java.util.List;

public class Ui {
    public Ui() {
    }

    public void run() {
        PrimeNumberList primeNumberList = new PrimeNumberList();
        DuplicateFind duplicateFind = new DuplicateFind();
        System.out.println(primeNumberList.primaryList());
        System.out.println(duplicateFind.getDuplicates());
    }
}
