package entities.Services;

import entities.Enum.Categoria;
import entities.Enum.Unidade;
import entities.Produtos;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CriarProduto {

    public Produtos criarProduto(String name, double preco, Categoria cat, Unidade un) {

        if (preco < 0.0 ) {
            System.out.println("O produto:" + name + " possui um preco invalido");
            return new Produtos();

        } else {
            Produtos produtos = new Produtos();

            produtos.setName(name);
            produtos.setPreco(preco);
            produtos.setCategoria(cat);
            produtos.setUnidade(un);

            return produtos;
        }

    }

    public List<Produtos> buscarProdutosPorCategoria(List<Produtos> produtoList, Categoria cate) {

        List<Produtos> produtoList2 = new ArrayList<>();

        for (int i = 0; i < produtoList.size(); i++) {

            if (produtoList.get(i).getCategoria() == cate) {
                produtoList2.add(produtoList.get(i));

            }

        }
        return produtoList2;
    }

    public List<Produtos> buscarProdutosPorPreco(List<Produtos> produtosList, double preco) {

        List<Produtos> listaAtualizada = new ArrayList<>();

        for (int i = 0; i < produtosList.size(); i++) {

            if (produtosList.get(i).getPreco() > preco) {
                listaAtualizada.add(produtosList.get(i));

            }
        }

        return listaAtualizada;

    }

    public void imprimeNaTelada(List<Produtos>listaAtualizada,List<Produtos> listaRespostaMaiorQMil) {
        System.out.println("Impressão da lista de produtos da classe de eletronicas");

        for (int i = 0; i < listaAtualizada.size(); i++) {
            System.out.println(listaAtualizada.get(i).getName() + " , " + listaAtualizada.get(i).getPreco() + " , " + listaAtualizada.get(i).getCategoria());

        }
        System.out.println("Impressão da lista de produtos com valor maior que 1000,00");

        for (int i = 0; i < listaRespostaMaiorQMil.size(); i++) {
            System.out.println(listaRespostaMaiorQMil.get(i).getName() + " , " + listaRespostaMaiorQMil.get(i).getPreco());

        }
    }
}
