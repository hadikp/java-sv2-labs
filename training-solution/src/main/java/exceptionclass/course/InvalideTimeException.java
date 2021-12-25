package exceptionclass.course;

public class InvalideTimeException extends  RuntimeException {

    private int parameterHours;
    private int parameterMinutes;

    public InvalideTimeException(String message) {
        super(message);
    }

    public InvalideTimeException(String message, int parameterHours) {
        super(message);
        this.parameterHours = parameterHours;
    }

    public InvalideTimeException(String message, Throwable cause, int parameterHours, int parameterMinutes) {
        super(message, cause);
        this.parameterHours = parameterHours;
        this.parameterMinutes = parameterMinutes;
    }

    public int getParameterHours() {
        return parameterHours;
    }

    public int getParameterMinutes() {
        return parameterMinutes;
    }
}
