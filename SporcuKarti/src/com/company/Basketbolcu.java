package com.company;

public class Basketbolcu extends Sporcu {//child class

    private int ikilik = 0;
    private int ucluk = 0;
    private int serbestAtis = 0;

    public Basketbolcu(String sporcuIsim, String sporcuTakim, int ikilik, int ucluk, int serbestAtis) {
        super(sporcuIsim, sporcuTakim);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
    }

    public Basketbolcu() {
        super();
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

}
