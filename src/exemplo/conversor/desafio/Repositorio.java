package exemplo.conversor.desafio;

import java.util.List;

interface Repositorio<T> {
    void salvar(T obj);
    T buscarPorId(int id);
    List<T> listarTodos();
}
