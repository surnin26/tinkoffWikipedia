package org.wikipedia.tinkoff.c

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.wikipedia.main.MainActivity
import org.wikipedia.tinkoff.screens.GeneralScreen
import org.wikipedia.tinkoff.screens.Menu
import org.wikipedia.tinkoff.screens.OnboardPage
import org.wikipedia.tinkoff.screens.Settings

@RunWith(AndroidJUnit4::class)
class Browser {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun browserLaunch() {
        OnboardPage().navigateToMainPage()
        Menu().openSettings()
        Settings().scroll()
        Settings().clickOnPolicyAndCheckBrowser()
        GeneralScreen().pressBack()
    }
}