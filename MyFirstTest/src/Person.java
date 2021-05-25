public class Person {
    public String ime;
    public String prezime;
    public int godine;
    public char pol;
    public String mesto;

    public Person (String imeCoveka) {
        ime = imeCoveka;
    }

    public static int vratiGodinuRodjenja (int godineOsobe, int tekucaGodina) {
        return tekucaGodina - godineOsobe;
    }


    public Person (String imeCoveka, String prezimeCoveka, int godineCoveka, char polCoveka, String mestoRodjenja) {

        ime = imeCoveka;
        prezime = prezimeCoveka;
        godine = godineCoveka;
        pol = polCoveka;
        mesto = mestoRodjenja;
    }

    public static void main(String []args) {
        Person djole = new Person("Djordje");
        djole.prezime = "Djordjevic";
        djole.godine = 45;
        djole.pol = 'M';
        djole.mesto = "Dorchol";

        Person ana = new Person("Ana", "Jeremic", 23, 'z', "Pancevo");
        Person marija = new Person("Marija", "Jeftic", 13, 'z', "Ub");


        System.out.println("Djole je iz : " + djole.mesto);
        System.out.println("Ana je iz : " + ana.mesto);
        System.out.println("Marija je iz : " + marija.mesto);

        int tekucaGodina = 2021;
        System.out.println("Djole je rodjen : " + vratiGodinuRodjenja(djole.godine, tekucaGodina));
        System.out.println("Ana  je rodjena : " + vratiGodinuRodjenja(ana.godine, tekucaGodina));
        System.out.println("Marija  je rodjena : " + vratiGodinuRodjenja(marija.godine, tekucaGodina));

    }

}


