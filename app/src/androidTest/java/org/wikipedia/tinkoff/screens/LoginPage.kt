package org.wikipedia.tinkoff.screens


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasTextColor
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withHint
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import android.graphics.Color
import androidx.test.espresso.matcher.ViewMatchers.withSubstring

import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.anyOf
import org.hamcrest.Matchers.not
import org.wikipedia.R


class LoginPage {

    private val passwordInput = withId(R.id.create_account_password_input)
    private val textInputEndIcon = withId(com.google.android.material.R.id.text_input_end_icon)
    private val createAccountSubmit = withId(R.id.create_account_submit_button)

    fun typePassword() {
        onView(anyOf(withHint("Пароль"), withHint("Password")))
            .perform(typeText("11111111"))
    }

    fun typeUsername() {
        onView(anyOf(withHint("Имя участника"), withHint("Username")))
            .perform(typeText("surnin26"))
    }

    fun typePasswordLessThan() {
        onView(anyOf(withHint("Пароль"), withHint("Password")))
            .perform(typeText("1111111"))
        onView(
            anyOf(
                withHint("Повторите пароль"),
                withHint("Repeat password")
            )
        ).perform(typeText("1111111"))
    }

    fun pressEye() {
        onView(
            allOf(
                textInputEndIcon, isDescendantOfA(
                    passwordInput
                )
            )
        ).perform(click())
    }

    fun checkPasswordDisplayed() {
        onView(withText("11111111"))
            .check(matches(isDisplayed()))
    }

    fun checkWrongPassword() {
        onView(
            anyOf(
                withText("Пароль должен состоять не менее чем из 8 символов."),
                withText("The password must be at least 8 characters")
            )
        ).check(
            matches(
                isDisplayed()
            )
        ).check(matches(hasTextColor(R.color.red700)))
    }

    fun checkPasswordNotDisplayed() {
        onView(
            allOf(
                textInputEndIcon,
                isDescendantOfA(passwordInput)
            )
        ).check(matches(not(withText("11111111"))));
    }

    fun pressNext() {
        onView(createAccountSubmit).perform(click())
    }
}