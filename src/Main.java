import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        Samochod samochod = new Samochod("Opel","Astra",8000);
        System.out.println(samochod.toString());
        WiekszySilnik wiekszySilnik = new WiekszySilnik("Opel","Astra",8000,3000);
        System.out.println(wiekszySilnik.toString());
        System.out.println("Cena calkowita: " +wiekszySilnik.wyliczCene());
        Samochod samochod1 = new Samochod("Ford","Fiesta",15000);
        System.out.println(samochod1.toString());
        WiekszySilnik wiekszySilnik1 = new WiekszySilnik("Ford","Fiesta",15000,2000);
        System.out.println(wiekszySilnik1.toString());
        System.out.println("Cena calkowita: " +wiekszySilnik1.wyliczCene());
        List<Samochod>samochodLista = new ArrayList<>();
        samochodLista.add(samochod);
        samochodLista.add(wiekszySilnik1);
        System.out.println(samochodLista);

    }
}
