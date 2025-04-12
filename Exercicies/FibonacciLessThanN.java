package ModuleOne;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciLessThanN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite quantos valores de Fibonacci deseja:");
        int num = console.nextInt();

        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);

        Integer newFibonacciNumber = 0;

        while (newFibonacciNumber < num){
            for (int i = 2;i <= fibonacci.size();i++){
                newFibonacciNumber = fibonacci.get(i-1) + fibonacci.get(i-2);
            }
            if (newFibonacciNumber <= num){
                fibonacci.add(newFibonacciNumber);
            }
        }

        System.out.println(fibonacci);
    }
}
