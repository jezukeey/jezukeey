package klase;

//primer pod (child) klase koja nasledjuje neku nad (super) klasu
public class Pas extends Zivotinja{
    private String rasa;

    //konstruktor klase Pas koji poziva konstruktor super klase Zivotinja
    public Pas (String ime, int godine) {
        super(ime, godine);
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    //setter metoda koja poziva setter metodu super klase Zivotinja
    public void setGodine(int godine) {
        super.setGodine(godine);
    }

    //getter metoda koja poziva getter metodu super klase Zivotinja
    public int getGodineSuper() {
        return super.getGodine();
    }

    //ovo je override metoda u klasi Pas, koja overrideuje apstraktnu metodu zvuk u klasi Zivotinja
    public void zvuk() {
        stampaj(this.getIme() + " kaze av av");
    }
}
