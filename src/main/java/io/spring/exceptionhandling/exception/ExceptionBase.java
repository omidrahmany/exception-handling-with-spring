package io.spring.exceptionhandling.exception;

public class ExceptionBase extends RuntimeException {
    public ExceptionBase() {
    }

    public ExceptionBase(String message) {
        super(message);
    }

    public ExceptionBase(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionBase(Throwable cause) {
        super(cause);
    }

    public ExceptionBase(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
