package com.example.lucia.auditoria_red.negocio.entidade;


import java.util.ArrayList;
import java.util.Date;

public class Pesquisa {

   private Date date;
   private Cliente cliente;
   private Ativacao ativacao;
   private Produto produto;

    public Pesquisa(Date date, Cliente cliente, Ativacao ativacao, Produto produto) {
        this.date = date;
        this.cliente = cliente;
        this.ativacao = ativacao;
        this.produto = produto;
    }

    public Date getDate() {
        return date;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Ativacao getAtivacao() {
        return ativacao;
    }

    public Produto getProduto() {
        return produto;
    }
}
