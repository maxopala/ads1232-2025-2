package ed.lista;

import java.util.Scanner;

public class TesteListaEncadeada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaEncadeada<String> l = new ListaEncadeada<>();
//        MinhaListaGenerics<String> l = new MinhaListaGenerics<>();

//        int x;
//        while ((x = sc.nextInt()) != 0) {
//            l.adicionar("nUmErO " + x);
//        }

        for (int i = 0; i < 100000; i++) {
            l.adicionar("nUmErO " + i);
        }

        long inicio = System.currentTimeMillis();
        l.imprimir();
//        for (int i = 0; i < l.quantidade(); i++) {
//            String s = l.obterElemento(i);
//
//            s = s.toUpperCase();
//
//            System.out.println(s);
//        }
        long fim = System.currentTimeMillis();
        System.out.println(fim - inicio);
    }
}
