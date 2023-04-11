import entities.Clientes;
import entities.Enum.Categoria;
import entities.Enum.Cidade;
import entities.Enum.Unidade;
import entities.Produtos;
import entities.Services.CriarCliente;
import entities.Services.CriarProduto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produtos> produtoList = new ArrayList<>();
        List<Produtos> listaResposta = new ArrayList<>();
        List<Produtos> listaRespostaMaiorQMil = new ArrayList<>();
        List<Clientes> listaClientes = new ArrayList<>();
        
        CriarProduto CriarProduto = new CriarProduto();
        CriarCliente criarCliente = new CriarCliente();

        produtoList.add(CriarProduto.criarProduto("TV", 1500.00, Categoria.ELETRONICOS, Unidade.UN));
        produtoList.add(CriarProduto.criarProduto("NOTEBOOK", 1500.00, Categoria.ELETRONICOS, Unidade.UN));
        produtoList.add(CriarProduto.criarProduto("BATATA CONGELADA", 15.00, Categoria.CONGELADOS, Unidade.UN));
        produtoList.add(CriarProduto.criarProduto("VEJA", 15.00, Categoria.LIMPEZA, Unidade.UN));
        produtoList.add(CriarProduto.criarProduto("CAMISA", 59.00, Categoria.VESTUARIO, Unidade.UN));
        produtoList.add(CriarProduto.criarProduto("MOUSE", 59.00, Categoria.ELETRONICOS, Unidade.UN));
        produtoList.add(CriarProduto.criarProduto("MONITOR", 1240.00, Categoria.ELETRONICOS, Unidade.UN));
        produtoList.add(CriarProduto.criarProduto("CALCA", 150.00, Categoria.VESTUARIO, Unidade.UN));

        listaResposta = CriarProduto.buscarProdutosPorCategoria(produtoList, Categoria.ELETRONICOS);
        listaRespostaMaiorQMil = CriarProduto.buscarProdutosPorPreco(produtoList, 1000.00);

        CriarProduto.imprimeNaTelada(listaResposta, listaRespostaMaiorQMil);

        listaClientes.add(criarCliente.criarCliente("João Portella", "joaoPortella@teste.com", "11111111111","229999999", Cidade.CABOFRIO));
        listaClientes.add(criarCliente.criarCliente("Diego Apicello", "diegoapicello@teste.com", "2222222222","228888888", Cidade.RIODEJANEIRO));
        listaClientes.add(criarCliente.criarCliente("Matheus Adms", "matheusadms@teste.com", "33333333333","227777777", Cidade.SAOPAULO));
        listaClientes.add(criarCliente.criarCliente("Cliente Padrao", "clientepadrao@teste.com", "4444444444","226666660", Cidade.MINAS));

        criarCliente.imprimeNaTelaClientes(listaClientes);

    }
}