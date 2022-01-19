import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        List<Student> ListaStudentow = new ArrayList<>();
        Student student1 = new Student();
        student1.name = "Jakub";
        student1.surname = "Sadowski";
        student1.age = 21;
        student1.status = true;
        ListaStudentow.add(student1);


        Student student2 = new Student();
        student2.name = "Marian";
        student2.surname = "Pazdzioch";
        student2.age = 29;
        student2.status = false;
        ListaStudentow.add(student2);


        Student student3 = new Student();
        student3.name = "Ferdek";
        student3.surname = "Kiepski";
        student3.age = 24;
        student3.status = true;
        ListaStudentow.add(student3);

        for (Student i : ListaStudentow) {
            System.out.println(i.toString());
        }
    }
}
