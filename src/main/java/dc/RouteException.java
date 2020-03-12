package dc;

public class RouteException extends Exception {
    private String message;
    public RouteException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
