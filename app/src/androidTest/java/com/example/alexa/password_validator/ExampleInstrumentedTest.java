package com.example.alexa.password_validator;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getContext;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class, false, false) {
    };

    @Before
    public void launchActivity() {
        Intent loginIntent = new Intent(getContext(), MainActivity.class);
        mActivityRule.launchActivity(loginIntent);
    }

    @Test
    public void textFieldIsDisplayed() {
        DoStuff.clickItemWithId(R.id.editText);
    }

    @Test
    public void textFieldIsEditable() {
        DoStuff.clickItemWithId(R.id.editText);
        DoStuff.type(R.id.editText, "fhdskjfSS$$22");
        DoStuff.textInViewIsVisible("fhdskjfSS$$22", R.id.editText);
    }

    @Test
    public void buttonIsClickable() {
        DoStuff.clickItemWithId(R.id.button);
    }

    @Test
    public void buttonWorks() {
        textFieldIsEditable();
        buttonIsClickable();
        try {
            DoStuff.textIsVisible("weak password");
        } catch (Exception e) {
            DoStuff.textIsVisible("Good one!");
        }

    }

}
