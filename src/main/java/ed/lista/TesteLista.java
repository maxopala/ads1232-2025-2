package ed.lista;

import java.util.Scanner;

public class TesteLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaVetor<String> l = new ListaVetor<>();
        ListaVetor<Integer> l2 = new ListaVetor<>();
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
