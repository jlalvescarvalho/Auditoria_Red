package com.example.lucia.auditoria_red.negocio.entidade;


public enum PortifolioEnum {

    aguaInd(0.5), aguaFam(1.0), cervejaLata(1.5), cerveja600(2.0), CC_mineLata_miniPet(0.5), CCZ_mineLata_miniPet(0.8), Sabores_mineLata_MinePet(1.0),
    Fanta_2L(2.0), Fanta_Guar2L(2.0), CC_2L(0.5), Kuat_e_Sprite2L(1.0), Sabores_retornaveis(2.0), ImperdoaveisStill(3.4), ImperdoaveisSSD(11.5), DVF_ind(1.1),
    DVF_Fam(0.5), CC_Lata(2.2), CC_refpet(0.5), CC_Ls(0.5), Kapo(0.5);

    private final double pontos;

    private PortifolioEnum(double pontos){
        this.pontos = pontos;
    }

    public double getPontos(){
        return pontos;
    }
}
