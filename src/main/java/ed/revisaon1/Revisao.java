package ed.revisaon1;

import java.time.LocalDate;
import java.util.*;

public class Revisao {
    static void testeLinkedList() {
        System.out.println("==========================================");
        System.out.println("testeLinkedList");
        System.out.println("==========================================");
        testeList(new LinkedList<>());
        System.out.println("==========================================");
    }

    static void testeArrayList() {
        System.out.println("==========================================");
        System.out.println("testeArrayList");
        System.out.println("==========================================");
        testeList(new ArrayList<>());
        System.out.println("==========================================");
    }

    static void testeList(List<String> lista) {
        char c = 'A';
        for (int i = 0; i < 3; i++) {
            lista.add(String.valueOf(c));
            c++;
        }
        System.out.println(lista);
        for (int i = 0; i < 3; i++) {
            lista.addFirst(String.valueOf(c));
            c++;
        }
        System.out.println(lista);
        for (int i = 0; i < 3; i++) {
            int k = 3 + i;
            lista.add(k, String.valueOf(c));
            c++;
        }
        System.out.println(lista);
        for (int i = 0; i < 2; i++) {
            String x = lista.removeFirst();
            System.out.println("Removido: " + x);
        }
        System.out.println(lista);
        for (int i = 0; i < 2; i++) {
            String x = lista.removeLast();
            System.out.println("Removido: " + x);
        }
        System.out.println(lista);
        String x = lista.remove(2);
        System.out.println("Removido: " + x);
        System.out.println(lista);
    }

    static void testeListPerformanceLinkedList() {
        System.out.println("==========================================");
        System.out.println("testeListPerformanceLinkedList");
        System.out.println("==========================================");
        testeListPerformance(new LinkedList<>());
        System.out.println("==========================================");
    }

    static void testeListPerformanceArrayList() {
        System.out.println("==========================================");
        System.out.println("testeListPerformanceArrayList");
        System.out.println("==========================================");
        testeListPerformance(new ArrayList<>());
        System.out.println("==========================================");
    }

    static void testeListPerformance(List<Integer> lista) {
        long ini = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            lista.addFirst(i);
        }
        long fin = System.currentTimeMillis();
        long dif = fin - ini;
        System.out.println("Tempo: " + dif + "ms");
    }

    static void testePilha() {
        System.out.println("==========================================");
        System.out.println("testePilha");
        System.out.println("==========================================");

        Stack<String> p = new Stack<>();

        char c = 'A';
        for (int i = 0; i < 3; i++) {
            p.push(String.valueOf(c));
            c++;
        }
        System.out.println(p);
        System.out.println("Topo: " + p.peek());
        System.out.println(p);
        for (int i = 0; i < 2; i++) {
            String x = p.pop();
            System.out.println("Removido: " + x);
        }
        System.out.println(p);
        System.out.println("==========================================");
    }

    static void testeFila() {
        System.out.println("==========================================");
        System.out.println("testeFila");
        System.out.println("==========================================");

        Queue<String> f = new LinkedList<>();

        char c = 'A';
        for (int i = 0; i < 3; i++) {
            f.offer(String.valueOf(c));
            c++;
        }
        System.out.println(f);
        System.out.println("Inicio Fila: " + f.peek());
        System.out.println(f);
        for (int i = 0; i < 2; i++) {
            String x = f.poll();
            System.out.println("Removido: " + x);
        }
        System.out.println(f);
        System.out.println("==========================================");
    }

    static void testeFilaPrioridade() {
        class Cliente {
            String cpf;
            String nome;
            LocalDate dataNascimento;
            char tipoAtendimento; // F ou J

            public Cliente(String cpf, LocalDate dataNascimento, char tipoAtendimento) {
                this.cpf = cpf;
                this.dataNascimento = dataNascimento;
                this.tipoAtendimento = tipoAtendimento;
            }

            boolean is60() {
                return this.dataNascimento.isBefore(LocalDate.now().minusYears(60));
            }

            @Override
            public String toString() {
                return "(" + cpf + "," + is60() + "," + tipoAtendimento + ")";
            }
        }

        class ComparadorCliente implements Comparator<Cliente> {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                boolean o160 = o1.is60();
                boolean o260 = o2.is60();
                if (o160 && !o260) {
                    return -1;
                }
                if (!o160 && o260) {
                    return 1;
                }
                if (o1.tipoAtendimento == 'J' && o2.tipoAtendimento == 'F') {
                    return -1;
                }
                if (o1.tipoAtendimento == 'F' && o2.tipoAtendimento == 'J') {
                    return 1;
                }
                return 0;
            }
        }

        System.out.println("==========================================");
        System.out.println("testeFilaPrioridade");
        System.out.println("==========================================");

        PriorityQueue<Cliente> f = new PriorityQueue<>(new ComparadorCliente());

        Random r = new Random(1);
        for (int i = 0; i < 10; i++) {
            LocalDate dt = LocalDate.now().minusYears(r.nextInt(60) + 30);
            Cliente cli = new Cliente(String.valueOf(i), dt, (char) (r.nextBoolean() ? 'F' : 'J'));
            f.offer(cli);
            System.out.println(cli + " -> " + f);
        }
        System.out.println(f);
        System.out.println("==========================================");
    }

    public static void main(String[] args) {
//        testeArrayList();
//        testeLinkedList();
//        testeListPerformanceArrayList();
//        testeListPerformanceLinkedList();
//        testePilha();
//        testeFila();
        testeFilaPrioridade();
    }
}
