package dc;

public class ŁadunekException extends Exception {
    int ileZadużo;
    public ŁadunekException(int ile) {
        ileZadużo = ile;
    }
    public String getMessage() {
        return "Próbowano załadować o " + ileZadużo + " kg ładunku!";
    }
}
