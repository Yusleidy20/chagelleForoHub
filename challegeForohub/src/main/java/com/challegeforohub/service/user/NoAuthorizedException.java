package com.challegeforohub.service.user;

public class NoAuthorizedException extends RuntimeException {
    public NoAuthorizedException(){
        super("No tienes acceso para este recurso");
    }
}
