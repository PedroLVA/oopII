package exemplo.conversor.desafio;

public class RepositorioCliente extends RepositorioMemoria<Cliente> {
    @Override
    protected int getObjetoId(Cliente obj) {
        return obj.getId();
    }
}
