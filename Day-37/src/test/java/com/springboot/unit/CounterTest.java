package com.springboot.unit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CounterTest {
    private Counter counter;

    @BeforeAll
    static void startingTests() {
        System.out.println("Starting the tests");
    }

    @BeforeEach
    void setUpCounter() {
        counter = new Counter();
    }

    @Test
    void testIncrement() {
        assertEquals(1, counter.increment());
        assertEquals(2, counter.increment());
        assertEquals(3, counter.increment());
    }

    @Test
    void testDecrement() {
        assertEquals(-1, counter.decrement());
        assertEquals(-2, counter.decrement());
        assertEquals(-3, counter.decrement());
    }

    @Test
    @DisplayName("Test a bunch of asserts at the same time")
    void testAll() {
        assertAll(
                () -> assertEquals(1, counter.increment()),
                () -> assertEquals(0, counter.decrement()),
                () -> assertEquals(1, counter.increment()),
                () -> assertEquals(1, counter.getCurrentValue())
        );
    }

    @Disabled
    @Test
    void disabledTest() {
        assertTrue(false);
    }

    @AfterEach
    void afterEachTest() {
        if(counter != null) {
            counter = null;
            System.out.println("Setting counter to null after each test");
        }
    }

    @AfterAll
    static void endingTests() {
        System.out.println("Ending the tests");
    }
}
