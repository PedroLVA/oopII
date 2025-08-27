package exemplo.conversor.desafio;

public class MainDesafio {
    public static void main(String[] args) {
        Repositorio<Produto> repositorioProduto = new RepositorioProduto();

        repositorioProduto.salvar(new Produto(1, "Notebook Gamer", 4500.00));
        repositorioProduto.salvar(new Produto(2, "Mouse Sem Fio", 150.00));

        System.out.println("--- Produtoss ---");
        System.out.println("Buscando produto com ID 1:" + repositorioProduto.buscarPorId(1));
        System.out.println("Listando todos os produtos: " + repositorioProduto.listarTodos());

        System.out.println("\n-----------------------------------\n");

        Repositorio<Cliente> repositorioCliente = new RepositorioCliente();

        repositorioCliente.salvar(new Cliente(101, "Carlos Silva", "carlos.silva@hotmail"));
        repositorioCliente.salvar(new Cliente(102, "Ana Pereira", "ana.pereira@gmail"));

        System.out.println("--- Clientes ---");
        System.out.println("Buscando cliente com ID 102: " + repositorioCliente.buscarPorId(102));
        System.out.println("Listando todos os clientes: " + repositorioCliente.listarTodos());
    }
}
