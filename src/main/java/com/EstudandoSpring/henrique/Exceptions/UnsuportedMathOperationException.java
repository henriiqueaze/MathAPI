package com.EstudandoSpring.henrique.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public UnsuportedMathOperationException(String msg) {
        super(msg);
    }
}