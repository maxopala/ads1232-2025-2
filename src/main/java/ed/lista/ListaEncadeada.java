package ed.lista;

public class ListaEncadeada<T> implements Lista<T> {

    private No ini;
    private No fim;
    private int n;

    public class IteradorListaEncadeada implements Iterador<T> {
        private No p;

        IteradorListaEncadeada(No p) {
            this.p = p;
        }

        @Override
        public boolean hasNext() {
            return p != null;
        }

        @Override
        public T next() {
            T v = p.valor;
            p = p.proximo;
            return v;
        }
    }

    private class No {
        T valor;
        No proximo;

        No(T valor) {
            this.valor = valor;
        }

        No(T valor, No proximo) {
            this.valor = valor;
            this.proximo = proximo;
        }
    }

    public void inserirIni(T valor) {
        if (this.ini == null) {
            this.ini = new No(valor);
            this.fim = this.ini;
        } else {
            No x = new No(valor, this.ini);
            this.ini = x;
        }
        n++;
    }

    @Override
    public void adicionar(T valor) {
        if (this.ini == null) {
            this.ini = new No(valor);
            this.fim = this.ini;
        } else {
            fim.proximo = new No(valor);
            fim = fim.proximo;
        }
        n++;
    }

    public void inserirEm(T valor, int i) {
        if (i == 0) {
            inserirIni(valor);
        } else {
            No x = new No(valor);

            No p = ini;
            for (int k = 1; k < i; k++) {
                p = p.proximo;
            }
            x.proximo = p.proximo;
            p.proximo = x;
            n++;
        }
    }

    @Override
    public T obterElemento(int i) {
        No p = this.ini;
        for (int k = 0; k < i; k++) {
            p = p.proximo;
        }
        return p.valor;
    }

    @Override
    public int quantidade() {
        return n;
    }

    void imprimir() {
        No p = this.ini;
        while (p != null) {
            System.out.println(p.valor);
            p = p.proximo;
        }
    }

    @Override
    public Iterador<T> iterador() {
        return new IteradorListaEncadeada(this.ini);
    }
}

