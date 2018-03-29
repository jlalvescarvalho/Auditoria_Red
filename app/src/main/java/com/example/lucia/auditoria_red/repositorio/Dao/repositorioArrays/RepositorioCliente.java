package com.example.lucia.auditoria_red.repositorio.Dao.repositorioArrays;

import com.example.lucia.auditoria_red.negocio.entidade.Cliente;

import java.util.ArrayList;

public class RepositorioCliente {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();


    public void cadastrar(Cliente cliente){
        this.listaClientes.add(cliente);
    }

    public ArrayList<Cliente> recuperarTodos(){
        return this.listaClientes;
    }

    public Cliente recuperar(int codigo){
        for (Cliente c: listaClientes){
            if(c.getCodigo() == codigo){
                return c;
            }
        }
        return null;
    }

    public int deletar(Cliente cliente){
        for (Cliente c: listaClientes){
            if (c.getCodigo() == cliente.getCodigo()){
                listaClientes.remove(c);
                return 0;
            }
        }
        return 1;
    }
}
