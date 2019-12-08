package dc;

/**
 * Abstrakcyjna klasa Samochód
 */
abstract class Samochód {
    private String marka;
    private String model;
    private int rokProdukcji;
    /**
     ile litrów paliwa samochód pali na 100 km
     **/
    private double paliNa100Km;

    public void setPaliwoWBaku(double paliwoWBaku) {
        this.paliwoWBaku = paliwoWBaku;
    }
    /**
     ile litrów paliwa samochód posiada w baku
     **/
    private double paliwoWBaku;
    public String getMarka() {
        return marka;
    }
    public String getModel() {
        return model;
    }
    public int getRokProdukcji() {
        return rokProdukcji;
    }
    public double getPaliNa100Km() {
        return paliNa100Km;
    }
    public double getPaliwoWBaku() {
        return paliwoWBaku;
    }

    public int getDługośćTrasy() {
        return długośćTrasy;
    }

    public void setDługośćTrasy(int długośćTrasy) {
        this.długośćTrasy = długośćTrasy;
    }
    private int długośćTrasy;
    public Samochód(String marka, String model, int rokProdukcji, double paliNa100Km) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.paliNa100Km = paliNa100Km;
        paliwoWBaku = 0;
    }
    @Override
    public String toString() {
        return marka + " " + model + " " + rokProdukcji;
    }
    public void zatankujPaliwo(double ile) {
        paliwoWBaku += ile;

    }
}
