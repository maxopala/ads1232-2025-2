package ed.lista;

import java.util.*;

public class TesteListaSdk {
    public static void main(String[] args) {
        List<String> l;

        boolean sorteio = new Random().nextBoolean();
        if (sorteio) {
            l = new LinkedList<>();
        } else {
            l = new ArrayList<>();
        }

        for (int i = 0; i < 100000; i++) {
            l.add("nUmErO " + i);
        }

        long inicio = System.currentTimeMillis();

//        Iterator<String> x = l.iterator();
//        while (x.hasNext()) {
//            String s = x.next();
        for (String s : l) {
            s = s.toUpperCase();
            System.out.println(s);
        }

        long fim = System.currentTimeMillis();
        System.out.println((fim - inicio) + "ms");

        System.out.println("Lista: " + l.getClass());
    }
}
