package ModuleOne;

import java.util.ArrayList;

public class MultipleOfTwo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfNumbers = new ArrayList<>();
        ArrayList<Integer> multipleOfTwo = new ArrayList<>();

        arrayOfNumbers.add(-1);
        arrayOfNumbers.add(32);
        arrayOfNumbers.add(65);
        arrayOfNumbers.add(-12);
        arrayOfNumbers.add(32);

        for (Integer num: arrayOfNumbers){
            Integer multiple = num * 2;
            multipleOfTwo.add(multiple);
        }

        System.out.println(multipleOfTwo);
    }
}
