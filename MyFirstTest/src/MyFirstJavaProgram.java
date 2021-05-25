public class MyFirstJavaProgram {

        /* This is my first java program.
         * This will print 'Hello World' as the output
         */



        public static void main(String []args) {
//        int broj = 5;
//        pozitivanIliNegativanBroj(broj);
//        broj = 99;
//        pozitivanIliNegativanBroj(broj);
//        broj = 301;
//        pozitivanIliNegativanBroj(broj);
//        broj = -56;
//        pozitivanIliNegativanBroj(broj);
//        broj = 0;
//        pozitivanIliNegativanBroj(broj);

//        int a= 6;
//        int b = -4;
//        int povrsina = racunajPovrsinu(a,b);
//        System.out.println("Povrsina je : " + povrsina);

            int a = 5;
            int b = 6;
            int obim;
            System.out.println("Obim jednakostranicnog je : " + racunajObim(a));


            System.out.println("Obim jednakokrakog je : " + racunajObim(a, b));

            int c = 10;
            System.out.println("Obim pravouglog je : " + racunajObim(a, b, c));
            int zbir = racunajObim(a) + racunajPovrsinu(a,b);
            System.out.println("Zbir je : " + zbir);


        }

        //Racunanje obima trouglova

        public static int racunajObim(int a) {
            int obim = 3*a;
            return obim;
        }

        public static int racunajObim(int a, int b) {
            return a+2*b;
        }

        public static int racunajObim(int a, int b, int c) {
            return a*b*c;
        }



        public static int racunajPovrsinu(int a, int b) {
            int povrsina = 0;
            if (daliJePozitivan(a) && daliJePozitivan(b)) {
                povrsina = a*b;
            } else {
                System.out.println("nisu pozitivni brojevi");
            }
            return povrsina;
        }

        public static boolean daliJePozitivan(int a) {
            boolean rezultat;
            if(a>0) {
                rezultat =  true;
            }
            else {
                rezultat = false;
            }
            return rezultat;
        }

        public static void pozitivanIliNegativanBroj(int x) {
            if( x > 0 ) {
                System.out.println(x + " je pozitivan broj");
                if (x>99) System.out.println(x + " je trocifren pozitivan broj");

            }else if (x<0){
                System.out.println(x + " je negativan broj");
            } else {
                System.out.println(x + " je 0");
            }
        }

    }