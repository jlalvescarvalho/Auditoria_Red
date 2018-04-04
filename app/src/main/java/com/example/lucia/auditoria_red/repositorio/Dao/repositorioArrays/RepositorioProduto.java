package com.example.lucia.auditoria_red.repositorio.Dao.repositorioArrays;


import java.util.ArrayList;

public class RepositorioProduto {

    private ArrayList<Enum> lista_SKUsEnum;


    public void adicionarListaCompleta(ArrayList<Enum> lista_respostas){
        this.lista_SKUsEnum = lista_respostas;
    }

    public void adicionarProdutoPesquisado(Enum produto){
        this.lista_SKUsEnum.add(produto);
    }

    public void removerItem(Enum item){
        if(this.lista_SKUsEnum.contains(item)){
            this.lista_SKUsEnum.remove(item);
        }
    }

    public ArrayList<Enum> getLista_SKUsEnum(){ return this.lista_SKUsEnum; }
}
