package entities;

import entities.Enum.MetodoPagamento;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Vendas {

    double valorTotalCompra, troco, desconto;
    LocalDateTime horario = LocalDateTime.now();

    MetodoPagamento metodoPagamento;
    List<VendaProduto> vendaProdutoLista;

    public Vendas() {
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public double getTroco() {
        return troco;
    }


    public double getDesconto() {
        return desconto;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public List<VendaProduto> getVendaProdutoLista() {
        return vendaProdutoLista;
    }

    public void setVendaProdutoLista(List<VendaProduto> vendaProdutoLista) {
        this.vendaProdutoLista = vendaProdutoLista;
    }
}
