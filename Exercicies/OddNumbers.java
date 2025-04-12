package ModuleOne;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Escreva um número inteiro:");
        int num = console.nextInt();

        while (num != 0){
            if (!(num % 2 == 0)){
                System.out.println(num);
            }
            num--;
        }
    }
}
