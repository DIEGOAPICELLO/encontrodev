package entities.Services;

import entities.Clientes;
import entities.Enum.Cidade;

import java.util.List;

public class CriarCliente {

    public Clientes criarCliente (String name, String email, String CPF, String telefone, Cidade cidade) {

        if (CPF.length() == 11) {

            Clientes clientes = new Clientes();
            clientes.setName(name);
            clientes.setEmail(email);
            clientes.setCPF(CPF);
            clientes.setTelefone(telefone);
            clientes.setCidade(cidade);

            return clientes;
        } else {
            System.out.println("O cliente : " + name + " está com o CPF invalido");
        }
        return new Clientes();
    }

    public List<Clientes> verificarListaClientes(List<Clientes> listaClientes) {

        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getName() == null) {
                listaClientes.remove(i);

            }
        }
        return listaClientes;
    }

    public void imprimeNaTelaClientes(List<Clientes> listaClientes) {

        System.out.println("Lista de clientes");

        for(int i = 0; i < listaClientes.size(); i++) {
            System.out.println(listaClientes.get(i).getName() + " , " +
                    listaClientes.get(i).getEmail() + " , " +
                    listaClientes.get(i).getCPF() + " , " +
                    listaClientes.get(i).getTelefone() + " , " +
                    listaClientes.get(i).getCidade());
        }
    }
}
