package ed.lista;

public class ListaEncadeada<T> {

    private No ini;
    private No fim;
    private int n;

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

    public void inserirFim(T valor) {
        if (this.ini == null) {
            this.ini = new No(valor);
            this.fim = this.ini;
        } else {
            fim.proximo = new No(valor);
            fim = fim.proximo;
        }
        n++;
    }

    public void
}

