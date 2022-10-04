package OldFashionPound.exception;

public class UnknownOperationException extends Exception {

    private String message;
    public UnknownOperationException(String message) {
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
