package entities;

import entities.Enum.Categoria;
import entities.Enum.Unidade;

public class Produtos {

    String name;
    double preco;
    Categoria categoria;
    Unidade unidade;

    public Produtos() {

    }

    public Produtos(String name, double preco, Categoria categoria, Unidade unidade) {
        this.name = name;
        this.preco = preco;
        this.categoria = categoria;
        this.unidade = unidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
}
