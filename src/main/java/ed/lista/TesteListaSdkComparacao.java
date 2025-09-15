package ed.lista;

import java.util.*;

public class TesteListaSdkComparacao {
    public static void main(String[] args) {
        List<String> lista;

        boolean sorteio = new Random().nextBoolean();
        sorteio = false;
        if (sorteio) {
            lista = new LinkedList<>();
        } else {
            lista = new ArrayList<>(1);
        }

        long inicio = System.currentTimeMillis();

//        Random r = new Random();
        for (int i = 0; i < 100000; i++) {
            lista.add("nUmErO " + i);
        }

        lista.sort(null);

        long fim = System.currentTimeMillis();

        for (String s : lista) {
            s = s.toUpperCase();
            System.out.println(s);
        }

        System.out.println((fim - inicio) + "ms");
        System.out.println("Lista: " + lista.getClass());

        inicio = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int index = Collections.binarySearch(lista, "nUmErO " + (i + 49950));
            System.out.println("Posição: " + index);
        }
        fim = System.currentTimeMillis();

        System.out.println((fim - inicio) + "ms");
        System.out.println("Lista: " + lista.getClass());
    }
}
