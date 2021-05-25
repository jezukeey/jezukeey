package mojeKlase;

public class Artikal {
    private String sifra;
    private String ime;
    private double cena;
    private int kolicina;

    //Konstruktori
    public Artikal (String ime, double cena) {
        this.ime = ime;
        this.cena = cena;
    }

    public Artikal (String sifra, String ime, double cena) {
        this.sifra = sifra;
        this.ime = ime;
        this.cena = cena;
    }

    public Artikal (String sifra, String ime, double cena, int kolicina ) {
        this.sifra = sifra;
        this.ime = ime;
        this.cena = cena;
        this.kolicina = kolicina;
    }

    //setter za ime
    public void setIme(String ime) {
        this.ime = ime;
    }

    //settar za cenu
    public void setCena(double cena) {
        this.cena = cena;
    }

    //getter za ime
    public String getIme() {
        return this.ime;
    }

    //getter za cenu
    public double getCena() {
        return this.cena;
    }

    //getter za kolicinu
    public int getKolicina() {
        return this.kolicina;
    }

    //metoda koja vraca ukupnu cenu za svaki artikal
    public double ukupnuCenu() {
        return this.getKolicina()*this.getCena();
    }
}
