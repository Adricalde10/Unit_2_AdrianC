package com.vogella.unittest.email;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void ensureThatEmailValidatorReturnsTrueForValidEmail() {
        assertTrue(Calculator.isValidEmail("lars.vogel@gmail.com"));
    }

    @Test
    void emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(Calculator.isValidEmail("lars.vogel@analytics.gmail.com"));
    }

    @Test
    void emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(Calculator.isValidEmail("lars.vogel@gmail"));
    }

    @Test
    void emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertTrue(Calculator.isValidEmail("lars..vogel@gmail.com"));
        assertFalse(Calculator.isValidEmail("lars..vogel@gmail..com"));
    }

    @Test
    void emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(Calculator.isValidEmail("@gmail.com"));
    }

    @Test
    void emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(Calculator.isValidEmail(""));
    }

    @Test
    void emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(Calculator.isValidEmail(null));
    }

}