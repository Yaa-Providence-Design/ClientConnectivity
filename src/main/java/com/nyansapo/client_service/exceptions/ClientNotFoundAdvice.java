package com.nyansapo.client_service.exceptions;


//importing necessary libraries.
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class ClientNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ClientNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String userNotFound(ClientNotFoundException ex){
    return ex.getMessage();
    }

    String userNotFound(UsernameNotFoundException ex){
        return ex.getMessage();
    }
}
