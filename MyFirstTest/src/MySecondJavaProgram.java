import java.util.Scanner;

public class MySecondJavaProgram {
    public String ime;

    public static void main(String []args) {
//        String [] niz = {"Pera", "Zika", "Mika" , "1"};
//        System.out.println(niz[2]);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Unesite broj:");
        String str = "Nikola Djurasevic";
//        String [] split = str.split(" ");
//        String firstName = split[0];
//        String lastName = split[1];
        int broj = scanner.nextInt();
//        int brojKaoInteger = Integer.parseInt(broj);
        for (int i=1; i < 11; i++) {
            System.out.println(broj + "*" + i + "=" + i*broj );
        }






    }
}