package exemplo.conversor.desafio;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioMemoria<T> implements Repositorio<T> {

    protected final List<T> itens = new ArrayList<>();

    protected abstract int getObjetoId(T obj);

    @Override
    public void salvar(T obj) {
        itens.add(obj);
    }

    @Override
    public T buscarPorId(int id) {
        for (T item : itens) {
            if (getObjetoId(item) == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(itens);
    }
}
