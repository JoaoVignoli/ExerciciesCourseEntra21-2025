package ModuleOne;

import java.util.ArrayList;

public class EvenNumbersArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int sumEvensNumbers = 0;
        for (Integer i  = 1;i <= 10;i++){
            lista.add(i);
        }

        for (Integer num: lista){
            if (num % 2 == 0){
                sumEvensNumbers++;
            }
        }
        System.out.println(sumEvensNumbers);
    }
}
