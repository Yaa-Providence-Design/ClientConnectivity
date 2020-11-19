package com.nyansapo.client_service.exceptions;


//custom user not found exception.
public class ClientNotFoundException extends  RuntimeException {
    public ClientNotFoundException(Long id) {
        super("User with id : " + id + " not found." );
    }
}
