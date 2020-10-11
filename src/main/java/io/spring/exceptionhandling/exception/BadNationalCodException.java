package io.spring.exceptionhandling.exception;

public class BadNationalCodException extends ExceptionBase {
    public BadNationalCodException() {
    }

    public BadNationalCodException(String message) {
        super(message);
    }

    public BadNationalCodException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadNationalCodException(Throwable cause) {
        super(cause);
    }

    public BadNationalCodException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
