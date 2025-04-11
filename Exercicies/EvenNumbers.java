package ModuleOne;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Escreva um inteiro:");
        int num = console.nextInt();

        for (int i = 1; i <= num; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
