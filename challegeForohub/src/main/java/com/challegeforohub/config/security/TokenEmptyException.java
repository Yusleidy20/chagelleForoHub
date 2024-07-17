package com.challegeforohub.config.security;

public class TokenEmptyException extends RuntimeException{
    public TokenEmptyException(String mensaje){
        super(mensaje);

    }
}
