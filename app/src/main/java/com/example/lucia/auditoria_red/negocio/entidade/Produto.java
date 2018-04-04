package com.example.lucia.auditoria_red.negocio.entidade;


import java.util.ArrayList;

public class Produto {

    private double aguaInd;
    private double aguaFam;
    private double cervejaLata;
    private double cerveja600;
    private double CC_mineLata_miniPet;
    private double CCZ_mineLata_miniPet;
    private double Sabores_mineLata_MinePet;
    private double Fanta_2L;
    private double Fanta_Guar2L;
    private double CC_2L;
    private double Kuat_e_Sprite2L;
    private double Sabores_retornaveis;
    private double ImperdoaveisStill;
    private double ImperdoaveisSSD;
    private double DVF_ind;
    private double DVF_Fam;
    private double CC_Lata;
    private double CC_refpet;
    private double CC_Ls;
    private double Kapo;


    public Produto(double aguaInd, double aguaFam, double cervejaLata, double cerveja600, double CC_mineLata_miniPet,
                   double CCZ_mineLata_miniPet, double sabores_mineLata_MinePet, double fanta_2L, double fanta_Guar2L,
                   double CC_2L, double kuat_e_Sprite2L, double sabores_retornaveis, double imperdoaveisStill, double imperdoaveisSSD,
                   double DVF_ind, double DVF_Fam, double CC_Lata, double CC_refpet, double CC_Ls, double kapo) {
        this.aguaInd = aguaInd;
        this.aguaFam = aguaFam;
        this.cervejaLata = cervejaLata;
        this.cerveja600 = cerveja600;
        this.CC_mineLata_miniPet = CC_mineLata_miniPet;
        this.CCZ_mineLata_miniPet = CCZ_mineLata_miniPet;
        this.Sabores_mineLata_MinePet = sabores_mineLata_MinePet;
        this.Fanta_2L = fanta_2L;
        this.Fanta_Guar2L = fanta_Guar2L;
        this.CC_2L = CC_2L;
        this.Kuat_e_Sprite2L = kuat_e_Sprite2L;
        this.Sabores_retornaveis = sabores_retornaveis;
        this.ImperdoaveisStill = imperdoaveisStill;
        this.ImperdoaveisSSD = imperdoaveisSSD;
        this.DVF_ind = DVF_ind;
        this.DVF_Fam = DVF_Fam;
        this.CC_Lata = CC_Lata;
        this.CC_refpet = CC_refpet;
        this.CC_Ls = CC_Ls;
        this.Kapo = kapo;
    }

    public double getAguaInd() {
        return aguaInd;
    }

    public void setAguaInd(double aguaInd) {
        this.aguaInd = aguaInd;
    }

    public double getAguaFam() {
        return aguaFam;
    }

    public void setAguaFam(double aguaFam) {
        this.aguaFam = aguaFam;
    }

    public double getCervejaLata() {
        return cervejaLata;
    }

    public void setCervejaLata(double cervejaLata) {
        this.cervejaLata = cervejaLata;
    }

    public double getCerveja600() {
        return cerveja600;
    }

    public void setCerveja600(double cerveja600) {
        this.cerveja600 = cerveja600;
    }

    public double getCC_mineLata_miniPet() {
        return CC_mineLata_miniPet;
    }

    public void setCC_mineLata_miniPet(double CC_mineLata_miniPet) {
        this.CC_mineLata_miniPet = CC_mineLata_miniPet;
    }

    public double getCCZ_mineLata_miniPet() {
        return CCZ_mineLata_miniPet;
    }

    public void setCCZ_mineLata_miniPet(double CCZ_mineLata_miniPet) {
        this.CCZ_mineLata_miniPet = CCZ_mineLata_miniPet;
    }

    public double getSabores_mineLata_MinePet() {
        return Sabores_mineLata_MinePet;
    }

    public void setSabores_mineLata_MinePet(double sabores_mineLata_MinePet) {
        Sabores_mineLata_MinePet = sabores_mineLata_MinePet;
    }

    public double getFanta_2L() {
        return Fanta_2L;
    }

    public void setFanta_2L(double fanta_2L) {
        Fanta_2L = fanta_2L;
    }

    public double getFanta_Guar2L() {
        return Fanta_Guar2L;
    }

    public void setFanta_Guar2L(double fanta_Guar2L) {
        Fanta_Guar2L = fanta_Guar2L;
    }

    public double getCC_2L() {
        return CC_2L;
    }

    public void setCC_2L(double CC_2L) {
        this.CC_2L = CC_2L;
    }

    public double getKuat_e_Sprite2L() {
        return Kuat_e_Sprite2L;
    }

    public void setKuat_e_Sprite2L(double kuat_e_Sprite2L) {
        Kuat_e_Sprite2L = kuat_e_Sprite2L;
    }

    public double getSabores_retornaveis() {
        return Sabores_retornaveis;
    }

    public void setSabores_retornaveis(double sabores_retornaveis) {
        Sabores_retornaveis = sabores_retornaveis;
    }

    public double getImperdoaveisStill() {
        return ImperdoaveisStill;
    }

    public void setImperdoaveisStill(double imperdoaveisStill) {
        ImperdoaveisStill = imperdoaveisStill;
    }

    public double getImperdoaveisSSD() {
        return ImperdoaveisSSD;
    }

    public void setImperdoaveisSSD(double imperdoaveisSSD) {
        ImperdoaveisSSD = imperdoaveisSSD;
    }

    public double getDVF_ind() {
        return DVF_ind;
    }

    public void setDVF_ind(double DVF_ind) {
        this.DVF_ind = DVF_ind;
    }

    public double getDVF_Fam() {
        return DVF_Fam;
    }

    public void setDVF_Fam(double DVF_Fam) {
        this.DVF_Fam = DVF_Fam;
    }

    public double getCC_Lata() {
        return CC_Lata;
    }

    public void setCC_Lata(double CC_Lata) {
        this.CC_Lata = CC_Lata;
    }

    public double getCC_refpet() {
        return CC_refpet;
    }

    public void setCC_refpet(double CC_refpet) {
        this.CC_refpet = CC_refpet;
    }

    public double getCC_Ls() {
        return CC_Ls;
    }

    public void setCC_Ls(double CC_Ls) {
        this.CC_Ls = CC_Ls;
    }

    public double getKapo() {
        return Kapo;
    }

    public void setKapo(double kapo) {
        Kapo = kapo;
    }
}
