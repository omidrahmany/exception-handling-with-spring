package io.spring.exceptionhandling.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(BadNationalCodException.class)
    protected void badNationalCodeExceptionHandler(ExceptionBase exceptionBase) {
        System.out.println("bad national exception is handling...");
        System.out.println(">>>>>> " + exceptionBase.getMessage());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(EntityNotFoundException.class)
    protected void entityExceptionHandler(ExceptionBase exceptionBase) {
        System.out.println("entity not found exception is handling...");
        System.out.println(">>>>>> " + exceptionBase.getMessage());
    }
}
