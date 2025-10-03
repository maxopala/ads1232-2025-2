package ed.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila1 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.offer("X");
        fila.offer("Y");
        fila.offer("Z");

        System.out.println(fila);

        String a = fila.peek();

        System.out.println(a);
        System.out.println(fila);

        a = fila.remove();

        System.out.println(a);
        System.out.println(fila);
    }
}
