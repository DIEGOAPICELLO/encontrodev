package entities;

import entities.Enum.Cidade;

public class Clientes {

    String name, email, CPF, telefone;
    Cidade cidade;

    public Clientes() {

    }

    public Clientes(String name, String email, String CPF, String telefone, Cidade cidade) {
        this.name = name;
        this.email = email;
        this.CPF = CPF;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
