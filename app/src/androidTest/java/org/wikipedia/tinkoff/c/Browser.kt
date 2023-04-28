package org.wikipedia.tinkoff.c

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity
import org.wikipedia.tinkoff.screens.GeneralScreen
import org.wikipedia.tinkoff.screens.Menu
import org.wikipedia.tinkoff.screens.OnboardPage
import org.wikipedia.tinkoff.screens.Settings
import java.lang.Exception

class Browser {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun browserStartup() {
        OnboardPage().navigateToMainPage()
        Menu().openSettings()
        Settings().scroll()
        Settings().clickOnPolicy()
        GeneralScreen().browserOnScreen()
        GeneralScreen().pressBack()
    }
}