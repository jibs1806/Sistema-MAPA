package org.mapa.MAPA.services.exception.user;

public class IncorrectPasswordException extends RuntimeException{
    public IncorrectPasswordException() {
        super("Incorrect password");
    }
}
