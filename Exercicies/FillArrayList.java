package ModuleOne;

import java.util.ArrayList;

public class FillArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1;i <= 10;i++){
            lista.add(i);
        }
        for (Integer inteiro : lista){
            System.out.println(inteiro);
        }
    }
}
