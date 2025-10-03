package ed.fila;

import java.text.MessageFormat;
import java.util.*;

public class TesteFilaPrioridade {
    public static void opcao1() {
        Queue<Registro>[] filas = new Queue[5];

        for (int i = 0; i < 5; i++) {
            filas[i] = new LinkedList<>();
        }

        Random rand = new Random(1);
        for (int i = 0; i < 30; i++) {
            int p = rand.nextInt(5) + 1;
            char c = (char) (rand.nextInt(26) + 'A');
            Registro r = new Registro(String.valueOf(c), p);
            filas[p - 1].offer(r);
        }

        for (int i = 4; i >= 0; i--) {
            while (!filas[i].isEmpty()) {
                Registro r = filas[i].poll();
                System.out.print(r + " ");
            }
        }
        System.out.println();
    }

    public static void opcao2() {
        PriorityQueue<Registro> fila = new PriorityQueue<>(new RegistroComparator());

        Random rand = new Random(1);
        for (int i = 0; i < 30; i++) {
            int p = rand.nextInt(5) + 1;
            char c = (char) (rand.nextInt(26) + 'A');
            Registro r = new Registro(String.valueOf(c), p);
            fila.offer(r);
        }

        while (!fila.isEmpty()) {
            Registro r = fila.poll();
            System.out.print(r + " ");
        }
    }

    public static void main(String[] args) {
        opcao1();
        opcao2();
    }
}

class Registro {
    private String valor;
    private int prioridade;

    public Registro(String valor, int prioridade) {
        this.valor = valor;
        this.prioridade = prioridade;
    }

    public String getValor() {
        return valor;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return MessageFormat.format("({0},{1})", valor, prioridade);
    }
}

class RegistroComparator implements Comparator<Registro> {
    @Override
    public int compare(Registro o1, Registro o2) {
        if (o1.getPrioridade() < o2.getPrioridade()) {
            return 1;
        } else if (o1.getPrioridade() > o2.getPrioridade()) {
            return -1;
        } else {
            return 0;
        }
    }
}