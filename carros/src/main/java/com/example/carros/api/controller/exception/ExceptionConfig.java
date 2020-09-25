package com.example.carros.api.controller.exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.io.Serializable;
import java.nio.file.AccessDeniedException;

@RestControllerAdvice
public class ExceptionConfig extends ResponseEntityExceptionHandler {



    @ExceptionHandler({
            EmptyResultDataAccessException.class
    })
    public ResponseEntity erroNotFound(Exception e){

        return ResponseEntity.notFound().build();

    }

    @ExceptionHandler({
            AccessDeniedException.class
    })
    public ResponseEntity accessDinied(Exception e){
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body( new ExceptionError("Acesso negadosss"));
    }

    @ExceptionHandler({
           IllegalArgumentException.class
    })
    public ResponseEntity badResquest(Exception e){

        return ResponseEntity.badRequest().build();

    }

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return new ResponseEntity<>(new ExceptionError("Operação não permitida"), HttpStatus.METHOD_NOT_ALLOWED);
    }

}

class ExceptionError implements Serializable{
    private String error;

    public ExceptionError(String error) {
        this.error = error;
    }

    public String getError(){
        return error;
    }
}