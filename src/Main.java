import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

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
        Student student1 = new Student(jakub, department);
        //System.out.println(student1.toString());
        List<Student> ListaStudentow = new ArrayList<>();
        Person jan = new Person("Jan", "Matejko");
        EnumDepartment department1 = EnumDepartment.inf;
        Student student2 = new Student(jan, department1);

        Person ferdek = new Person("Ferdek", "Kiepski");
        EnumDepartment department2 = EnumDepartment.mat;
        Student student3 = new Student(ferdek, department2);

        Person ryszard = new Person("Ryszard", "Dran");
        EnumDepartment department3 = EnumDepartment.inf;
        Student student4 = new Student(ryszard, department3);

        Person marian = new Person("Marian", "Pazdzioch");
        EnumDepartment department4 = EnumDepartment.fiz;
        Student student5 = new Student(marian, department4);
        ListaStudentow.add(student5);
        ListaStudentow.add(student1);
        ListaStudentow.add(student2);
        ListaStudentow.add(student3);
        ListaStudentow.add(student4);

        for(Student student : ListaStudentow) {
            System.out.println(student.toString());
            }
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



