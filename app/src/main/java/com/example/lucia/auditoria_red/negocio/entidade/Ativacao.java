package com.example.lucia.auditoria_red.negocio.entidade;


import java.util.ArrayList;
import java.util.List;

public class Ativacao {

    private ArrayList<Enum> listaAtivacao;

    public Ativacao() {
        this.listaAtivacao = new ArrayList<>();
    }

    public void adicionarListaCompleta(ArrayList<Enum> listaAtivacao) {
        this.listaAtivacao = listaAtivacao;
    }

    public void adicionarAtivacao(Enum ativacao){
        this.listaAtivacao.add(ativacao);
    }

    public void removerItem(Enum item){
        if(this.listaAtivacao.contains(item)){
            this.listaAtivacao.remove(item);
        }
    }

    public ArrayList<Enum> getListaAtivacao(){
        return this.listaAtivacao;
    }
}
