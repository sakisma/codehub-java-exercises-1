import services.PrimeNumberList;

import java.util.ArrayList;
import java.util.List;

public class Ui {
    public Ui() {
    }

    public void run() {
        PrimeNumberList primeNumberList = new PrimeNumberList();
        System.out.println(primeNumberList.primaryList());
    }
}
