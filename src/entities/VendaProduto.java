package entities;

public class VendaProduto {

    Produtos produtos;
    int quantidade;
    double valorProdutoFinal;

    public VendaProduto() {
    }

    public VendaProduto(Produtos produtos, int quantidade, double valorProdutoFinal) {
        this.produtos = produtos;
        this.quantidade = quantidade;
        this.valorProdutoFinal = valorProdutoFinal;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorProdutoFinal() {
        return valorProdutoFinal;
    }

    public void setValorProdutoFinal(double valorProdutoFinal) {
        this.valorProdutoFinal = valorProdutoFinal;
    }
}
