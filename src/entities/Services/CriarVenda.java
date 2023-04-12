package entities.Services;

import entities.VendaProduto;
import entities.Vendas;

import java.util.List;

public class CriarVenda {

    public void criarVenda(List<VendaProduto> vendaProdutoList) {

        double valorAux = 0;

        Vendas venda = new Vendas();

        for (int i = 0; i < vendaProdutoList.size(); i++) {

            vendaProdutoList.get(i).setValorProdutoFinal(vendaProdutoList.get(i).getQuantidade() * vendaProdutoList.get(i).getProdutos().getPreco());
            valorAux = valorAux + vendaProdutoList.get(i).getValorProdutoFinal();
            venda.setValorTotalCompra(valorAux);

        }
        System.out.println("**********************************");
        System.out.println("Valor total = " + venda.getValorTotalCompra());
    }

}
