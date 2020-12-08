/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2;

/**
 *
 * @author alperentan
 */
public class Futbolcu extends Sporcu {//child class

    int penalti = 0;
    int serbestAtis = 0;
    int kaleciKarsiKarsiya = 0;

    public Futbolcu() {
        super();
    }

    public Futbolcu(String sporcuIsim, String sporcuTakim, int penalti, int serbestAtis, int kaleciKarsiKarsiya) {
        super(sporcuIsim, sporcuTakim);
        this.penalti = penalti;
        this.serbestAtis = serbestAtis;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
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
