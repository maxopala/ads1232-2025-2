package ed.lista;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MinhaListaGenerics<String> l = new MinhaListaGenerics<>();
        MinhaListaGenerics<Integer> l2 = new MinhaListaGenerics<>();
//        ArrayList a = new ArrayList();

        int x;
        while ((x = sc.nextInt()) != 0) {
            l.adicionar("teste " + x);
            l2.adicionar(x);
//            a.add(x);
        }

        for (int i = 0; i < l.quantidade(); i++) {
            String s = (String) l.obterElemento(i);

            s = s.toUpperCase();

            System.out.println(s);
//            System.out.println(a.get(i));
        }
    }
}
