package ModuleOne;

import java.util.ArrayList;

public class AverageNumbersInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numerosInteiros = new ArrayList<>();

        numerosInteiros.add(12);
        numerosInteiros.add(13);
        numerosInteiros.add(34);
        numerosInteiros.add(23);
        numerosInteiros.add(65);

        Integer sum = 0;
        Integer average = 0;

        for (Integer num: numerosInteiros){
            sum += num;
        }

        average = sum / numerosInteiros.size();

        System.out.println(average);

    }
}
