package ed.lista;

public class ListaSimplesmenteEncadeada<T> {

    private No ini;
    private No fim;
    private int n;

    private class No {
        T valor;
        No proximo;

        No(T valor, No proximo) {
            this.valor = valor;
            this.proximo = proximo;
        }
    }

    public void inserirFim(T valor) {
        if (this.ini == null) {
            this.ini = new No(valor, null);
            this.fim = this.ini;
        } else {
            fim.proximo = new No(valor, null);
            fim = fim.proximo;
        }
        n++;
    }

    public T getElemento(int i) {
        No p = this.ini;
        for (int k = 0; k < i; k++) {
            p = p.proximo;
        }
        return p.valor;
    }

    int tamanho() {
        return n;
    }

    void imprimir() {
        No p = this.ini;
        while (p != null) {
            System.out.println(p.valor);
            p = p.proximo;
        }
    }

    public static <TIPO> ListaSimplesmenteEncadeada<TIPO> uniao(ListaSimplesmenteEncadeada<TIPO> a, ListaSimplesmenteEncadeada<TIPO> b) {
        /* TODO
         * Implementar esse método estático que recebe duas listas simplesmente encadeadas "a" e "b"
         * e retorna uma OUTRA lista simplesmente encadeada que tenha todos os elementos que aparecem na lista "a"
         * e/ou na lista "b", sem repetições.
         * Em seu algoritmo, considere que dentro da lista "a" não tem elementos repetidos e dentro da lista "b" também
         * não tem elementos repetidos. Evidentemente, podem haver elementos que aparecem nas duas listas. Esses deverão
         * aparecer uma única vez na lista de saída.
         * Exemplo:
         *
         * a = { 5, 15, 8, 13, 90, 42, 7 }
         * b = { 18, 5, 42, 13, 10, 8, 9, 50, 61 }
         * retorno = { 5, 15, 8, 13, 90, 42, 7, 18, 10, 9, 50, 61 }
         */
        return null;
    }

    public static <TIPO> ListaSimplesmenteEncadeada<TIPO> interseccao(ListaSimplesmenteEncadeada<TIPO> a, ListaSimplesmenteEncadeada<TIPO> b) {
        /* TODO
         * Implementar esse método estático que recebe duas listas simplesmente encadeadas "a" e "b"
         * e retorna uma OUTRA lista simplesmente encadeada que tenha os elementos que aparecem na lista "a" e que
         * aparecem na lista "b", sem repetições, deixando de fora os que aparecem em apenas uma das listas.
         * Em seu algoritmo, considere que dentro da lista "a" não tem elementos repetidos e dentro da lista "b" também
         * não tem elementos repetidos. Evidentemente, podem haver elementos que aparecem nas duas listas. São justamente
         * esses que devem aparecer na lista de saída.
         * Exemplo:
         *
         * a = { 5, 15, 8, 13, 90, 42, 7 }
         * b = { 18, 5, 42, 13, 10, 8, 9, 50, 61 }
         * retorno = { 5, 8, 13, 42 }
         */
        return null;
    }
}

