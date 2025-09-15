package ed.pilha;

import java.util.Scanner;
import java.util.Stack;

public class VerificarExpressao {
    static boolean verificarParenteses(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                } else {
                    pilha.pop();
                }
            }
        }
        return pilha.isEmpty();
    }


    public static void main(String[] args) {
        String expressao = new Scanner(System.in).nextLine();
        if (verificarParenteses(expressao)) {
            System.out.println("Parenteses corretos");
        } else {
            System.out.println("Parenteses incorretos");
        }
    }
}
