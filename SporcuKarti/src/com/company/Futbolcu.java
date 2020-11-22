package com.company;

public class Futbolcu extends Sporcu {//child class

    private int penalti = 0;
    private int serbestAtis = 0;
    private int kaleciKarsiKarsiya = 0;

    public Futbolcu(String sporcuIsim, String sporcuTakim, int penalti, int serbestAtis, int kaleciKarsiKarsiya) {
        super(sporcuIsim, sporcuTakim);
        this.penalti = penalti;
        this.serbestAtis = serbestAtis;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    public Futbolcu() {
        super();
    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

}
