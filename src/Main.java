import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */
  /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)*/

  /*
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie, */
        Osoba janusz = new Osoba("Janusz", "Sadelko", 55555);
        String januszName = janusz.getName();
        String januszNazwisko = janusz.getNazwisko();
        int januszIndeks = janusz.getIndeks();
        System.out.println("Imie osoby: " + januszName);
        System.out.println("Nazwisko osoby: " + januszNazwisko);
        System.out.println("Ineks osoby: " + januszIndeks);



        Person jakub = new Person("Jakub", "Sadowski");
        EnumDepartment department = EnumDepartment.inf;
        Student first = new Student(jakub, department);
        System.out.println(first.toString());
    }

        }

 /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */



        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */



