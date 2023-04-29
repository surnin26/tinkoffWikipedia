package org.wikipedia.tinkoff.d

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.wikipedia.main.MainActivity
import org.wikipedia.tinkoff.screens.LoginPage
import org.wikipedia.tinkoff.screens.Menu
import org.wikipedia.tinkoff.screens.OnboardPage

@RunWith(AndroidJUnit4::class)
class Eye {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkEye() {
        OnboardPage().navigateToMainPage()
        Menu().openEtc()
        Menu().enterInWikipedia()
        LoginPage().typePassword()
        LoginPage().pressEye()
        LoginPage().checkPasswordDisplayed()
        LoginPage().pressEye()
        LoginPage().checkPasswordNotDisplayed()
    }
}