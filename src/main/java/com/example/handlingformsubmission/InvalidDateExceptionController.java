// Dimitria Deveaux, Course:COP 3330 CRN 24680, Date: 04-01-2024
//Purpose: The InvalidDateExceptionController handles the exception and returns a Bad Request response with an error message.
package com.example.handlingformsubmission;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class InvalidDateExceptionController {

    @ExceptionHandler(value = InvalidDateException.class)
    public ResponseEntity<Object> handleInvalidDateException(InvalidDateException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
