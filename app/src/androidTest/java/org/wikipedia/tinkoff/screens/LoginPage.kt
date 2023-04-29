package org.wikipedia.tinkoff.screens


import androidx.test.espresso.Espresso.closeSoftKeyboard
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
import org.awaitility.Awaitility
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.anyOf
import org.hamcrest.Matchers.not
import org.wikipedia.R


class LoginPage {

    private val passwordInput = withId(R.id.create_account_password_input)
    private val textInputEndIcon = withId(com.google.android.material.R.id.text_input_end_icon)
    private val createAccountSubmit = withId(R.id.create_account_submit_button)
    private val warningPassword = withText(R.string.create_account_password_error)
    private val red = anyOf(hasTextColor(R.color.red700), hasTextColor(R.color.red500))

    fun typePassword() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(anyOf(withHint("Пароль"), withHint("Password")))
                .perform(typeText("1234567"))
            closeSoftKeyboard()
        }
    }

    fun typeUsername() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(anyOf(withHint("Имя участника"), withHint("Username")))
                .perform(typeText("surnin26"))
            closeSoftKeyboard()
        }
    }

    fun typePasswordLessThan() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(anyOf(withHint("Пароль"), withHint("Password")))
                .perform(typeText("1234567"))
            onView(anyOf(withHint("Repeat password"), withHint("Повторите пароль")))
                .perform(typeText("1234567"))
        }
    }

    fun pressEye() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(allOf(textInputEndIcon, isDescendantOfA(passwordInput)))
                .perform(click())
        }
    }

    fun checkPasswordDisplayed() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(withText("1234567"))
                .check(matches(isDisplayed()))
        }
    }

    fun checkWrongPassword() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(warningPassword)
                .check(matches(isDisplayed()))
                .check(matches(red))
        }
    }

    fun checkPasswordNotDisplayed() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(allOf(textInputEndIcon, isDescendantOfA(passwordInput)))
                .check(matches(not(withText("1234567"))))
        }
    }

    fun pressNext() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(createAccountSubmit)
                .perform(click())
        }
    }
}