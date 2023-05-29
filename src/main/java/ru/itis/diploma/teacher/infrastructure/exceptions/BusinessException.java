package ru.itis.diploma.teacher.infrastructure.exceptions;

public class BusinessException extends Exception {
    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message) {
        super(message);
    }
}
