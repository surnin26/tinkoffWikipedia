package org.wikipedia.tinkoff.e

import android.view.KeyEvent
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import androidx.test.uiautomator.UiDevice
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity
import org.wikipedia.tinkoff.screens.LoginPage
import org.wikipedia.tinkoff.screens.Menu
import org.wikipedia.tinkoff.screens.OnboardPage

class Validation {



    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkValidation() {
        OnboardPage().navigateToMainPage()
        Menu().openEtc()
        Menu().enterInWikipedia()
        LoginPage().typePasswordLessThan()
        LoginPage().typeUsername()
        LoginPage().pressNext()
        LoginPage().checkWrongPassword()
    }
}