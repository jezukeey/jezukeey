package main;

import klase.Macka;
import klase.Pas;
import klase.Zivotinja;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String []args) {

        //ovo smo koristili kada klasa Zivotinja nije bila apstraktna
//        Zivotinja nekaZivotinja = new Zivotinja("nedefinisanaZivotinja");


        //ovo smo koristili dok nismo imali nas konstruktor za klasu Pas
//        Pas dzeki = new Pas();
//        dzeki.setIme("Dzeki");
//        dzeki.setGodine(1);

        Pas dzeki = new Pas("Dzeki", 1);
        dzeki.setRasa("Dzek Rasel");

        stampaj("Godine zivotinje su " + dzeki.getGodine());
        stampaj("Da li je vakcinisan: " + dzeki.getVakcinisana());
        //vakcinisemo Dzekija
        dzeki.vakcinisi();
        stampaj("ovo je posle vakcinacije");
        stampaj("Da li je vakcinisan: " + dzeki.getVakcinisana());

        //ponovo pokusavamo da vakcinisemo Dzekija
        dzeki.vakcinisi();

        //ovo je dok klasa zivotinja nije bila apstraktna, pa smo imali njen objekat
//        nekaZivotinja.zvuk();

        //primeri koriscenja override-ovanih metoda
        Macka garfild = new Macka("Garfild" , 10);
        Pas rex = new Pas ("Rex", 4);
        dzeki.zvuk();
        dzeki.spavaj();
        rex.zvuk();
        garfild.zvuk();

        //ovako se poziva static metoda klase iz drugog paketa. Ovde zovemo stampajZivotinjuKaoStatic() iz Zivotinja klase
        Zivotinja.stampajZivotinjuKaoStatic(dzeki);
        //ovako zovemo ne static metodu iz neke klase, tako sto prvo imamo objekat
        dzeki.stampajZivotinju();

        //ovo su nam sada 2 jedine metode koje pozivamo iz main-a
        ArrayList<Zivotinja> listaZivotinja = generisiNiz();
        prebrojPoZivotinjama(listaZivotinja);

    }

    //ovo koristimo da unesemo zivotinje u niz
    public static ArrayList<Zivotinja> generisiNiz() {
        ArrayList<Zivotinja> listaZivotinja = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        stampaj("Unesi broj zivotinja");
        int broj = scanner.nextInt();
        for(int i = 0; i < broj ; i++) {
            stampaj("Da li je pas(p)  ili macka(m)");
            String vrsta = scanner.next();
            stampaj("Unesi ime");
            String ime = scanner.next();
            stampaj("Unesi godine");
            int godine = scanner.nextInt();
            if (vrsta.equals("p")) {
                Pas pas = new Pas(ime, godine);
                listaZivotinja.add(pas);
            } else {
                Macka macka = new Macka(ime, godine);
                listaZivotinja.add(macka);
            }
        }
        return listaZivotinja;
    }

    //ovde prebrojavamo objekte klase Pas i Macka
    public static void prebrojPoZivotinjama(ArrayList<Zivotinja> lista) {
        int brojPasa=0;
        int brojMacki=0;
        for(int i=0; i< lista.size(); i ++) {
            // instanceof nam vraca true ili false ako je objekat jednak klasi Pas
            if (lista.get(i) instanceof Pas) {
                brojPasa++;
            } else {
                brojMacki++;
            }

        }
        stampaj("Broj pasa je: " + brojPasa + ", a broj macki je " + brojMacki);
    }

    //glavna stampaj metoda
    public static void stampaj(String text) {
        System.out.println(text);
    }

}
