package com.springboot.app.exception.handler;


import com.springboot.app.domain.ErrorMessage;
import com.springboot.app.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value={UserNotFoundException.class})
    public ResponseEntity<ErrorMessage> handlerUserNotFound(UserNotFoundException e){
        System.out.println("If UserNotFoundException throws, it will be intercepted by this handler");
        return new ResponseEntity(ErrorMessage.builder().msg(e.getMessage()+" Not Found").build(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value={Exception.class})
    public ResponseEntity<ErrorMessage> handlerException(Exception e){
        return new ResponseEntity(ErrorMessage.builder().msg("General Exception"), HttpStatus.NOT_FOUND);
    }

}
