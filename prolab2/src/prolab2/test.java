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
        /* Futbolcu F1 = new Futbolcu(85,70,80);
        F1.setSporcuIsim("Cristiano Ronaldo");
        F1.setSporcuTakim("Juventus FC");
        
        Futbolcu F2 = new Futbolcu(85,70,80);
        F2.setSporcuIsim("Lionel Messi");
        F2.setSporcuTakim("FC Barcelona");
        
        Futbolcu F3 = new Futbolcu(85,70,80);
        F3.setSporcuIsim("Antoine Griezmann");
        F3.setSporcuTakim("FC Barcelona");
        
        Futbolcu F4 = new Futbolcu(85,70,80);
        F4.setSporcuIsim("Sergio Ramos");
        F4.setSporcuTakim("Real Madrid CF");
        
        Futbolcu F5 = new Futbolcu(85,70,80);
        F5.setSporcuIsim("Paulo Dybala");
        F5.setSporcuTakim("Juventus FC");
        
        Futbolcu F6 = new Futbolcu(85,70,80);
        F6.setSporcuIsim("Robert Lewandowski");
        F6.setSporcuTakim("FC Bayern München");
        
        Futbolcu F7 = new Futbolcu(85,70,80);
        F7.setSporcuIsim("Kylian Mbappé");
        F7.setSporcuTakim("Paris Saint-Germain");
        
        Futbolcu F8 = new Futbolcu(85,70,80);
        F8.setSporcuIsim("Luis Suárez");
        F8.setSporcuTakim("Atlético Madrid");
        
        Basketbolcu B1 = new Basketbolcu(80,80,80);
        B1.setSporcuIsim("temp");
        B1.setSporcuTakim("temp");
        
        Basketbolcu B2 = new Basketbolcu(80,80,80);
        B2.setSporcuIsim("temp");
        B2.setSporcuTakim("temp");
        
        Basketbolcu B3 = new Basketbolcu(80,80,80);
        B3.setSporcuIsim("temp");
        B3.setSporcuTakim("temp");
        
        Basketbolcu B4 = new Basketbolcu(80,80,80);
        B4.setSporcuIsim("temp");
        B4.setSporcuTakim("temp");
        
        Basketbolcu B5 = new Basketbolcu(80,80,80);
        B5.setSporcuIsim("temp");
        B5.setSporcuTakim("temp");
        
        Basketbolcu B6 = new Basketbolcu(80,80,80);
        B6.setSporcuIsim("temp");
        B6.setSporcuTakim("temp");
        
        Basketbolcu B7 = new Basketbolcu(80,80,80);
        B7.setSporcuIsim("temp");
        B7.setSporcuTakim("temp");
        
        Basketbolcu B8 = new Basketbolcu(80,80,80);
        B8.setSporcuIsim("temp");
        B8.setSporcuTakim("temp"); */
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
