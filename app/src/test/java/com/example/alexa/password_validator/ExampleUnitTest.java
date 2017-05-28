package com.example.alexa.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 *
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void passwordIsCreated() throws Exception {
        Password password = new Password("pie");
        assertNotNull(password);
    }

    @Test
    public void passwordIsValidNotPassword() throws Exception {
        Password password = new Password("password");
        assertTrue(!password.isValid());

        password = new Password("PaSSword");
        assertTrue(!password.isValid());
    }
    @Test
    public void passwordIsValidLength() throws Exception {
        Password password = new Password("ab12!D");
        assertTrue(!password.isValid());
        password = new Password("ab12!D121212121");
        assertTrue(password.isValid());
    }

    @Test
    public void passwordIsValidContainsCharacters() throws Exception {
        Password password = new Password("123456754390834s!");
        assertTrue(!password.isValid());
        password = new Password("121212121212123dD#");
        assertTrue(password.isValid());
        password = new Password("121212121212123#");
        assertTrue(!password.isValid());
    }

    @Test
    public void passwordIsValidContainsNumbers() throws Exception {
        Password password = new Password("abdsfjkldfskjldfsklj!");
        assertTrue(!password.isValid());
        password = new Password("G121212121212123d#");
        assertTrue(password.isValid());
    }
    @Test
    public void passwordIsValidContainsCharacter() throws Exception {
        Password password = new Password("abdsfjkldfskjldfsklj");
        assertTrue(!password.isValid());
        password = new Password("121212121212123dTTT#");
        assertTrue(password.isValid());
    }

    @Test
    public void passwordIsValid() throws Exception {
        Password password = new Password("123456754390834Ds%$##$");
        assertTrue(password.isValid());
    }

}