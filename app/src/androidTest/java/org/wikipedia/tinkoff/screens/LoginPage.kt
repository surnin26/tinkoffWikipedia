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
import org.awaitility.Awaitility.await
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.anyOf
import org.hamcrest.Matchers.not
import org.wikipedia.R
import java.time.Duration


class LoginPage {

    private val passwordInput = withId(R.id.create_account_password_input)
    private val textInputEndIcon = withId(com.google.android.material.R.id.text_input_end_icon)
    private val createAccountSubmit = withId(R.id.create_account_submit_button)
    private val warningPassword = withText(R.string.create_account_password_error)
    private val red = anyOf(hasTextColor(R.color.red700), hasTextColor(R.color.red500)) // разные цвета для темной и светлой тем
    private val anyOfPassword = anyOf(withHint("Пароль"), withHint("Password"))

    fun typePassword() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(anyOfPassword)
                .perform(typeText("1234567"))
            closeSoftKeyboard()
        }
    }

    fun typeUsername() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(anyOf(withHint("Имя участника"), withHint("Username")))
                .perform(typeText("surnin26"))
            closeSoftKeyboard()
        }
    }

    fun typePasswordLessThan() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(anyOfPassword)
                .perform(typeText("1234567"))
            onView(anyOf(withHint("Repeat password"), withHint("Повторите пароль")))
                .perform(typeText("1234567"))
        }
    }

    fun pressEye() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(allOf(textInputEndIcon, isDescendantOfA(passwordInput)))
                .perform(click())
        }
    }

    fun checkPasswordDisplayed() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(withText("1234567"))
                .check(matches(isDisplayed()))
        }
    }

    fun checkWrongPassword() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(warningPassword)
                .check(matches(isDisplayed()))
                .check(matches(red))
        }
    }

    fun checkPasswordNotDisplayed() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(allOf(textInputEndIcon, isDescendantOfA(passwordInput)))
                .check(matches(not(withText("1234567"))))
        }
    }

    fun pressNext() {
        await().atMost(Duration.ofSeconds(5)).untilAsserted {
            onView(createAccountSubmit)
                .perform(click())
        }
    }
}