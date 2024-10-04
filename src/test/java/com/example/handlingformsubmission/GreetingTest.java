package com.example.handlingformsubmission;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    Greeting greeting;

    @BeforeEach
    void setUp() {

    }

    @Test
    void checkValidDate() throws InvalidDateException {
        greeting = new Greeting(4, 12, 2023);
        assertEquals(4, greeting.getMonth());
        assertEquals(12, greeting.getDay());
        assertEquals(2023, greeting.getYear());
    }

    @Test
    void validDay() {
        InvalidDateException exception = assertThrows(InvalidDateException.class, () -> greeting = new Greeting(4, 60, 2023));
        assertEquals("The day entered must be between 1 - 31", exception.getMessage());

    }

    @Test
    void validMonth() {
        InvalidDateException exception = assertThrows(InvalidDateException.class, () -> greeting = new Greeting(25, 30, 2023));
        assertEquals("The month entered must be between 1 - 12", exception.getMessage());

    }

    @Test
    void validYear() {
        InvalidDateException exception = assertThrows(InvalidDateException.class, () -> greeting = new Greeting(12, 6, 2026));
        assertEquals("The year must be less than 2024", exception.getMessage());

    }
}