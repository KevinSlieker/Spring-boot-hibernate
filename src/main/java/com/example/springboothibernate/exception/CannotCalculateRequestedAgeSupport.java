package com.example.springboothibernate.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CannotCalculateRequestedAgeSupport {

    @ResponseBody
    @ExceptionHandler(CannotCalculateRequestedAge.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String CannotCalculateRequestedAgeHandler(){
        return ("Can not calculate requested age");
    }
}
