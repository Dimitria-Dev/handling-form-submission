// Dimitria Deveaux, Course:COP 3330 CRN 24680, Date: 04-01-2024
//Purpose: To make a form that can be used to enter and display data to Users.
//The user will enter their student ID, month, day and year. A custom exception message will be thrown if the user enters an invalid date.
package com.example.handlingformsubmission;

public class Greeting {

    private long id;
    private String content;
    private int month;
    private int day;
    private int year;

    public Greeting(int month, int day, int year) throws InvalidDateException{

        //Throws custom InvalidDateException if the month is greater than 12
        if(month > 12)
            throw new InvalidDateException("The month entered must be between 1 - 12");
        else
            this.month = month;

        //Throws custom InvalidDateException if the day is greater than 31
        if(day < 0 || day > 31){
            throw new InvalidDateException("The day entered must be between 1 - 31");
        } else
            this.day = day;

        //Throws custom InvalidDateException if the year is greater than 2024
        if(year > 2024){
            throw new InvalidDateException("The year must be or less than 2024");
        } else
            this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String toString(){
        return getMonth() + "/" + getDay() + "/" + getYear();
    }
}
