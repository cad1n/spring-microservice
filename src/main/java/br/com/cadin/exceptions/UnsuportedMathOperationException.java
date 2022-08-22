package br.com.cadin.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public UnsuportedMathOperationException(String exception){
        super(exception);
    }
}
