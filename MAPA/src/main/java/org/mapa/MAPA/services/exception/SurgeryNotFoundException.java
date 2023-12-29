package org.mapa.MAPA.services.exception;


public class SurgeryNotFoundException extends RuntimeException{
    public SurgeryNotFoundException(String message){
        super(message);
    }
}
