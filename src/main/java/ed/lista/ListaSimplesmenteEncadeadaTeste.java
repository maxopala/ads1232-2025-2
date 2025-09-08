package ed.lista;

public class ListaSimplesmenteEncadeadaTeste {
    public static void main(String[] args) {
        // Cria lista "a"
        ListaSimplesmenteEncadeada<Integer> a = new ListaSimplesmenteEncadeada<>();

        // Cria lista "b"
        ListaSimplesmenteEncadeada<Integer> b = new ListaSimplesmenteEncadeada<>();

        // Insere elementos na lista "a"
        a.inserirFim(5);
        a.inserirFim(15);
        a.inserirFim(8);
        a.inserirFim(13);
        a.inserirFim(90);
        a.inserirFim(42);
        a.inserirFim(7);

        // Insere elementos na lista "b"
        b.inserirFim(18);
        b.inserirFim(5);
        b.inserirFim(42);
        b.inserirFim(13);
        b.inserirFim(10);
        b.inserirFim(8);
        b.inserirFim(9);
        b.inserirFim(50);
        b.inserirFim(61);

        ListaSimplesmenteEncadeada<Integer> uniao = ListaSimplesmenteEncadeada.uniao(a, b);
        ListaSimplesmenteEncadeada<Integer> interseccao = ListaSimplesmenteEncadeada.interseccao(a, b);

        System.out.println("União");
        uniao.imprimir();

        System.out.println("Intersecção");
        interseccao.imprimir();
    }
}

