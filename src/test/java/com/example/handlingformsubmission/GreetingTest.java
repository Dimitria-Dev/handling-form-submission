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
        InvalidDateException exception = assertThrows(InvalidDateException.class, () -> greeting = new Greeting(4, 48, 2023));
        assertEquals("The day entered must be between 1 - 31", exception.getMessage());

    }
}