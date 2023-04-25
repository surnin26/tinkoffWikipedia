package org.wikipedia.tinkoff.a

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity
import org.wikipedia.tinkoff.screens.Menu
import org.wikipedia.tinkoff.screens.OnboardPage
import org.wikipedia.tinkoff.screens.Settings
import org.wikipedia.tinkoff.screens.SettingsFeed

class Feed {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private val onboardPage = OnboardPage()
    private val menu = Menu()
    private val settings = Settings()
    private val settingsFeed = SettingsFeed()

    @Test
    fun feedSettingsCheck() {
        onboardPage.navigateToMainPage()
        menu.openSettings()
        settings.openFeedSettings()
        settingsFeed.verifyFeedOptions()
        settings.scrollToDown()
        settingsFeed.verifyAdditionalFeedOptions()
    }
}