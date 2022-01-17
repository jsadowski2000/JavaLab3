public class Samochod {

    protected String marka;
    protected String model;
    protected int cena;
    private boolean czySamochod;


    public Samochod() {
        this.marka = "";
        this.model = "";
        this.cena = 0;
        czySamochod = true;
    }

    public Samochod(String marka, String model, int cena) {
        this.marka = marka;
        this.model = model;
        this.cena = cena;
        czySamochod = true;
    }

    protected int wyliczCene() {
        return this.cena;
    }

    @Override
    public String toString() {
        return "Samochod: {" +
                "Marka='" + marka + '\'' +
                ", Model='" + model + '\'' +
                ", Cena=" + cena +
                '}';
    }
}

