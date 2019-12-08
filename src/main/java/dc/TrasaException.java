package dc;

public class TrasaException extends Exception {
    private String message;
    public TrasaException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
