package com.example.lucia.auditoria_red.negocio;

import com.example.lucia.auditoria_red.negocio.entidade.Produto;
import com.example.lucia.auditoria_red.repositorio.Dao.repositorioArrays.RepositorioPesquisa;
import com.example.lucia.auditoria_red.repositorio.Dao.repositorioArrays.RepositorioProduto;

public class NegocioProduto {

    private RepositorioProduto repositorioProduto;
    private static NegocioProduto mySelf;

    public NegocioProduto() {
        this.repositorioProduto = new RepositorioProduto();
    }

    public static NegocioProduto getInstace (){
        if(mySelf == null){
            mySelf = new NegocioProduto();
        }
        return mySelf;
    }


    public void cadastrarProduto(){
        
    }



}
