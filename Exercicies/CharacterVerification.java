package ModuleOne;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterVerification {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char charOne = ' ';
        char charTwo = ' ';
        int charOnePosition = 0;
        int charTwoPosition = 0;
        ArrayList<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');

        System.out.println("Digite dois caracteres");
        charOne = console.next().charAt(0);
        charTwo = console.next().charAt(0);
        for (int i = 0;i < alphabet.size();i++){
            if (alphabet.get(i) == charOne){
                charOnePosition = i;
            }
            if (alphabet.get(i) == charTwo){
                charTwoPosition = i;
            }
        }
        if (charOnePosition > charTwoPosition){
            System.out.println("Erro: Os caracteres não estão em ordem alfabética.");
        } else {
            System.out.println(charTwoPosition - charOnePosition - 1);
        }

    }
}
