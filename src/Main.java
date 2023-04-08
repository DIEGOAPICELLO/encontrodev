import entities.Enum.Categoria;
import entities.Enum.Unidade;
import entities.Produtos;
import entities.Services.Objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Produtos> produtoList = new ArrayList<>();
        List<Produtos> listaResposta = new ArrayList<>();
        List<Produtos> listaRespostaMaiorQMil = new ArrayList<>();

        Objeto obj = new Objeto();

        produtoList.add(obj.criarProduto("TV", 1500.00, Categoria.ELETRONICOS, Unidade.UN));
        produtoList.add(obj.criarProduto("NOTEBOOK", 1500.00, Categoria.ELETRONICOS, Unidade.UN));
        produtoList.add(obj.criarProduto("BATATA CONGELADA", 15.00, Categoria.CONGELADOS, Unidade.UN));
        produtoList.add(obj.criarProduto("VEJA", 15.00, Categoria.LIMPEZA, Unidade.UN));
        produtoList.add(obj.criarProduto("CAMISA", 59.00, Categoria.VESTUARIO, Unidade.UN));
        produtoList.add(obj.criarProduto("MOUSE", 59.00, Categoria.ELETRONICOS, Unidade.UN));
        produtoList.add(obj.criarProduto("MONITOR", 1240.00, Categoria.ELETRONICOS, Unidade.UN));
        produtoList.add(obj.criarProduto("CALCA", 150.00, Categoria.VESTUARIO, Unidade.UN));

        listaResposta = obj.buscarProdutosPorCategoria(produtoList, Categoria.ELETRONICOS);
        listaRespostaMaiorQMil = obj.buscarProdutosPorPreco(produtoList, 1000.00);

        obj.imprimeNaTelada(listaResposta, listaRespostaMaiorQMil);

    }
}