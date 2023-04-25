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

class Browser {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private val onboardPage = OnboardPage()
    private val menu = Menu()
    private val settingsForScroll = Settings()
    private val settings = Settings()
    private val generalScreen = GeneralScreen()

    @Test
    fun browserStartup() {
        onboardPage.navigateToMainPage()
        menu.openSettings()
        settingsForScroll.scrollToDown()
        settings.clickOnPolicy()
        generalScreen.browserOnScreen()
    }
}