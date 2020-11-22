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
public class test {

    public static void main(String[] args) {

        Futbolcu F1 = new Futbolcu("Cristiano Ronaldo", "Juventus FC", 95, 85, 90);
        Futbolcu F2 = new Futbolcu("Lionel Messi", "FC Barcelona", 95, 90, 85);
        Futbolcu F3 = new Futbolcu("Antoine Griezmann", "FC Barcelona", 85, 75, 80);
        Futbolcu F4 = new Futbolcu("Sergio Ramos", "Real Madrid CF", 85, 75, 85);
        Futbolcu F5 = new Futbolcu("Paulo Dybala", "Juventus FC", 80, 80, 85);
        Futbolcu F6 = new Futbolcu("Robert Lewandowski", "FC Bayern München", 90, 90, 80);
        Futbolcu F7 = new Futbolcu("Kylian Mbappé", "Paris Saint-Germain", 80, 75, 90);
        Futbolcu F8 = new Futbolcu("Luis Suárez", "Atlético Madrid", 90, 85, 80);
        
        Basketbolcu B1 = new Basketbolcu("Giannis Antetokounmpo", "Milwaukee Bucks", 95, 90, 95);
        Basketbolcu B2 = new Basketbolcu("Kawhi Leonard", "Los Angeles Clippers", 90, 80, 90);
        Basketbolcu B3 = new Basketbolcu("LeBron James", "Los Angeles Lakers", 100, 95, 95);
        Basketbolcu B4 = new Basketbolcu("James Harden", "Houston Rockets", 95, 95, 95);
        Basketbolcu B5 = new Basketbolcu("Anthony Davis", "Los Angeles Lakers", 90, 85, 85);
        Basketbolcu B6 = new Basketbolcu("Nikola Jokic", "Denver Nuggets", 85, 80, 85);
        Basketbolcu B7 = new Basketbolcu("Joel Embiid", "Philadelphia 76ers", 85, 85, 90);
        Basketbolcu B8 = new Basketbolcu("Luka Doncic", "Dallas Mavericks", 90, 85, 95);
        System.out.print(F1.getSporcuIsim() + " " + F1.getSporcuTakim() + " " + F1.getKaleciKarsiKarsiya() + " ");
        System.out.println(F1.getPenalti() + " " + F1.getSerbestAtis());
        System.out.print(B1.getSporcuIsim() + " " + B1.getSporcuTakim() + " " + B1.getIkilik() + " ");
        System.out.println(B1.getUcluk() + " " + B1.getSerbestAtis());

    }
}
