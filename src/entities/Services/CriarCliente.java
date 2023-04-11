package entities.Services;

import entities.Clientes;
import entities.Enum.Cidade;

import java.util.List;

public class CriarCliente {

    public Clientes criarCliente (String name, String email, String CPF, String telefone, Cidade cidade) {

        Clientes clientes = new Clientes();
        clientes.setName(name);
        clientes.setEmail(email);
        clientes.setCPF(CPF);
        clientes.setTelefone(telefone);
        clientes.setCidade(cidade);

        return clientes;
    }

    public void imprimeNaTelaClientes(List<Clientes> listaClientes) {

        System.out.println("Lista de clientes");

        for(int i = 0; i < listaClientes.size(); i++) {
            System.out.println(listaClientes.get(i).getName());
            System.out.println(listaClientes.get(i).getEmail());
            System.out.println(listaClientes.get(i).getCPF());
            System.out.println(listaClientes.get(i).getTelefone());
            System.out.println(listaClientes.get(i).getCidade());

        }

    }

}
