package main;

import mojeKlase.Artikal;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String []args) {

        //ovo je koristeci default konstruktor
//        Artikal hleb = new Artikal();
//        hleb.ime = "Sava hleb";
//        hleb.cena = 40;

        //ovo vise ne moze da se menja zato sto je cena proglasena za private
        //hleb.cena = 35;

        //da bi setovali vrednosti sada koristimo settere
//        hleb.setIme("Crni hleb");
//        hleb.setCena(45);

        //Ovo je koristeci nas konstruktor sa 1 parametrom
//        Artikal hleb = new Artikal("Sava hleb", 40);

        // Ovo je koristilo konstruktor sa 2 parametrom
//        Artikal kifla = new Artikal("bela kifla", 25);
//        Artikal jogurt = new Artikal("Moja Kravica jogurt", 20);

        //Ovo je koriscenje konstruktora sa 3 parametra
//        Artikal sok = new Artikal("273468273427", "Coca Cola", 99);

        //ovo je koriscenje konstruktora sa 4 parametra
//        Artikal hleb = new Artikal("34654613213","Sava hleb", 40, 2);
//        Artikal kifla = new Artikal("987654651651","bela kifla", 25, 5);
//        Artikal jogurt = new Artikal("561656541","Moja Kravica jogurt", 20, 5);
//        Artikal sok = new Artikal("273468273427", "Coca Cola", 99, 3);

        //ovo smo koristili za fixni niz
//        Artikal[] listaArtikla = new Artikal[10];

        ArrayList<Artikal> listaArtikla = new ArrayList<Artikal>();

        //sada koristimo petlju za unos artikla
        Scanner scanner = new Scanner(System.in);
        stampaj("Unesi broj artikala");
        int broj = scanner.nextInt();
        
        for(int i=0; i<broj; i++) {
            stampaj("Unesi sifra artikla");
            String sifra = scanner.next();
            stampaj("Unesi ime artikla");
            String ime = scanner.next();
            stampaj("Unesi cenu artikla");
            double cena = scanner.nextDouble();
            stampaj("Unesi kolicinu");
            int kolicina = scanner.nextInt();
            Artikal artikal = new Artikal(sifra, ime, cena, kolicina );
            listaArtikla.add(artikal);

            //ovo smo koristili kada smo imali fixni niz
            //listaArtikla[i] = artikal;
        }

        stampajRacun(listaArtikla);

        //ovo je nasa metoda za stampanje
//        stampajArtikal(hleb.ime, hleb.cena);  //stampa sa 2 parametra
//        stampajArtikal(hleb); //stampa sa objektom klase Artial
//        stampajArtikal(kifla);
//        stampajArtikal(jogurt);
//        stampajArtikal(sok);

        //ovo je system prinln standardna metoda za ispis u terminal
//        System.out.println("Uneseni je artikal " + hleb.ime + " sa cenom od " + hleb.cena);

    } //ovo je kraj main metode. Posle nje pisemo static metode koje koristimo


        //Ovako smo stampali sa fixnim nizom
//    public static void stampajRacun(Artikal[] listaArtikla) {
//        stampaj("Artikal - Cena - Kolicina - Ukupno");
//        for(int i=0; i<listaArtikla.length; i++) {
//            if(listaArtikla[i] == null) break;
//            stampaj(listaArtikla[i].getIme() + " - " + listaArtikla[i].getCena() + " - " + listaArtikla[i].getKolicina() + " - " + listaArtikla[i].ukupnuCenu());
//        }
//    }

    //Ovako smo stampali sa dinamickim nizom ArrayList
    public static void stampajRacun(ArrayList<Artikal> listaArtikla) {
        double racun = 0;
        stampaj("Artikal - Cena - Kolicina - Ukupno");
        for(int i=0; i<listaArtikla.size(); i++) {
            stampaj(listaArtikla.get(i).getIme() + " - " + listaArtikla.get(i).getCena() + " - " + listaArtikla.get(i).getKolicina() + " - " + listaArtikla.get(i).ukupnuCenu());
            racun += listaArtikla.get(i).ukupnuCenu();
        }
        stampaj("Ukupan racun: " + racun);
    }

    //Ovo stampa sa 2 parametra
    public static void stampajArtikal(String ime, double cena) {
        System.out.println("Uneseni je artikal " + ime + " sa cenom od " + cena + " dinara");
    }

    //Ovo stampa tako sto prosledimo objekat klase Artikal i stampamo vrednosti njegovih atributa
    //Ovo takodje ne mogu da dohvatim zato sto su ime i cena postali private
//    public static void stampajArtikal(Artikal artikal) {
//        System.out.println("Uneseni je artikal " + artikal.ime + " sa cenom od " + artikal.cena + " dinara");
//    }

    //ovo koristimo da stampamo bilo koji String na terminalu
    public static void stampaj(String s) {
        System.out.println(s);
    }

    //ovo koristimo da stampamo Artikal ime i cenu na terminalu
    public static void stampajArtikal(Artikal artikal) {
        System.out.println("Uneseni je artikal " + artikal.getIme() + " sa cenom od " + artikal.getCena() + " dinara");
    }

}
