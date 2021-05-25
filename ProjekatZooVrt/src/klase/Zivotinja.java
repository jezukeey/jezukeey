package klase;

import main.Main;

//Primer apstraktne klase koja ne moze da ima svoje objekte
public abstract class Zivotinja {
    private String ime;
    private int godine;
    private boolean vakcinisana;

    public Zivotinja () {};

    public Zivotinja (String ime) {
        this.ime = ime;
    }

    //konstruktor klase zivotinja koji stavlja da za svaki novi objekat pod klasa Pas i Macka
    //da je vakcinisana=false
    public Zivotinja (String ime, int godine) {
        this.ime = ime;
        this.godine = godine;
        this.vakcinisana = false;
    }


    //setteri i getteri
    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return this.ime;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public int getGodine() {
        return this.godine;
    }

    public void setVakcinisana(boolean b) {
        this.vakcinisana = b;
    }

    public boolean getVakcinisana() {
        return this.vakcinisana;
    }

    //apstraktna metoda apstraktne klase
    //nema body metode, mora da se overrideuje u pod klasama
    public abstract void zvuk();

    //metoda apstraktne klase koje mogu pod klase da koriste
    public void spavaj() {
        stampaj("zzz");
    }

    //metoda kojom proveravamo prvo dal je objekat neke podklase Pas ili Macka vakcinisiana
    // ako nije, onda menjamo vakcinisana na true, a ako je vec true onda stampano na izlaz
    public void vakcinisi() {
        if ( this.getVakcinisana() == false ) {
            this.setVakcinisana(true);
        }
        else {
            stampaj("Vec je vakcinisana. Nemoj vise, molim te");
        }
    }

    //stampaj metoda poziva static klasu stampaj iz Main klase
    public static void stampaj(String text) {
        Main.stampaj(text);
    }

    //static metoda, koja ne mora da se zove pomocu objekta (ne mora da se instancira objekat pa nad njim da se pozove)
    // ali u njoj prosledjujemo objekat klase Zivotinja ili pod klasa Pas i Macka
    public static void stampajZivotinjuKaoStatic(Zivotinja zivotinja) {
        stampaj("Ime: " + zivotinja.ime + " , Godine: " + zivotinja.godine );
    }

    //nije static metoda, za nju moramo da prvo instanciramo objekat pa tek onda da je pozovemo
    public void stampajZivotinju() {
        stampaj("Ime: " + this.ime + " , Godine: " + this.godine );
    }

}
