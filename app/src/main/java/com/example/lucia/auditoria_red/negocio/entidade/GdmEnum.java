package com.example.lucia.auditoria_red.negocio.entidade;


public enum GdmEnum {

    prim_posicao(3.0), Nao_invadida(2.0), abastecida(2.5), abastecida_colas(2.0), GDM_ssd(1.0),
    pratileira_Still(1.0), GDM_retornavel(1.5);

    private final double pontos;

    private GdmEnum(double pontos){
        this.pontos = pontos;
    }

    public double getPontos(){
        return pontos;
    }
}
