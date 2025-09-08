package ed.lista;

public interface Lista<T> {
    void adicionar(T valor);

    T obterElemento(int i);

    int quantidade();

    Iterador<T> iterador();
}
