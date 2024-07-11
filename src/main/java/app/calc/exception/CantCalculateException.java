package app.calc.exception;

public class CantCalculateException extends RuntimeException {
    private String msg;

    public CantCalculateException(String msg) {
        super(msg);
    }
}
