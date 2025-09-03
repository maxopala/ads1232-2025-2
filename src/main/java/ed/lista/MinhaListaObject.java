package ed.lista;

public class MinhaListaObject {
    Object[] v;
    int n;

    public MinhaListaObject() {
        this.n = 0;
        this.v = new Object[5];
    }

    public void adicionar(Object x) {
        // TODO vetor está cheio? Se estiver cheio, tem que redimensionar.
        // TODO Adicionar o valor x no vetor v
        // TODO n++
    }

    public Object obterElemento(int i) {
        // TODO retornar o elemento da posição i
        return null;
    }

    public int quantidade() {
        return n;
       // TODO retornar po tamanho da lista (quantidade de elementos inseridos|)
    }
}
