package dc;

public class SamochódOsobowy extends Samochód {
    public void ruszajWTrasę(int ileKM) {
        setDługośćTrasy(ileKM);
    }
    public SamochódOsobowy(String marka, String model, int rokProdukcji, double paliNa100Km) {
        super(marka, model, rokProdukcji, paliNa100Km);
    }
    public void zakończTrasę() throws TrasaException {
        // obliczenie ile paliwa samochód wypalił
        try {
            double ileWypalił = getPaliNa100Km() * getDługośćTrasy() / 100;
            if (ileWypalił > getPaliwoWBaku()) {
                setPaliwoWBaku(0);
                throw new TrasaException("zabrakło paliwa");
            }
            else {
                double jestPaliwa = getPaliwoWBaku();
                setPaliwoWBaku(jestPaliwa - ileWypalił);
            }
            setDługośćTrasy(0);
        }
        catch (TrasaException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
