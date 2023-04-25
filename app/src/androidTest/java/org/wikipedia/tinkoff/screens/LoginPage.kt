package org.wikipedia.tinkoff.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withHint
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.not
import org.wikipedia.R

class LoginPage {

    fun typePassword() {
        onView(withHint("Пароль")).perform(typeText("11111111"))
    }

    fun pressEye() {
        onView(allOf(withId(com.google.android.material.R.id.text_input_end_icon), isDescendantOfA(
            withId(R.id.create_account_password_input)))).perform(click())
    }

    fun checkPasswordDisplayed() {
        onView(withText("11111111")).check(matches(isDisplayed()))
    }

    fun checkPasswordNotDisplayed() {
        onView(allOf(withId(com.google.android.material.R.id.text_input_end_icon), isDescendantOfA(withId(R.id.create_account_password_input)))).check(matches(not(withText("11111111"))));
    }
}