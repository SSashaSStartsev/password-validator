package com.example.alexa.password_validator;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

/**
 * Created by alexa on 5/28/2017.
 *
 * Does stuff. looks pretty thou.
 */

class DoStuff {

    static void clickItemWithId(int id) { onView(withId(id)).perform(click()); }


    static void type(int id, String text){
        onView(withId(id)).perform(typeText(text));
    }
    static void textInViewIsVisible(String text, int viewId){
        onView(allOf(withId(viewId),withText(text))).check(matches(isDisplayed()));
    }

    static void textIsVisible(String text) {
        onView(withText(text)).check(matches(isDisplayed()));
    }
}
