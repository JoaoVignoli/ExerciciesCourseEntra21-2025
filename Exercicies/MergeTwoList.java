package ModuleOne;

import java.util.ArrayList;

public class MergeTwoList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfNumbersOne = new ArrayList<>();
        ArrayList<Integer> arrayOfNumbersTwo = new ArrayList<>();
        ArrayList<Integer> newArrayOfNumbers = new ArrayList<>();

        arrayOfNumbersOne.add(1);
        arrayOfNumbersTwo.add(2);
        arrayOfNumbersOne.add(3);
        arrayOfNumbersTwo.add(4);
        arrayOfNumbersOne.add(5);
        arrayOfNumbersTwo.add(6);
        arrayOfNumbersOne.add(7);
        arrayOfNumbersTwo.add(8);
        arrayOfNumbersOne.add(9);
        arrayOfNumbersTwo.add(10);
        arrayOfNumbersOne.add(11);
        arrayOfNumbersTwo.add(12);


        for (int i = 0; i < arrayOfNumbersOne.size(); i++) {
            newArrayOfNumbers.add(arrayOfNumbersOne.get(i));
            for (int j = 0; j < i + 1; j++) {
                if (!(newArrayOfNumbers.contains(arrayOfNumbersTwo.get(j)))){
                    newArrayOfNumbers.add(arrayOfNumbersTwo.get(j));
                }
            }
        }
        System.out.println(newArrayOfNumbers);
    }
}
