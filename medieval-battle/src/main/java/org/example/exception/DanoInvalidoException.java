package org.example.exception;

public class DanoInvalidoException extends RuntimeException{
    public DanoInvalidoException(String message) {
        super(message);
    }
}
