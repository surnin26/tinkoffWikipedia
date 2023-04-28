package org.wikipedia.tinkoff.e

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity
import org.wikipedia.tinkoff.screens.GeneralScreen
import org.wikipedia.tinkoff.screens.LoginPage
import org.wikipedia.tinkoff.screens.Menu
import org.wikipedia.tinkoff.screens.OnboardPage

class Validate {

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