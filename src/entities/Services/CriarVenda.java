package entities.Services;

import entities.VendaProduto;
import entities.Vendas;

import java.time.format.DateTimeFormatter;
import java.util.List;

import static entities.Enum.MetodoPagamento.*;

public class CriarVenda {

    public void criarVenda(List<VendaProduto> vendaProdutoList) {

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        double valorAux = 0;

        Vendas venda = new Vendas();

        for (int i = 0; i < vendaProdutoList.size(); i++) {

            vendaProdutoList.get(i).setValorProdutoFinal(vendaProdutoList.get(i).getQuantidade() * vendaProdutoList.get(i).getProdutos().getPreco());
            valorAux = valorAux + vendaProdutoList.get(i).getValorProdutoFinal();
            venda.setValorTotalCompra(valorAux);

        }

        System.out.println("**********************************");
        System.out.println((String.format("Valor total = R$" + venda.getValorTotalCompra() +
                " Forma de pagamento: " + DINHEIRO +
                " Horário da venda: " + venda.getHorario().format(dt))));

        System.out.println("**********************************");
        System.out.println("Valor Total: R$" + verificarValorDesconto(valorAux) + " Horário: " + venda.getHorario().format(dt));

    }

    private double verificarValorDesconto(double valorAux) {

        if (valorAux > 1000.0 && valorAux < 3000.0)
            valorAux -= valorAux * 0.1;

        else if (valorAux > 3000.0 && valorAux < 5000.00)
             valorAux -= valorAux * 0.2;

        else if (valorAux > 5000.0)
             valorAux -= valorAux * 0.3;
        else
             System.out.println("Sem desconto ");

        return valorAux;
    }
}
