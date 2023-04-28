package org.wikipedia.tinkoff.screens


import android.view.KeyEvent
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
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import org.awaitility.Awaitility
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.anyOf
import org.hamcrest.Matchers.not
import org.wikipedia.R


class LoginPage {

    private val device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
    private val passwordInput = withId(R.id.create_account_password_input)
    private val textInputEndIcon = withId(com.google.android.material.R.id.text_input_end_icon)
    private val createAccountSubmit = withId(R.id.create_account_submit_button)
    private val password = anyOf(withHint("Пароль"), withHint("Password"))
    private val repeatPassword = anyOf(withHint("Повторите пароль"), withHint("Repeat password"))
    private val warningPassword = anyOf(withText("Пароль должен состоять не менее чем из 8 символов."), withText("The password must be at least 8 characters"))
    private val userName = anyOf(withHint("Имя участника"), withHint("Username"))
    private val userNameType = "surnin26"
    private val sevenDigit = "1111111"
    private val eightDigit = "11111111"


    fun typePassword() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(password)
                .perform(typeText(eightDigit))
        }
    }

    fun typeUsername() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(userName)
                .perform(typeText(userNameType))
            device.pressKeyCode(KeyEvent.KEYCODE_BACK)
        }
    }

    fun typePasswordLessThan() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(password)
                .perform(typeText(sevenDigit))
            onView(repeatPassword).perform(typeText(sevenDigit))
        }
    }

    fun pressEye() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(
                allOf(
                    textInputEndIcon, isDescendantOfA(
                        passwordInput
                    )
                )
            ).perform(click())
        }
    }

    fun checkPasswordDisplayed() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(withText(eightDigit))
                .check(matches(isDisplayed()))
        }
    }

    fun checkWrongPassword() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(warningPassword).check(
                matches(
                    isDisplayed()
                )
            ).check(matches(anyOf(hasTextColor(R.color.red700), hasTextColor(R.color.red500))))
        }
    }

    fun checkPasswordNotDisplayed() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(
                allOf(
                    textInputEndIcon,
                    isDescendantOfA(passwordInput)
                )
            ).check(matches(not(withText(eightDigit))));
        }
    }

    fun pressNext() {
        Awaitility.await().atMost(java.time.Duration.ofSeconds(5)).untilAsserted {
            onView(createAccountSubmit).perform(click())
        }
    }
}