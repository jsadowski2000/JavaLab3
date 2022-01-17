public class WiekszySilnik extends Samochod {
    protected int doplata;


    public WiekszySilnik() {
        super();
        this.doplata = 0;
    }

    public WiekszySilnik(int doplata) {
        this.doplata = doplata;
    }

    public WiekszySilnik(String marka, String model, int cena, int doplata) {
        super(marka, model, cena);
        this.doplata = doplata;
    }


    @Override
    protected int wyliczCene() {
        return super.wyliczCene() + doplata;
    }
}
