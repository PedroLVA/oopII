package exemplo.conversor.desafio;

public class RepositorioProduto extends RepositorioMemoria<Produto> {
    @Override
    protected int getObjetoId(Produto obj) {
        return obj.getId();
    }
}
