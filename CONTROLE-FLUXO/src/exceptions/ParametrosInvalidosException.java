package exceptions;

public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String message) {
        super(message);
    }

    public ParametrosInvalidosException(String message, Throwable e) {
        super(message, e);
    }

}
