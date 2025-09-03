package ed.lista;

public class MinhaListaGenerics<T> {
    Object[] v;
    int n;

    public MinhaListaGenerics() {
        this.n = 0;
        this.v = new Object[5000000];
    }

    public void adicionar(T x) {
        this.v[this.n] = x;
        this.n++;

        // TODO vetor está cheio? Se estiver cheio, tem que redimensionar.
        // TODO Adicionar o valor x no vetor v
        // TODO n++
    }

    public T obterElemento(int i) {
        return (T) this.v[i];
        // TODO retornar o elemento da posição i
    }

    public int quantidade() {
       // TODO retornar po tamanho da lista (quantidade de elementos inseridos|)
        return n;
    }
}
