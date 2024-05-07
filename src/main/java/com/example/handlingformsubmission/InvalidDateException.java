// Dimitria Deveaux, Course:COP 3330 CRN 24680, Date: 04-01-2024
//Purpose: The InvalidDateException allows a custom message to be shown when the exception is thrown.

package com.example.handlingformsubmission;

public class InvalidDateException extends Exception{
    public InvalidDateException(String message){
        super(message);
    }
}
