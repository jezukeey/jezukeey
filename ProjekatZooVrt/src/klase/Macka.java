package klase;

//primer pod (child) klase koja nasledjuje neku nad (super) klasu
public class Macka extends Zivotinja{
    private String rasa;
    private boolean alergijska;

    //konstruktor klase Macka koji poziva konstruktor super klase Zivotinja
    public Macka (String ime, int godine) {
        super(ime, godine);
    }

    //ovo je override metoda u klasi Macka, koja overrideuje apstraktnu metodu zvuk u klasi Zivotinja
    public void zvuk() {
        stampaj( this.getIme() + " kaze mau mau");
    }
}
