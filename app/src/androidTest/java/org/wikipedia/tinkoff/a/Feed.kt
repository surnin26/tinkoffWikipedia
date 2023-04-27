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

    @Test
    fun feedSettingsCheck() {
        OnboardPage().navigateToMainPage()
        Menu().openSettings()
        Settings().openFeedSettings()
        SettingsFeed().verifyFeedOptions()
        Settings().scrollToDown(10)
        Settings().scrollToDown(5)
        SettingsFeed().verifyAdditionalFeedOptions()
    }
}