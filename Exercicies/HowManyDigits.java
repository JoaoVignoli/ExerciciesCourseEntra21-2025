package ModuleOne;

import java.util.Scanner;

public class HowManyDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite um valor inteiro:");
        int num = console.nextInt();
        int count = 0;

        if (num > 10){
            while (num > 0){
                if (!(num % 10 == 0)){
                    count++;
                }
                num /= 10;
            }
        } else {
            count = 1;
        }
        System.out.println(count);
    }
}
