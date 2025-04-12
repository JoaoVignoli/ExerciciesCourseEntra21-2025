package ModuleOne;

import java.util.Scanner;

public class MultipliationTable {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Digite o valor que seja a tabuada:");
        int num = console.nextInt();
        int numMax = 10;

        for (int i = 0;i <= numMax; i++){
            int multiplicacao = num * i;
            System.out.println(num + " x " + i + " = " + multiplicacao);
        }

    }
}
