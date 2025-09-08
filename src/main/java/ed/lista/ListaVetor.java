package ed.lista;

public class ListaVetor<T> implements Lista<T> {
    Object[] v;
    int n;

    public ListaVetor() {
        this.n = 0;
        this.v = new Object[5000000];
    }

    @Override
    public void adicionar(T x) {
        this.v[this.n] = x;
        this.n++;

        // TODO vetor está cheio? Se estiver cheio, tem que redimensionar.
        // TODO Adicionar o valor x no vetor v
        // TODO n++
    }

    @Override
    public T obterElemento(int i) {
        return (T) this.v[i];
    }

    @Override
    public int quantidade() {
        return n;
    }

    @Override
    public Iterador<T> iterador() {
        return new IteradorVetor(v, n);
    }

    private class IteradorVetor implements Iterador<T> {
        private int i = 0;
        private int qtde;
        private Object[] vet;

        IteradorVetor(Object[] vet, int qtde) {
            this.vet = vet;
            this.qtde = qtde;
        }

        @Override
        public boolean hasNext() {
            return i < qtde;
        }

        @Override
        public T next() {
            T valor = (T) vet[i];
            i++;
            return valor;
        }
    }
}
