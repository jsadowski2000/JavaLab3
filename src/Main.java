import java.util.Scanner;

public class Main {
    enum Liczby {
        JEDEN, DWA, TRZY, CZTERY, PIEC, SZESC;
    }
    enum Statusy {
        KONTYNUUJEMY, KONIEC;
    }

    public static void main(String[] args) {
    int a;
    Scanner num1 = new Scanner(System.in);
    a = num1.nextInt();

        switch (a) {
            case 1:
                System.out.println(Liczby.JEDEN);
                System.out.println(Statusy.KONTYNUUJEMY);
                a = num1.nextInt();


            case 2:
                System.out.println(Liczby.DWA);
                System.out.println(Statusy.KONTYNUUJEMY);
                a = num1.nextInt();

            case 3:
                System.out.println(Liczby.TRZY);
                System.out.println(Statusy.KONTYNUUJEMY);
                a = num1.nextInt();

            case 4:
                System.out.println(Liczby.CZTERY);
                System.out.println(Statusy.KONTYNUUJEMY);
                a = num1.nextInt();

            case 5:
                System.out.println(Liczby.PIEC);
                System.out.println(Statusy.KONTYNUUJEMY);
                a = num1.nextInt();

            case 6:
                System.out.println(Liczby.SZESC);
                System.out.println(Statusy.KONTYNUUJEMY);
                a = num1.nextInt();

            case 0:
                System.out.println(Statusy.KONIEC);
                break;
        }




            /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
       c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
       Scanner ss = new Scanner(System.in);
        int a;
        while (true) {
            a=ss.nextInt();
            System.out.println(a);
            if (a==0) {
                break;}
            }

            }
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

            /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
             * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */



        }
}


