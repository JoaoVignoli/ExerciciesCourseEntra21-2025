package ModuleOne;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite quantos valores de Fibonacci deseja:");
        int num = console.nextInt();

        int[] fibonacci = new int[num];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2;i <= num - 1;i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        for (int i : fibonacci){
            System.out.println(i);
        }
    }
}
