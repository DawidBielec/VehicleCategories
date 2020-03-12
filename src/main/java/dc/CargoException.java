package dc;

public class CargoException extends Exception {
    int qualityToMany;
    public CargoException(int quality) {
        qualityToMany = quality;
    }
    public String getMessage() {
        return "Próbowano załadować o " + qualityToMany + " kg ładunku!";
    }
}
