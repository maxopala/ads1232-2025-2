package ed.pilha;

import java.util.Stack;

public class TestePilha {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        String x;

        System.out.println(stack);

        System.out.println("PEEK");
        x = stack.peek();
        System.out.println(x);
        System.out.println(stack);

        System.out.println("POP");
        x = stack.pop();
        System.out.println(x);
        System.out.println(stack);
    }
}
