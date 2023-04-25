package org.wikipedia.tinkoff.e

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity
import org.wikipedia.tinkoff.screens.LoginPage
import org.wikipedia.tinkoff.screens.Menu
import org.wikipedia.tinkoff.screens.OnboardPage

class Validation {


    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private val onboardPage = OnboardPage()
    private val menu = Menu()
    private val loginPage = LoginPage()


    @Test
    fun checkValidation() {
        onboardPage.navigateToMainPage()
        menu.openEtc()
        menu.enterInWikipedia()
        loginPage.typePasswordLessThan()
        loginPage.typeUsername()
        loginPage.pressNext()
        loginPage.checkWrongPassword()
//        loginPage.checkRed() не могу догадаться как сверить красный цвет
    }
}