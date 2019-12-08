package dc;

public class SamochódDostawczy extends Samochód{
    private int ładowność;
    private int ładunek;
    public SamochódDostawczy(String marka, String model, int rokProdukcji, double paliNa100Km, int ładowność) {
        super(marka, model, rokProdukcji, paliNa100Km);
        this.ładowność = ładowność;
        ładunek = 0;
    }
    private void załadujSamochód(int ile) throws ŁadunekException {
        try {
            if (ile + ładunek > ładowność) {
                throw new ŁadunekException(ładowność - ładunek - ile);
            }
            ładunek += ile;
        }
        catch(ŁadunekException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void rozładujSamochód() {
        ładunek = 0;
        setDługośćTrasy(0);
    }
    public void ruszajWTrasę(int ileKm, int ładunek) {
        setDługośćTrasy(ileKm);
        try {
            załadujSamochód(ładunek);
        }
        catch(ŁadunekException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void zakończTrasę() {
        double ileSpalił = (getPaliNa100Km()*getDługośćTrasy()/100) *(1 + ładunek/ładowność);
        try {
            if (ileSpalił > getPaliwoWBaku()) {
                int ilePrzejechał = (int)(getPaliwoWBaku()/getPaliNa100Km()*100 / ((1 + ładunek/ładowność)));
                setPaliwoWBaku(0);
                setDługośćTrasy(getDługośćTrasy()-ilePrzejechał);
                throw new TrasaException("zabrakło paliwa po przejechaniu " + ilePrzejechał + " km");
            }
            else
            {
                // udało się dojechać do celu
                System.out.println("Dotarłem do celu : " + getDługośćTrasy() + " km");
                setPaliwoWBaku(getPaliwoWBaku()-ileSpalił);
                setDługośćTrasy(0);
            }
        }
        catch (TrasaException te) {
            System.out.println(te.getMessage());
        }
    }
}
