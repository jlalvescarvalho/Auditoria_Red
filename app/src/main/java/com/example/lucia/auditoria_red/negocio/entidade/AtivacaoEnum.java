package com.example.lucia.auditoria_red.negocio.entidade;

public enum AtivacaoEnum {

    repasse(2.0);

    private final double pontos;

    private AtivacaoEnum(double pontos){
        this.pontos = pontos;
    }

    public double getPontos(){
        return pontos;
    }
}
