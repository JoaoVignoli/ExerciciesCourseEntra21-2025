package ModuleOne;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();

        arrayOfNumbers.add(-1);
        arrayOfNumbers.add(32);
        arrayOfNumbers.add(65);
        arrayOfNumbers.add(-12);
        arrayOfNumbers.add(32);

        Collections.sort(arrayOfNumbers);

        System.out.println(arrayOfNumbers);

        Collections.sort(arrayOfNumbers, Collections.reverseOrder());

        System.out.println(arrayOfNumbers);
    }
}
