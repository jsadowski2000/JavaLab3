class Osoba {
    private String imie;
    private String nazwisko;
    private int indeks;

    public Osoba(String imie, String nazwisko, int indeks){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }
    public Osoba(){}
    public String getName(){ return imie;}
    public void setName(String imie) {
        this.imie = imie;}
    public String getNazwisko(){ return nazwisko;}
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;}
    public int getIndeks(){ return indeks;}
    public void setIndeks(int indeks) {
        this.indeks = indeks;}
}