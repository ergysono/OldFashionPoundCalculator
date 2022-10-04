package OldFashionPound.exception;

public class WrongValuesException extends Exception {

    private String message;
    public WrongValuesException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
