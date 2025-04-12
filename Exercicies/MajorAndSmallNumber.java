package ModuleOne;

import java.util.ArrayList;

public class MajorAndSmallNumber {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Integer majorNumber = 0;


        for (Integer i  = 1;i <= 10;i++){
            lista.add(i);
        }

        for (Integer num: lista){
            if (num > majorNumber) {
                majorNumber = num;
            }
        }
        Integer smallNumber = majorNumber;
        for (Integer num: lista){
            if (num < smallNumber){
                smallNumber = num;
            }
        }

        System.out.println("Maior numero: " + majorNumber);
        System.out.println("Menor numero: " + smallNumber);
    }
}
