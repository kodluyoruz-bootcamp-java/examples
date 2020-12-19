package org.kodluyoruz.examples.config;

import org.kodluyoruz.examples.exceptions.CustomerNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@EnableWebMvc
public class GlobalControllerAdvice extends ResponseEntityExceptionHandler {

    @Override
    @ExceptionHandler({CustomerNotFoundException.class})
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
     return super.handleExceptionInternal(ex, body, headers, status, request);
    }
}
