package org.wikipedia.tinkoff.d

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity
import org.wikipedia.tinkoff.screens.LoginPage
import org.wikipedia.tinkoff.screens.Menu
import org.wikipedia.tinkoff.screens.OnboardPage

class Eye {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private val onboardPage = OnboardPage()
    private val menu = Menu()
    private val loginPage = LoginPage()


    @Test
    fun checkEye() {
        onboardPage.navigateToMainPage()
        menu.openEtc()
        menu.enterInWikipedia()
        loginPage.typePassword()
        loginPage.pressEye()
        loginPage.checkPasswordDisplayed()
        loginPage.pressEye()
        loginPage.checkPasswordNotDisplayed()
    }
}