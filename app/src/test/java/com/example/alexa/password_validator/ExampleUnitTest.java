package com.example.alexa.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
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
    }

    @Test
    public void passwordIsValid() throws Exception {
        Password password = new Password("123456754390834");
        assertTrue(password.isValid());
    }

}