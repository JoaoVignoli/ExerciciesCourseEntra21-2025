package ModuleOne;

import java.util.ArrayList;

public class AverageOfEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(1);
        numbers.add(3);
        numbers.add(54);
        numbers.add(24);
        numbers.add(12);

        Integer sumOfNumbers = 0;
        Integer totalOfNumbers = 0;

        for (Integer num: numbers){
            if (num % 2 == 0){
                sumOfNumbers += num;
                totalOfNumbers++;
            }
        }

        double division = sumOfNumbers / totalOfNumbers;
        System.out.println(division);
    }
}
