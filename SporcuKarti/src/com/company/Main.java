package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static void karsilastir(Bilgisayar pc,Kullanici kul,int sira,int kartidpc,int kartidkul){
        Random r=new Random();
        int pozisyon=r.nextInt(3);
        if (sira%2 == 0) {
            Futbolcu fpc=pc.fList.get(kartidpc);
            Futbolcu fkul=kul.fList.get(kartidkul);
            if (pozisyon == 0) {

                if (fpc.getKaleciKarsiKarsiya() > fkul.getKaleciKarsiKarsiya()) {
                    pc.setSkor(pc.getSkor()+1);
                    kul.fList.remove(kartidkul);
                    pc.fList.remove(kartidpc);
                    pc.futboladim--;
                }
                else if (fpc.getKaleciKarsiKarsiya() < fkul.getKaleciKarsiKarsiya()) {
                    kul.setSkor(kul.getSkor()+1);
                    kul.fList.remove(kartidkul);
                    pc.fList.remove(kartidpc);
                    pc.futboladim--;
                }
            }
            else if (pozisyon == 1) {
                if (fpc.getPenalti() > fkul.getPenalti()) {
                    pc.setSkor(pc.getSkor()+1);
                    kul.fList.remove(kartidkul);
                    pc.fList.remove(kartidpc);
                    pc.futboladim--;
                }
                else if (fpc.getPenalti() < fkul.getPenalti()) {
                    kul.setSkor(kul.getSkor()+1);
                    kul.fList.remove(kartidkul);
                    pc.fList.remove(kartidpc);
                    pc.futboladim--;
                }
            }
            else {
                if (fpc.getSerbestAtis() > fkul.getSerbestAtis()) {
                    pc.setSkor(pc.getSkor()+1);
                    kul.fList.remove(kartidkul);
                    pc.fList.remove(kartidpc);
                    pc.futboladim--;
                }
                else if (fpc.getSerbestAtis() < fkul.getSerbestAtis()) {
                    kul.setSkor(kul.getSkor()+1);
                    kul.fList.remove(kartidkul);
                    pc.fList.remove(kartidpc);
                    pc.futboladim--;
                }
            }
        }
        else{
            Basketbolcu bpc=pc.bList.get(kartidpc);
            Basketbolcu bkul=kul.bList.get(kartidkul);
            if (pozisyon == 0) {
                if (bpc.getIkilik()>bkul.getIkilik()) {
                    pc.setSkor(pc.getSkor()+1);
                    kul.bList.remove(kartidkul);
                    pc.bList.remove(kartidpc);
                    pc.basketboladim--;
                }
                else if (bpc.getIkilik()<bkul.getIkilik()) {
                    kul.setSkor(kul.getSkor()+1);
                    kul.bList.remove(kartidkul);
                    pc.bList.remove(kartidpc);
                    pc.basketboladim--;
                }
            }
            else if (pozisyon == 1) {
                if (bpc.getUcluk() > bkul.getUcluk()) {
                    pc.setSkor(pc.getSkor()+1);
                    kul.bList.remove(kartidkul);
                    pc.bList.remove(kartidpc);
                    pc.basketboladim--;
                }
                else if (bpc.getUcluk() < bkul.getUcluk()) {
                    kul.setSkor(kul.getSkor()+1);
                    kul.bList.remove(kartidkul);
                    pc.bList.remove(kartidpc);
                    pc.basketboladim--;
                }
            }
            else {
                if (bpc.getSerbestAtis() > bkul.getSerbestAtis()) {
                    pc.setSkor(pc.getSkor()+1);
                    kul.bList.remove(kartidkul);
                    pc.bList.remove(kartidpc);
                    pc.basketboladim--;
                }
                else if (bpc.getSerbestAtis() < bkul.getSerbestAtis()) {
                    kul.setSkor(kul.getSkor()+1);
                    kul.bList.remove(kartidkul);
                    pc.bList.remove(kartidpc);
                    pc.basketboladim--;
                }
            }
        }
    }
    static void kartDagit(Bilgisayar pc,Kullanici kul,ArrayList<Futbolcu> futbolcu,ArrayList<Basketbolcu> basketbolcu){
        int ind=7;
        Random r=new Random();
        for (int i = 0; i < 4 ; i++) {
            int ata=r.nextInt(ind);
            pc.fList.add(futbolcu.get(ind));
            futbolcu.remove(ind);
            ind--;
        }
        for (int i = 0; i < 4; i++) {
            kul.fList.add(futbolcu.get(ind));
            futbolcu.remove(ind);
            ind--;
        }
        ind=7;
        for (int i = 0; i < 4 ; i++) {
            int ata=r.nextInt(ind);
            pc.bList.add(basketbolcu.get(ind));
            basketbolcu.remove(ind);
            ind--;
        }
        for (int i = 0; i < 4; i++) {
            kul.bList.add(basketbolcu.get(ind));
            basketbolcu.remove(ind);
            ind--;
        }
    }
    public static void main(String[] args) {

        Bilgisayar bilgisayar=new Bilgisayar(2,"Bilgisayar",0);
        Kullanici oyuncu=new Kullanici(1);

        ArrayList<Futbolcu> futbolcu=new ArrayList<Futbolcu>();
        ArrayList<Basketbolcu> basketbolcu=new ArrayList<Basketbolcu>();

        Futbolcu F1 = new Futbolcu("Cristiano Ronaldo", "Juventus FC", 95, 85, 90);
        Futbolcu F2 = new Futbolcu("Lionel Messi", "FC Barcelona", 95, 90, 85);
        Futbolcu F3 = new Futbolcu("Antoine Griezmann", "FC Barcelona", 85, 75, 80);
        Futbolcu F4 = new Futbolcu("Sergio Ramos", "Real Madrid CF", 85, 75, 85);
        Futbolcu F5 = new Futbolcu("Paulo Dybala", "Juventus FC", 80, 80, 85);
        Futbolcu F6 = new Futbolcu("Robert Lewandowski", "FC Bayern München", 90, 90, 80);
        Futbolcu F7 = new Futbolcu("Kylian Mbappé", "Paris Saint-Germain", 80, 75, 90);
        Futbolcu F8 = new Futbolcu("Luis Suárez", "Atlético Madrid", 90, 85, 80);

        futbolcu.add(F1);
        futbolcu.add(F2);
        futbolcu.add(F3);
        futbolcu.add(F4);
        futbolcu.add(F5);
        futbolcu.add(F6);
        futbolcu.add(F7);
        futbolcu.add(F8);

        Basketbolcu B1 = new Basketbolcu("Giannis Antetokounmpo", "Milwaukee Bucks", 95, 90, 95);
        Basketbolcu B2 = new Basketbolcu("Kawhi Leonard", "Los Angeles Clippers", 90, 80, 90);
        Basketbolcu B3 = new Basketbolcu("LeBron James", "Los Angeles Lakers", 100, 95, 95);
        Basketbolcu B4 = new Basketbolcu("James Harden", "Houston Rockets", 95, 95, 95);
        Basketbolcu B5 = new Basketbolcu("Anthony Davis", "Los Angeles Lakers", 90, 85, 85);
        Basketbolcu B6 = new Basketbolcu("Nikola Jokic", "Denver Nuggets", 85, 80, 85);
        Basketbolcu B7 = new Basketbolcu("Joel Embiid", "Philadelphia 76ers", 85, 85, 90);
        Basketbolcu B8 = new Basketbolcu("Luka Doncic", "Dallas Mavericks", 90, 85, 95);

        basketbolcu.add(B1);
        basketbolcu.add(B2);
        basketbolcu.add(B3);
        basketbolcu.add(B4);
        basketbolcu.add(B5);
        basketbolcu.add(B6);
        basketbolcu.add(B7);
        basketbolcu.add(B8);

       kartDagit(bilgisayar,oyuncu,futbolcu,basketbolcu);


    }
}
