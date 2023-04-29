package org.wikipedia.tinkoff.a

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.wikipedia.main.MainActivity
import org.wikipedia.tinkoff.screens.Menu
import org.wikipedia.tinkoff.screens.OnboardPage
import org.wikipedia.tinkoff.screens.Settings
import org.wikipedia.tinkoff.screens.SettingsFeed

@RunWith(AndroidJUnit4::class)
class Feed {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun feedSettingsCheck() {
        OnboardPage().navigateToMainPage()
        Menu().openSettings()
        Settings().openFeedSettings()
        SettingsFeed().verifyFeedOptions()
    }
}